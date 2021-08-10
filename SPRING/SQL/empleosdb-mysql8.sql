-- Script para crear la base de datos empleosdb (MySQL 8.0)

DROP TABLE IF EXISTS `Categorias`;
CREATE TABLE `Categorias` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `Perfiles`;
CREATE TABLE `Perfiles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `perfil` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `Usuarios`;
CREATE TABLE `Usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(100) NOT NULL,
  `estatus` int NOT NULL DEFAULT '1',
  `fechaRegistro` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `Vacantes`;
CREATE TABLE `Vacantes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `descripcion` text NOT NULL,
  `fecha` date NOT NULL,
  `salario` double NOT NULL,
  `estatus` enum('Creada','Aprobada','Eliminada') NOT NULL,
  `destacado` int NOT NULL,
  `imagen` varchar(250) NOT NULL,
  `detalles` text,
  `idCategoria` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_vacantes_categorias1_idx` (`idCategoria`),
  CONSTRAINT `fk_vacantes_categorias1` FOREIGN KEY (`idCategoria`) REFERENCES `Categorias` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `Solicitudes`;
CREATE TABLE `Solicitudes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `archivo` varchar(250) NOT NULL,
  `comentarios` text,
  `idVacante` int NOT NULL,
  `idUsuario` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Vacante_Usuario_UNIQUE` (`idVacante`,`idUsuario`),
  KEY `fk_Solicitudes_Vacantes1_idx` (`idVacante`),
  KEY `fk_Solicitudes_Usuarios1_idx` (`idUsuario`),
  CONSTRAINT `fk_Solicitudes_Usuarios1` FOREIGN KEY (`idUsuario`) REFERENCES `Usuarios` (`id`),
  CONSTRAINT `fk_Solicitudes_Vacantes1` FOREIGN KEY (`idVacante`) REFERENCES `Vacantes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `UsuarioPerfil`;
CREATE TABLE `UsuarioPerfil` (
  `idUsuario` int NOT NULL,
  `idPerfil` int NOT NULL,
  UNIQUE KEY `Usuario_Perfil_UNIQUE` (`idUsuario`,`idPerfil`),
  KEY `fk_Usuarios1_idx` (`idUsuario`),
  KEY `fk_Perfiles1_idx` (`idPerfil`),
  CONSTRAINT `fk_Usuarios1` FOREIGN KEY (`idUsuario`) REFERENCES `Usuarios` (`id`),
  CONSTRAINT `fk_Perfiles1` FOREIGN KEY (`idPerfil`) REFERENCES `Perfiles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

