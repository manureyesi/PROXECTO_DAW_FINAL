-- phpMyAdmin SQL Dump
-- version 4.2.12deb2+deb8u2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 18-04-2018 a las 22:17:53
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`cod`, `nombre`) VALUES
(2, 'botones'),
(1, 'hilos'),
(3, 'telas');

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
  `img` varchar(100) DEFAULT NULL COMMENT 'Direccion de IMG'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`cod`, `nombre`, `descripcion`, `codCategoria`, `precioSin`, `stock`, `img`) VALUES
('1', 'aaaaa', 'aaaaaa', 1, 2222, 17, NULL),
('111', 'aaaa', 'qqqqq', 2, 1111, 0, NULL),
('1111', 'Botones de Color Azul', 'Botones de color azul de tamaño 2 cm', 2, 12.2, 0, NULL),
('1111111', 'sass', 'asasasasa', 2, 22, 0, NULL),
('11qqqqq', '<a<xsxerccrc', 'xdcfvrgvrbtrv', 2, 111, 9, NULL),
('2', 'zazazaz', 'zaazazaaz', 2, 44, 47, NULL),
('222', 'sdsdsdsd', 'sdsdsds', 1, 222, 0, NULL),
('23333', 'aaqssadasddsadas', 'sadadasdsada', 3, 22, 2, NULL),
('3', 'xsxsxsx', 'xsxsxsx', 3, 55, 5, NULL),
('4', 'xsxsx', 'xsxsxsx', 3, 44, 32, NULL),
('5', 'cdscsdcsd', 'sdcsdcdsc', 1, 33, 34, NULL),
('6666', 'dsessewswe', '23qwwewweqww', 1, 44, 0, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productosTicket`
--

CREATE TABLE IF NOT EXISTS `productosTicket` (
  `codTicket` int(11) NOT NULL COMMENT 'Codigo refernciado de Ticket',
  `codProducto` varchar(40) NOT NULL COMMENT 'Codigo referenciado de Productos',
  `stock` int(11) NOT NULL COMMENT 'stock',
  `descuento` int(11) NOT NULL COMMENT 'Descuento en producto',
  `precioIVA` double NOT NULL COMMENT 'Precio sin IVA'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productosTicket`
--

INSERT INTO `productosTicket` (`codTicket`, `codProducto`, `stock`, `descuento`, `precioIVA`) VALUES
(7, '111', 1, 0, 1344.31),
(8, '1111', 4, 0, 14.76),
(9, '111', 1, 0, 1344.31),
(10, '1111', 4, 0, 14.76),
(11, '111', 6, 0, 1344.31),
(11, '1111111', 1, 0, 26.62),
(12, '111', 1, 0, 1344.31),
(14, '111', 1, 0, 1344.31),
(15, '111', 1, 0, 1344.31),
(16, '111', 1, 0, 1344.31),
(17, '111', 1, 0, 1344.31),
(17, '222', 4, 0, 268.62),
(17, '6666', 1, 0, 53.24),
(18, '23333', 1, 0, 26.62),
(19, '1111111', 1, 0, 26.62),
(20, '2', 1, 0, 53.24),
(20, '3', 1, 10, 66.55),
(21, '1', 1, 333, 2688.62),
(22, '1', 3, 0, 2688.62),
(23, '1', 1, 0, 2688.62),
(23, '2', 1, 0, 53.24),
(24, '1', 1, 0, 2688.62),
(25, '1', 1, 0, 2688.62),
(26, '1', 1, 0, 2688.62),
(27, '1', 1, 0, 2688.62);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tablaSerial`
--

CREATE TABLE IF NOT EXISTS `tablaSerial` (
  `serial` varchar(20) NOT NULL,
  `usada` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tablaSerial`
--

INSERT INTO `tablaSerial` (`serial`, `usada`) VALUES
('ADSM-2W2W-WSFE-3EW1', 1),
('ADSM-2W2W-WSFE-3EW2', 1),
('ADSM-2W2W-WSFE-3EW3', 1),
('ADSM-2W2W-WSFE-3EW5', 1),
('ADSM-2W2W-WSFE-3EW6', 0),
('ADSM-2W2W-WSFE-3EW7', 1),
('ADSM-2W2W-WSFE-3EW8', 1),
('ADSM-2W2W-WSFE-3EWQ', 1),
('NDX6-YM90-1GLR-PH69', 1),
('T02R-7062-W265-098J', 1);

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

--
-- Volcado de datos para la tabla `tendas`
--

INSERT INTO `tendas` (`cod`, `nomeTenda`, `dir1`, `dir2`) VALUES
(1, 'FIANDEIRA A Estrada', 'Calvo Sotelo Nº 29 BAIXO', '36680 Pontevedra');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ticket`
--

CREATE TABLE IF NOT EXISTS `ticket` (
`cod` int(11) NOT NULL COMMENT 'Código de Ticket',
  `codVendedor` int(11) NOT NULL COMMENT 'Código de vendedor',
  `estado` varchar(10) NOT NULL COMMENT 'Estado de ticket pagado/guardado',
  `modoPago` varchar(10) DEFAULT NULL COMMENT 'Tarjeta/Contado',
  `precioFinal` double DEFAULT NULL COMMENT 'Precio con IVA Final',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ticket`
--

INSERT INTO `ticket` (`cod`, `codVendedor`, `estado`, `modoPago`, `precioFinal`, `fecha`) VALUES
(3, 1, 'Iniciado', NULL, NULL, '0000-00-00 00:00:00'),
(4, 1, 'Iniciado', NULL, NULL, '0000-00-00 00:00:00'),
(5, 1, 'Iniciado', NULL, NULL, '0000-00-00 00:00:00'),
(6, 1, 'Iniciado', NULL, NULL, '0000-00-00 00:00:00'),
(7, 1, 'Iniciado', NULL, NULL, '2018-02-07 12:25:53'),
(8, 1, 'Iniciado', NULL, NULL, '2018-02-07 12:26:12'),
(9, 3, 'Iniciado', NULL, NULL, '2018-02-07 12:32:58'),
(10, 3, 'Iniciado', NULL, NULL, '2018-02-07 12:33:04'),
(11, 1, 'Iniciado', NULL, NULL, '2018-02-07 12:36:39'),
(12, 1, 'Iniciado', NULL, NULL, '2018-02-07 12:45:58'),
(13, 1, 'Iniciado', NULL, NULL, '2018-02-07 13:20:52'),
(14, 1, 'Iniciado', NULL, NULL, '2018-02-07 13:28:20'),
(15, 1, 'Iniciado', NULL, NULL, '2018-02-07 13:32:24'),
(16, 1, 'Iniciado', NULL, NULL, '2018-02-07 13:33:34'),
(17, 1, 'Iniciado', NULL, NULL, '2018-02-07 13:52:44'),
(18, 1, 'Iniciado', NULL, NULL, '2018-02-07 13:54:49'),
(19, 1, 'Iniciado', NULL, NULL, '2018-02-07 13:57:11'),
(20, 1, 'Iniciado', NULL, NULL, '2018-02-07 14:26:02'),
(21, 1, 'Iniciado', NULL, NULL, '2018-02-16 12:52:07'),
(22, 1, 'Iniciado', NULL, NULL, '2018-02-20 19:38:34'),
(23, 1, 'Iniciado', NULL, NULL, '2018-02-20 21:01:33'),
(24, 1, 'Iniciado', NULL, NULL, '2018-02-20 21:26:36'),
(25, 1, 'Iniciado', NULL, NULL, '2018-02-20 21:27:35'),
(26, 1, 'Iniciado', NULL, NULL, '2018-02-20 21:30:41'),
(27, 1, 'Iniciado', NULL, NULL, '2018-02-20 21:34:39');

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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`cod`, `usuario`, `nombre`, `apellidos`, `mail`, `contrasena`, `verificado`, `admin`) VALUES
(1, 'manu', 'Manuel', 'Reyes Iglesias', 'manu.couso97@gmail.com', '1325f04d75d9a455279e45fdceb19dcc59286b26', 1, 1),
(2, 'llaguito', 'Santiago', 'Losada Borrajo', 'dink04@hotmail.es', '1325f04d75d9a455279e45fdceb19dcc59286b26', 1, 0),
(3, 'alexis', 'Alexis', 'Sierra', 'cv.alexisjesus@gmail.com', '1325f04d75d9a455279e45fdceb19dcc59286b26', 1, 0),
(4, 'hilaaaa', 'manu', 'reyes', 'manu.couso97@gmail.com', '1325f04d75d9a455279e45fdceb19dcc59286b26', 1, 0),
(5, 'prueba1', 'Prueba1', 'Prueba1', 'manu.couso97@gmail.com', '1325f04d75d9a455279e45fdceb19dcc59286b26', 1, 0),
(6, 'manu222', 'Asaaaa ', 'Aaaaa ', 'manu.couso97@gmail.com', 'd0a0d4179fe1b3340af4cc1f1be3d2ae2d5ee653', 0, 0),
(7, 'holaaaa', 'Sass ', 'Ssssss ', 'manureyesi@outlook.es', 'af3e5426b7d4730441d061ee5cb0a7df60d8c300', 0, 0),
(8, 'holacara', 'Sasss ', 'S ', 'manureyesi@outlook.es', 'af3e5426b7d4730441d061ee5cb0a7df60d8c300', 0, 0),
(9, 'dwdawdwdad', 'Dwqedqwd ', 'Dqwdqd ', 'manureyesi@outlook.es', 'af3e5426b7d4730441d061ee5cb0a7df60d8c300', 0, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
 ADD PRIMARY KEY (`cod`), ADD UNIQUE KEY `nombre` (`nombre`);

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
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de categoria',AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `tendas`
--
ALTER TABLE `tendas`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo Tenda',AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `ticket`
--
ALTER TABLE `ticket`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Código de Ticket',AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de usuario',AUTO_INCREMENT=10;
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
