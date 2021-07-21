/* RUTAS CON AUTENTIFICACIÓN */

// importar de express el router / destructuramos con {}
const { Router } = require('express');
const { crearUsuario, loginUsuario, reValidarToken } = require('../controllers/auth.controller');

// Asignamos a la constante router la importacion
const router = Router();


/* PETICIONES */

// Peticion -> Crear un nuevo usuario
router.post('/new', crearUsuario );


// Peticion -> Login de usuario
router.post('/', loginUsuario);


// Peticion -> Validar y revalidar token del usuario
router.get('/renew', reValidarToken );


// Exportar en NodeJS
module.exports = router;