-- Insertamos 2 usuarios
INSERT INTO `Usuarios` VALUES (2,'Luis Esparza Gomez','luis@itinajero.net','luis','{noop}luis123',1,'2019-06-10');
INSERT INTO `Usuarios` VALUES (3,'Marisol Salinas Rodarte','marisol@itinajero.net','marisol','{noop}mari123',1,'2019-06-10');

-- Insertamos los roles para los usuarios
INSERT INTO `UsuarioPerfil` VALUES (2, 1); -- PERFIL SUPERVISOR
INSERT INTO `UsuarioPerfil` VALUES (3, 2); -- PERFIL ADMINISTRADOR