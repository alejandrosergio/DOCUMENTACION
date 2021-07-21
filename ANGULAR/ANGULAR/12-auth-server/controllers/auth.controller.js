'use strict';

// Importamos - Obtener el tipado de express en la respuesta
const { response } = require('express');

// Importamos el modelo de usuario
const Usuario = require('../models/Usuario');

// Importabos el bcryptjs para encryptar las contraseñas
const bcrypt = require('bcryptjs');

// Importabos el generarJWT para generar un JWT
const { generarJWT } = require('../helpers/jwt');

/* CONTROLADORES */


// controlador de crear usuario
const crearUsuario  = async (req , res = response) => { // async funcion asincrona 

    const { name, email, password } = req.body;

    try {

    // Verificar que el email sea unico
    const usuario = await Usuario.findOne({ email }); // busca si existe un usuario con ese email

    if ( usuario ) {
        return res.status(400).json({
            ok: false,
            msg: 'Ya existe este email en la base de datos'
        });
    }

    // Crear usuario con el modelo
    const dbUser = new Usuario( req.body );

    // Hashear la constraseña (encryptar)
    const salt = bcrypt.genSaltSync(); // numero de vualtas a dar para generar el hash (10)
    dbUser.password = bcrypt.hashSync( password, salt );

    // Generar Json Web Token
    const token = await generarJWT( dbUser.id, name );

    // Crear usuario en Base de datos
    await dbUser.save();

    // Generar respuesta exitosa
    return res.status(201).json({
        ok: true,
        uid: dbUser.id,
        name,
        password,
        token
    });

    } catch (error) {
        return res.status(500).json({
            ok: false,
            msg: 'Por favor hable con el administrador'
        });

    }

};


// controlador login usuario
const loginUsuario  = async (req , res = response) => {

    const { email, password } = req.body;

    try {
        
        const dbUser = await Usuario.findOne({ email });

        if ( !dbUser ) {
            return res.status(400).json({
                ok: false,
                msg: 'El correo no existe'
            });
        }

        // Confirmar si las password hacen match
        const validPassword = bcrypt.compareSync( password, dbUser.password );

        if ( !validPassword ) {
            return res.status(400).json({
                ok: false,
                msg: 'El password no es válido'
            });
        }

        // Generar el JWT
        const token = await generarJWT( dbUser.id, dbUser.name );

        // respuesta del servicio
        return res.json({
            ok: true,
            uid: dbUser.id,
            name: dbUser.name,
            token
        });

    } catch (error) {
        console.log(error);
        return res.status(500).json({
            ok: false,
            msg: 'Por favor hable con el administrador'
        });
    }

};


// controlador validar token o revalidar el token
const reValidarToken  = async (req , res = response) => {

    const { uid, name } = req;

    // Generar el JWT
    const token = await generarJWT( uid, name );

    return res.json({
        ok: true,
        uid,
        name,
        token
    });

};


// exportar controladores
module.exports = {
    crearUsuario,
    loginUsuario,
    reValidarToken
}