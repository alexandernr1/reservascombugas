-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-11-2023 a las 17:13:51
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reserva`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idpersona` int(11) NOT NULL,
  `codigocliente` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`idpersona`, `codigocliente`) VALUES
(13, '12'),
(29, '19'),
(62, '21'),
(64, '25');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consumo`
--

CREATE TABLE `consumo` (
  `idconsumo` int(11) NOT NULL,
  `idereserva` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` decimal(7,2) NOT NULL,
  `precio_venta` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `idpersona` int(11) NOT NULL,
  `acceso` varchar(15) NOT NULL,
  `login` varchar(100) NOT NULL,
  `password` varchar(11) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `eps` varchar(100) NOT NULL,
  `arl` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`idpersona`, `acceso`, `login`, `password`, `estado`, `eps`, `arl`) VALUES
(78, 'Digitador', 'andres', '1105698', 'A', 'sura', 'sura'),
(81, 'Digitador', 'Ana Marcela Diaz Rodriguez', '1128325348', 'A', 'sura', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `numero` varchar(45) NOT NULL,
  `piso` varchar(4) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `caracteristicas` varchar(200) DEFAULT NULL,
  `precio` decimal(10,1) NOT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `tipohabitacion` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `numero`, `piso`, `descripcion`, `caracteristicas`, `precio`, `estado`, `tipohabitacion`) VALUES
(1, '1', '1', '1 Cama', 'Sencilla', 60000.0, 'Disponible', 'Individual'),
(2, '2', '1', '1 Cama', 'Sencilla', 60000.0, 'Disponible', 'Individual'),
(3, '3', '1', '1 Cama', 'Sencilla', 60000.0, 'Disponible', 'Individual'),
(4, '4', '1', '1 Cama', 'Sencilla', 60000.0, 'Disponible', 'Individual'),
(5, '5', '1', '1 Cama', 'Sencilla', 60000.0, 'Disponible', 'Individual'),
(6, '6', '1', '1 Cama', 'Sencilla', 60000.0, 'Disponible', 'Individual'),
(7, '7', '1', '1 Cama', 'Doble', 75000.0, 'Disponible', 'Doble'),
(8, '8', '1', '2 Camas', 'Sencillas', 84000.0, 'Disponible', 'Doble'),
(9, '9', '1', '1 Cama', 'Sencillas', 60000.0, 'Disponible', 'Individual'),
(10, '10', '1', '1 Cama', 'Sencillas', 60000.0, 'Disponible', 'Individual'),
(11, '11', '1', '1 Cama', 'Sencillas', 60000.0, 'Disponible', 'Individual'),
(12, '12', '1', '1 Cama', 'Sencillas', 60000.0, 'Disponible', 'Individual'),
(13, '21', '2', '2 Camas', 'Sencillas', 84000.0, 'Disponible', 'Doble'),
(14, '22', '2', '2 Camas', 'Sencillas', 84000.0, 'Disponible', 'Doble'),
(15, '23', '2', '2 Camas', 'Doble Sencilla', 130000.0, 'Disponible', 'Triple'),
(16, '24', '2', '2 Camas', 'Sencillas', 84000.0, 'Disponible', 'Doble'),
(17, '25', '2', '2 Camas', 'Sencillas', 84000.0, 'Disponible', 'Doble'),
(18, '28', '2', '2 Camas', 'Sencillas', 84000.0, 'Disponible', 'Doble'),
(19, '29', '2', '2 Camas doble - sencilla', 'Doble Sencilla', 130000.0, 'Disponible', 'Triple'),
(20, '210', '2', '2 Camas', 'Sencillas', 84000.0, 'Disponible', 'Doble'),
(21, '211', '2', '3 Camas', 'Sencillas', 125000.0, 'Disponible', 'Triple'),
(22, '31', '3', '1 Cama', 'Doble', 80000.0, 'Disponible', 'Doble'),
(24, '26', '2', '2 Camas', 'Sencilla', 84000.0, 'Disponible', 'Doble'),
(25, '27', '2', '2 Camas', 'Sencilla', 84000.0, 'Disponible', 'Doble');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `idpago` int(11) NOT NULL,
  `idreserva` int(11) NOT NULL,
  `tipocomprobante` varchar(20) NOT NULL,
  `numcomprobante` varchar(20) NOT NULL,
  `igv` decimal(5,2) NOT NULL,
  `totalpago` decimal(10,2) NOT NULL,
  `fechaemision` date NOT NULL,
  `fechapago` date NOT NULL,
  `formapago` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idpersona` int(11) NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `tipodocumento` varchar(50) NOT NULL,
  `numdocumento` varchar(11) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `telefono` varchar(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `pais` varchar(255) NOT NULL,
  `ciudad` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idpersona`, `nombres`, `apellidos`, `tipodocumento`, `numdocumento`, `direccion`, `telefono`, `email`, `pais`, `ciudad`) VALUES
(13, 'Berludis ', 'quintana', 'Cedula de ciudadania', '1051449219', '3145906692', 'turbaco', 'berludis.1995@gmail.com', 'colombia', 'cartagena'),
(29, 'jesus', 'nieves', 'Cedula de ciudadania', '1143362120', '3226141645', 'los alpes', 'elex@outook.com', 'colombia', 'cartagena'),
(34, 'jhonatan', 'mendoza', 'Cedula de ciudadania', '114335178', 'los alpes', '314749678', 'jhon@lo.com', 'colombia', 'cartagena'),
(39, 'Berludis', 'Romero', 'Cedula de ciudadania', '11040123', 'ternera', '3045678234', 'beelu@outlook.com', 'colombia', 'cartagena'),
(40, 'noverlis', 'blanco', 'Cedula de ciudadania', '6458873', 'turbaco', '322618904', 'noverlis@outlook.com', 'comobia', 'cartagena'),
(43, 'luis', 'romero', 'Cedula de ciudadania', '73645788', 'ternera', '32261456', 'luis@gmail.com', 'colombia', 'cartagena'),
(44, 'abel', 'espinoza', 'Cedula de ciudadania', '1104012309', 'ternera', '32267893', 'abel@gmail.com', 'colombia', 'cartagena'),
(58, 'Enilse', 'lopez', 'Cedula de ciudadania', '6478', 'ternera', '322615', 'enilse@outlook.com', 'colom', 'cartage'),
(59, 'berna', 'castaño', 'Cedula de ciudadania', '1104', 'berna@outlook.com', '30456', 'berna@gmail.com', 'colom', 'cartage'),
(60, 'alejandro', 'perez', 'Cedula de ciudadania', '1143361', 'ternera', '31476', 'alejandro@outlook.com', 'colombia', 'cartagena'),
(62, 'mona', 'avila', 'Cedula de ciudadania', '1234', '32281', 'lo que sea', 'mona@outlook.com', 'colombia', 'cartagena'),
(64, 'alexander ', 'nieves romero', 'Cedula de ciudadania', '1143362120', 'los alpes', '3226141645', 'alexnieve@outlook.com', 'colombia', 'cartagena'),
(74, 'jesus', 'nieves romero', 'Cedula de ciudadania', '1143351', 'los alpes ', '304131', 'jesusromero@gmail.com', 'colombia', 'cartagena'),
(76, 'jesus', 'nieves romero', 'Cedula de ciudadania', '1143351', 'la gloria', '301471', 'jesusrnieves@gmail.com', 'colombia', 'cartagena'),
(77, 'marcela', 'castro', 'Cedula de ciudadania', '110412', 'villa', '32278', 'marce@gmail.com', 'colom', 'carta'),
(78, 'andres', 'galvis', 'Cedula de ciudadania', '1105698', 'turbaco', '3225131', 'andresg@gmail.com', 'colom', 'cartagena'),
(81, 'Ana marcela', 'Diaz Rodriguez', 'Cedula de ciudadania', '1128325348', 'URB Asturias', '3023700341', 'madiazrodriguez@gmail.com', 'colombia', 'cartagena');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  `descripcion` varchar(200) DEFAULT NULL,
  `unidadmedida` varchar(25) NOT NULL,
  `precioventa` decimal(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idreserva` int(11) NOT NULL,
  `idhabitacion` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `idempleado` int(11) NOT NULL,
  `tiporeserva` varchar(20) NOT NULL,
  `numreserva` int(11) DEFAULT NULL,
  `fechareserva` date NOT NULL,
  `fechaingreso` date DEFAULT NULL,
  `fechasalida` date NOT NULL,
  `costoalojamiento` decimal(7,2) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `numpersonas` int(11) DEFAULT NULL,
  `numnoches` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turnos`
--

CREATE TABLE `turnos` (
  `idturno` int(11) NOT NULL,
  `idempleado` int(11) DEFAULT NULL,
  `numero` int(11) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date DEFAULT NULL,
  `turno` enum('1','2','3') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `idvehiculo` int(11) NOT NULL,
  `placa` varchar(8) NOT NULL,
  `modelo` varchar(10) NOT NULL,
  `tipo_vahiculo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idpersona`);

--
-- Indices de la tabla `consumo`
--
ALTER TABLE `consumo`
  ADD PRIMARY KEY (`idconsumo`),
  ADD KEY `fk_consumo_producto_idx` (`idproducto`),
  ADD KEY `fk_consumo_reserva_idx` (`idereserva`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`idpersona`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`idpago`),
  ADD KEY `fk_pago_reserva_idx` (`idreserva`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idpersona`),
  ADD UNIQUE KEY `email_UNIQUE` (`email`),
  ADD UNIQUE KEY `telefono_UNIQUE` (`telefono`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idproducto`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idreserva`),
  ADD UNIQUE KEY `numreserva` (`numreserva`),
  ADD KEY `fk_reserva_cliente_idx` (`idcliente`),
  ADD KEY `fk_reserva_empleado_idx` (`idempleado`),
  ADD KEY `fk_resserva_habitacion_idx` (`idhabitacion`);

--
-- Indices de la tabla `turnos`
--
ALTER TABLE `turnos`
  ADD PRIMARY KEY (`idturno`),
  ADD UNIQUE KEY `numero` (`numero`),
  ADD KEY `idempleado` (`idempleado`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`idvehiculo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `idpago` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=83;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idreserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `turnos`
--
ALTER TABLE `turnos`
  MODIFY `idturno` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  MODIFY `idvehiculo` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `fk_persona_cliente` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `consumo`
--
ALTER TABLE `consumo`
  ADD CONSTRAINT `fk_consumo_producto` FOREIGN KEY (`idproducto`) REFERENCES `producto` (`idproducto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_consumo_reserva` FOREIGN KEY (`idereserva`) REFERENCES `reserva` (`idreserva`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `fk_persona_empleado` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `fk_pago_reserva` FOREIGN KEY (`idreserva`) REFERENCES `reserva` (`idreserva`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `fk_reserva_cliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_reserva_empleado` FOREIGN KEY (`idempleado`) REFERENCES `empleado` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_reserva_habitacion` FOREIGN KEY (`idhabitacion`) REFERENCES `habitacion` (`idHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `turnos`
--
ALTER TABLE `turnos`
  ADD CONSTRAINT `turnos_ibfk_1` FOREIGN KEY (`idempleado`) REFERENCES `empleado` (`idpersona`) ON DELETE SET NULL ON UPDATE SET NULL;

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `fk_vahiculo_reseerva` FOREIGN KEY (`idvehiculo`) REFERENCES `reserva` (`idreserva`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_vehiculo_cliente` FOREIGN KEY (`idvehiculo`) REFERENCES `cliente` (`idpersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
