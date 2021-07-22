'use strict';


/* IMPORTACIONES */

// Importar express - framework en NodeJS
const express = require('express');

// Import cors - cors se ejecuta como cualquier otro middleware
const cors = require('cors');

// Import la conexion de la base de datos
const { dbConnection } = require('./DB/config');

// Importar de forma rapida
require('dotenv').config(); // -> toma la configuracion por defecto del .env


// Crear el servidor / aplicación de express
const app = express();


// Conectarnos a la Base de Datos
dbConnection();


// Directorio público // app -> middleware
app.use( express.static('public') );


// CORS - Intercambio de Recursos de Origen Cruzado
app.use( cors() );


// Lectura y parseo del body
app.use( express.json() );


// CONFIGURACION DE RUTA / IMPORTAR LAS RUTAS
app.use('/api/auth', require('./routes/auth.routes') );


// Levantar aplicación de express / puerto 4000 puede cambiar
app.listen( process.env.PORT, () => {
    console.log(`Servidor corriendo en el puerto ${process.env.PORT}`);
});