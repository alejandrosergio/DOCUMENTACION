// Importamos - Obtener el tipado de express en la respuesta
const { response } = require('express');


/* CONTROLADORES */


// controlador de crear usuario
const crearUsuario  = (req , res = response) => {

    const { name, email, password } = req.body;

    return res.json({
        ok: true,
        msg: 'Crear usuario /new'
    });

};


// controlador login usuario
const loginUsuario  = (req , res = response) => {

    const { email, password } = req.body;

    return res.json({
        ok: true,
        msg: 'Login de usuario /'
    });

};


// controlador validar token o revalidar el token
const reValidarToken  = (req , res = response) => {

    return res.json({
        ok: true,
        msg: 'renew'
    });

};


// exportar controladores
module.exports = {
    crearUsuario,
    loginUsuario,
    reValidarToken
}