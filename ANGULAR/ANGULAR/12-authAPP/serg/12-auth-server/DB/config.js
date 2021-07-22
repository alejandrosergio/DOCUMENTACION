'use strict';


/* CONECXION DATABASE */

// Importamos en una constante el mongoose
const  mongoose  = require("mongoose");

// Creamos el middleware de conexion
const dbConnection = async() => { // async -> la aplicacion no continue hasta hacer la conexion con la BD

    try { // Establecer conexion

        await mongoose.connect( process.env.BD_CNN, { // await -> esperar que resuelva esa promesa
            useNewUrlParser: true,
            useUnifiedTopology: true,
            useCreateIndex: true
        });

        console.log('DATABASE OLINE');

    } catch (error) { // si hay error en la conexion

        console.log(error);
        throw new Error('ERROR DATABASE START'); // Evita que se levante la aplicacion porque hay errores

    }

}

// Exportamos el middleware de la conexion

module.exports = {
    dbConnection
}