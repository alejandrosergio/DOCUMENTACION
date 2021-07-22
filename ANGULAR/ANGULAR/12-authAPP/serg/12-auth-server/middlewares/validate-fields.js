'use strict';

// Importamos - Obtener el tipado de express en la respuesta
const { response } = require('express');

// Importamos - obtener los errores del req
const { validationResult } = require('express-validator');


// Construimos el middleware para validar campos
const validaCampos = ( req , res = response, next ) => {

    const errors = validationResult( req ); // Guardamos los errores de la petición

    if ( !errors.isEmpty() ) { // Si llega algun error retornamos el error
        return res.status(400).json({
            ok: false,
            error: errors.mapped() // nos enseña el error del check
        });
    }

    next(); // Si todo sale bien invocamos esta funcion para proceder con el siguiente middleware

}

// Exportamos el middleware para validar campos
module.exports = {
    validaCampos
}