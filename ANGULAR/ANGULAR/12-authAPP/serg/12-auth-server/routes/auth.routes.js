/* RUTAS CON AUTENTIFICACIÓN */

// importar de express el router / destructuramos con {}
const { Router } = require('express');

// importar de express-validator / destructuramos con {}
const { check } = require('express-validator');

// importar controladores / destructuramos con {}
const { crearUsuario, loginUsuario, reValidarToken } = require('../controllers/auth.controller');

// Importamos el middleware para validar campos
const { validaCampos } = require('../middlewares/validate-fields');

// Asignamos a la constante router la importacion
const router = Router();


/* PETICIONES */

// router.request('ruta', middleware's , controlador );

// Peticion -> Crear un nuevo usuario
router.post(
    '/new', 
    [
        check('name', 'El campo name es obligatorio').not().isEmpty().isLength( {min: 3} ),
        check('email', 'El campo email es obligatorio').isEmail(),
        check('password', 'El campo password es obligatorio').isLength( {min: 6} ),
        validaCampos // middleware personalizado
    ],
    crearUsuario 
);


// Peticion -> Login de usuario
router.post(
    '/', 
    [
        check('email', 'El campo email es obligatorio').isEmail(),
        check('password', 'El campo password es obligatorio').isLength( {min: 6} ),
        validaCampos
    ],
    loginUsuario
    );


// Peticion -> Validar y revalidar token del usuario
router.get('/renew', reValidarToken );


// Exportar en NodeJS
module.exports = router;