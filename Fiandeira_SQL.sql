
/* CREAR FIANDEIRA */

CREATE DATABASE IF NOT EXISTS `Fiandeira` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `Fiandeira`;

/* Escructura Categoria */
CREATE TABLE IF NOT EXISTS `categorias` (
`cod` int(11) NOT NULL COMMENT 'Codigo de categoria',
`nombre` varchar(50) NOT NULL COMMENT 'Codigo de nome de categoria'
);

/* Escructura FormularioContacto */
CREATE TABLE IF NOT EXISTS `formularioContacto` (
`cod` int(11) NOT NULL COMMENT 'Codigo de Contacto',
  `nombre` varchar(100) NOT NULL COMMENT 'Nombre de Persona de Contacto',
  `mail` varchar(100) NOT NULL COMMENT 'Correo de Respuesta',
  `telefono` int(11) DEFAULT NULL COMMENT 'Número de telefono no obligatorio',
  `pregunta` text NOT NULL COMMENT 'Pregunta',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Fecha de consulta',
  `contestado` tinyint(1) NOT NULL DEFAULT '0'
);

/* Escructura Newsleter */
CREATE TABLE IF NOT EXISTS `newsleter` (
`cod` int(11) NOT NULL COMMENT 'Cod de newsletter',
  `mail` varchar(100) NOT NULL COMMENT 'Dir de correo electronico',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Fecha',
  `permitir` tinyint(1) NOT NULL DEFAULT '1' COMMENT 'Permitir enviar Correo'
);

/* Estructura Productos */
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
);

/* Estructura ProductosTicket */
CREATE TABLE IF NOT EXISTS `productosTicket` (
  `codTicket` int(11) NOT NULL COMMENT 'Codigo refernciado de Ticket',
  `codProducto` varchar(40) NOT NULL COMMENT 'Codigo referenciado de Productos',
  `stock` int(11) NOT NULL COMMENT 'stock',
  `descuento` int(11) NOT NULL COMMENT 'Descuento en producto',
  `precioIVA` double NOT NULL COMMENT 'Precio sin IVA',
  `PrecioFinProducto` double NOT NULL COMMENT 'Precio Calculado de Precio Producto'
);

/* Estructura TablaSerial */
CREATE TABLE IF NOT EXISTS `tablaSerial` (
  `serial` varchar(50) NOT NULL,
  `fechaCreacion` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `usada` tinyint(4) NOT NULL DEFAULT '0'
);

/* Estructura Tendas */
CREATE TABLE IF NOT EXISTS `tendas` (
`cod` int(11) NOT NULL COMMENT 'Codigo Tenda',
  `nomeTenda` varchar(100) NOT NULL COMMENT 'Nome Tenda',
  `dir1` varchar(100) NOT NULL COMMENT 'Campo direccion 1',
  `dir2` varchar(100) NOT NULL COMMENT 'Campo direccion 2'
);

/* DATOS TENDA */
INSERT INTO `tendas` (`cod`, `nomeTenda`, `dir1`, `dir2`) VALUES
(1, 'FIANDEIRA A Estrada', 'Calvo Sotelo Nº 29 BAIXO', '36680 Pontevedra');

/* Escturctura Ticket */
CREATE TABLE IF NOT EXISTS `ticket` (
`cod` int(11) NOT NULL COMMENT 'Código de Ticket',
  `codVendedor` int(11) NOT NULL COMMENT 'Código de vendedor',
  `estado` varchar(10) NOT NULL COMMENT 'Estado de ticket pagado/guardado',
  `alias` varchar(30) DEFAULT NULL COMMENT 'Nombre para guardar Ticket',
  `modoPago` varchar(10) DEFAULT NULL COMMENT 'Tarjeta/Contado',
  `precioFinal` double DEFAULT NULL COMMENT 'Precio con IVA Final',
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

/* Estructura Usuarios */
CREATE TABLE IF NOT EXISTS `usuarios` (
`cod` int(11) NOT NULL COMMENT 'Codigo de usuario',
  `usuario` varchar(20) NOT NULL COMMENT 'Nombre de Usuario',
  `nombre` varchar(100) NOT NULL COMMENT 'Nombre de Usuario',
  `apellidos` varchar(100) NOT NULL COMMENT 'Apellidos de usuario',
  `mail` varchar(100) NOT NULL COMMENT 'Direccion email dependiente',
  `contrasena` varchar(128) NOT NULL COMMENT 'Campo contraseña',
  `verificado` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'Usuario Verificado',
  `admin` tinyint(4) NOT NULL DEFAULT '0' COMMENT 'Admin de programa'
);

/* DATOS USUARIOS */
INSERT INTO `usuarios` (`cod`, `usuario`, `nombre`, `apellidos`, `mail`, `contrasena`, `verificado`, `admin`) VALUES
(22, 'admin', 'admin', 'admin', 'admin@fiandeira.es', '1325f04d75d9a455279e45fdceb19dcc59286b26', 1, 1),
(32, 'manu', 'Manuel ', 'Reyes ', 'manureyesi@outlook.es', '1325f04d75d9a455279e45fdceb19dcc59286b26', 1, 1);


ALTER TABLE `categorias`
 ADD PRIMARY KEY (`cod`), ADD UNIQUE KEY `nombre` (`nombre`);

ALTER TABLE `formularioContacto`
 ADD PRIMARY KEY (`cod`);

ALTER TABLE `newsleter`
 ADD PRIMARY KEY (`cod`);

ALTER TABLE `productos`
 ADD PRIMARY KEY (`cod`), ADD KEY `codCategoria` (`codCategoria`);

ALTER TABLE `productosTicket`
 ADD PRIMARY KEY (`codTicket`,`codProducto`), ADD KEY `codProducto` (`codProducto`);

ALTER TABLE `tablaSerial`
 ADD PRIMARY KEY (`serial`);

ALTER TABLE `tendas`
 ADD PRIMARY KEY (`cod`);

ALTER TABLE `ticket`
 ADD PRIMARY KEY (`cod`), ADD KEY `Vendedor` (`codVendedor`);

ALTER TABLE `usuarios`
 ADD PRIMARY KEY (`cod`);

ALTER TABLE `categorias`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de categoria';

ALTER TABLE `formularioContacto`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de Contacto';

ALTER TABLE `newsleter`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Cod de newsletter';

ALTER TABLE `tendas`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo Tenda';

ALTER TABLE `ticket`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Código de Ticket';

ALTER TABLE `usuarios`
MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Codigo de usuario';

ALTER TABLE `productos`
ADD CONSTRAINT `productos_ibfk_1` FOREIGN KEY (`codCategoria`) REFERENCES `categorias` (`cod`);

ALTER TABLE `productosTicket`
ADD CONSTRAINT `productosTicket_ibfk_1` FOREIGN KEY (`codTicket`) REFERENCES `ticket` (`cod`),
ADD CONSTRAINT `productosTicket_ibfk_2` FOREIGN KEY (`codProducto`) REFERENCES `productos` (`cod`);

ALTER TABLE `ticket`
ADD CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`codVendedor`) REFERENCES `usuarios` (`cod`);

