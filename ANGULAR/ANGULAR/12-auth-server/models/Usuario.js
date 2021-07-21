'use strict';

// Importamos Schema y model de mongoose.
const { Schema, model } = require("mongoose");


const UsuarioSchema = Schema({
    name: {
        type: String,
        required: true
    },
    email: {
        type: String,
        required: true,
        unique: true
    },
    password: {
        type: String,
        required: true
    }
});


// Exportamos nuestro modelo de usuario

module.exports = model('usuario', UsuarioSchema);



/* SCHEMA */

// Un esquema representa la estructura de un documento en particular, ya sea por completo o solo una parte del documento. Es una forma de expresar propiedades y valores esperados, así como restricciones e índices. Un modelo define una interfaz de programación para interactuar con la base de datos (leer, insertar, actualizar, etc.).

/* MODEL */

// Se encarga de darle nombre a la BD y enviarla con su estructura