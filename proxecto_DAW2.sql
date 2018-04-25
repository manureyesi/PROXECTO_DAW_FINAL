-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 25-04-2018 a las 16:49:24
-- Versión del servidor: 5.5.59-0+deb8u1
-- Versión de PHP: 5.6.33-0+deb8u1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `proxecto_DAW2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
`cod` int(11) NOT NULL COMMENT 'Codigo de usuario',
  `usuario` varchar(20) NOT NULL COMMENT 'Nombre de Usuario',
  `nombre` varchar(100) NOT NULL COMMENT 'Nombre de Usuario',
  `apellidos` varchar(100) NOT NULL COMMENT 'Apellidos de usuario',
  `mail` varchar(100) NOT NULL COMMENT 'Direccion email dependiente',
  `contrasena` varchar(128) NOT NULL COMMENT 'Campo contraseña',
  `verificado` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'Usuario Verificado',
  `admin` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'Admin de programa'
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`cod`, `usuario`, `nombre`, `apellidos`, `mail`, `contrasena`, `verificado`, `admin`) VALUES
(22, 'admin', 'admin', 'admin', 'admin@fiandeira.es', '1325f04d75d9a455279e45fdceb19dcc59286b26', 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
 ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de usuario',AUTO_INCREMENT=24;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
