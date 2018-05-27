-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 27-05-2018 a las 23:57:31
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
CREATE DATABASE IF NOT EXISTS `proxecto_DAW2` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `proxecto_DAW2`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE IF NOT EXISTS `categorias` (
`cod` int(11) NOT NULL COMMENT 'Codigo de categoria',
  `nombre` varchar(50) NOT NULL COMMENT 'Codigo de nome de categoria'
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `formularioContacto`
--

CREATE TABLE IF NOT EXISTS `formularioContacto` (
`cod` int(11) NOT NULL COMMENT 'Codigo de Contacto',
  `nombre` varchar(100) NOT NULL COMMENT 'Nombre de Persona de Contacto',
  `mail` varchar(100) NOT NULL COMMENT 'Correo de Respuesta',
  `telefono` int(11) DEFAULT NULL COMMENT 'Número de telefono no obligatorio',
  `pregunta` text NOT NULL COMMENT 'Pregunta',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Fecha de consulta',
  `contestado` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `newsleter`
--

CREATE TABLE IF NOT EXISTS `newsleter` (
`cod` int(11) NOT NULL COMMENT 'Cod de newsletter',
  `mail` varchar(100) NOT NULL COMMENT 'Dir de correo electronico',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Fecha',
  `permitir` tinyint(1) NOT NULL DEFAULT '1' COMMENT 'Permitir enviar Correo'
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE IF NOT EXISTS `productos` (
  `cod` varchar(40) NOT NULL COMMENT 'Codigo de producto',
  `nombre` varchar(100) NOT NULL COMMENT 'Nombre de producto',
  `descripcion` longtext COMMENT 'Descripcion del producto',
  `codCategoria` int(11) NOT NULL COMMENT 'Codigo de categoria',
  `precioSin` double NOT NULL COMMENT 'Precio IVA',
  `stock` int(11) NOT NULL COMMENT 'Cantidad de Stock',
  `img1` varchar(100) DEFAULT NULL COMMENT 'Imagen de Producto 1',
  `img2` varchar(100) DEFAULT NULL COMMENT 'Imagen de Producto 2',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Fecha'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productosTicket`
--

CREATE TABLE IF NOT EXISTS `productosTicket` (
  `codTicket` int(11) NOT NULL COMMENT 'Codigo refernciado de Ticket',
  `codProducto` varchar(40) NOT NULL COMMENT 'Codigo referenciado de Productos',
  `stock` int(11) NOT NULL COMMENT 'stock',
  `descuento` int(11) NOT NULL COMMENT 'Descuento en producto',
  `precioIVA` double NOT NULL COMMENT 'Precio sin IVA',
  `PrecioFinProducto` double NOT NULL COMMENT 'Precio Calculado de Precio Producto'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tablaSerial`
--

CREATE TABLE IF NOT EXISTS `tablaSerial` (
  `serial` varchar(50) NOT NULL,
  `fechaCreacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `usada` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tendas`
--

CREATE TABLE IF NOT EXISTS `tendas` (
`cod` int(11) NOT NULL COMMENT 'Codigo Tenda',
  `nomeTenda` varchar(100) NOT NULL COMMENT 'Nome Tenda',
  `dir1` varchar(100) NOT NULL COMMENT 'Campo direccion 1',
  `dir2` varchar(100) NOT NULL COMMENT 'Campo direccion 2'
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE IF NOT EXISTS `ticket` (
`cod` int(11) NOT NULL COMMENT 'Código de Ticket',
  `codVendedor` int(11) NOT NULL COMMENT 'Código de vendedor',
  `estado` varchar(10) NOT NULL COMMENT 'Estado de ticket pagado/guardado',
  `alias` varchar(30) DEFAULT NULL COMMENT 'Nombre para guardar Ticket',
  `modoPago` varchar(10) DEFAULT NULL COMMENT 'Tarjeta/Contado',
  `precioFinal` double DEFAULT NULL COMMENT 'Precio con IVA Final',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=latin1;

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
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
 ADD PRIMARY KEY (`cod`), ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `formularioContacto`
--
ALTER TABLE `formularioContacto`
 ADD PRIMARY KEY (`cod`);

--
-- Indices de la tabla `newsleter`
--
ALTER TABLE `newsleter`
 ADD PRIMARY KEY (`cod`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
 ADD PRIMARY KEY (`cod`), ADD KEY `codCategoria` (`codCategoria`);

--
-- Indices de la tabla `productosTicket`
--
ALTER TABLE `productosTicket`
 ADD PRIMARY KEY (`codTicket`,`codProducto`), ADD KEY `codProducto` (`codProducto`);

--
-- Indices de la tabla `tablaSerial`
--
ALTER TABLE `tablaSerial`
 ADD PRIMARY KEY (`serial`);

--
-- Indices de la tabla `tendas`
--
ALTER TABLE `tendas`
 ADD PRIMARY KEY (`cod`);

--
-- Indices de la tabla `ticket`
--
ALTER TABLE `ticket`
 ADD PRIMARY KEY (`cod`), ADD KEY `Vendedor` (`codVendedor`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
 ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categorias`
--
ALTER TABLE `categorias`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de categoria',AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `formularioContacto`
--
ALTER TABLE `formularioContacto`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de Contacto',AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT de la tabla `newsleter`
--
ALTER TABLE `newsleter`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Cod de newsletter',AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `tendas`
--
ALTER TABLE `tendas`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo Tenda',AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `ticket`
--
ALTER TABLE `ticket`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Código de Ticket',AUTO_INCREMENT=151;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de usuario',AUTO_INCREMENT=33;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `productos`
--
ALTER TABLE `productos`
ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`codCategoria`) REFERENCES `categorias` (`cod`);

--
-- Filtros para la tabla `productosTicket`
--
ALTER TABLE `productosTicket`
ADD CONSTRAINT `productosTicket_ibfk_1` FOREIGN KEY (`codTicket`) REFERENCES `ticket` (`cod`),
ADD CONSTRAINT `productosTicket_ibfk_2` FOREIGN KEY (`codProducto`) REFERENCES `productos` (`cod`);

--
-- Filtros para la tabla `ticket`
--
ALTER TABLE `ticket`
ADD CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`codVendedor`) REFERENCES `usuarios` (`cod`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
