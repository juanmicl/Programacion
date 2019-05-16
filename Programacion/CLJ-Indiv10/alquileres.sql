-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-05-2019 a las 02:33:22
-- Versión del servidor: 10.1.39-MariaDB
-- Versión de PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `alquileres`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alquileres`
--

CREATE TABLE `alquileres` (
  `dni` varchar(9) COLLATE utf8_spanish_ci NOT NULL,
  `matricula` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `fecha` date NOT NULL,
  `dias` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `alquileres`
--

INSERT INTO `alquileres` (`dni`, `matricula`, `fecha`, `dias`) VALUES
('88888899N', '2525BZM', '2019-05-01', 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `dni` varchar(9) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `localidad` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `codigoPostal` varchar(5) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`dni`, `nombre`, `direccion`, `localidad`, `codigoPostal`) VALUES
('88888899N', 'juanmi', 'asdasd', 'asdasd', '04720');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `deportivos`
--

CREATE TABLE `deportivos` (
  `matricula_Dep` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `descapotable` tinyint(1) NOT NULL,
  `cajaCambios` varchar(10) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `familiares`
--

CREATE TABLE `familiares` (
  `matricula_fam` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `numeroPlazas` int(11) NOT NULL,
  `sillaBebe` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `furgonetas`
--

CREATE TABLE `furgonetas` (
  `matricula_fur` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `refrigerado` tinyint(1) NOT NULL,
  `tamanio` varchar(8) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mercancias`
--

CREATE TABLE `mercancias` (
  `matricula_mer` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `pma` int(11) NOT NULL,
  `volumen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `turismos`
--

CREATE TABLE `turismos` (
  `matricula_tur` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `numeroPuertas` int(11) NOT NULL,
  `tipoCombustible` varchar(10) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

CREATE TABLE `vehiculos` (
  `matricula` varchar(8) COLLATE utf8_spanish_ci NOT NULL,
  `marca` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `modelo` varchar(50) COLLATE utf8_spanish_ci NOT NULL,
  `cilindrada` int(11) NOT NULL,
  `disponible` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`matricula`, `marca`, `modelo`, `cilindrada`, `disponible`) VALUES
('2525BZM', 'audi', 'a3', 1900, 1),
('7723BZM', 'citroen', 'c3', 1400, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alquileres`
--
ALTER TABLE `alquileres`
  ADD PRIMARY KEY (`dni`,`matricula`),
  ADD KEY `matricula` (`matricula`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `deportivos`
--
ALTER TABLE `deportivos`
  ADD PRIMARY KEY (`matricula_Dep`);

--
-- Indices de la tabla `familiares`
--
ALTER TABLE `familiares`
  ADD PRIMARY KEY (`matricula_fam`);

--
-- Indices de la tabla `furgonetas`
--
ALTER TABLE `furgonetas`
  ADD PRIMARY KEY (`matricula_fur`);

--
-- Indices de la tabla `mercancias`
--
ALTER TABLE `mercancias`
  ADD PRIMARY KEY (`matricula_mer`);

--
-- Indices de la tabla `turismos`
--
ALTER TABLE `turismos`
  ADD PRIMARY KEY (`matricula_tur`);

--
-- Indices de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`matricula`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alquileres`
--
ALTER TABLE `alquileres`
  ADD CONSTRAINT `alquileres_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `clientes` (`dni`),
  ADD CONSTRAINT `alquileres_ibfk_2` FOREIGN KEY (`matricula`) REFERENCES `vehiculos` (`matricula`);

--
-- Filtros para la tabla `deportivos`
--
ALTER TABLE `deportivos`
  ADD CONSTRAINT `deportivos_ibfk_1` FOREIGN KEY (`matricula_Dep`) REFERENCES `turismos` (`matricula_tur`);

--
-- Filtros para la tabla `familiares`
--
ALTER TABLE `familiares`
  ADD CONSTRAINT `familiares_ibfk_1` FOREIGN KEY (`matricula_fam`) REFERENCES `turismos` (`matricula_tur`);

--
-- Filtros para la tabla `furgonetas`
--
ALTER TABLE `furgonetas`
  ADD CONSTRAINT `furgonetas_ibfk_1` FOREIGN KEY (`matricula_fur`) REFERENCES `vehiculos` (`matricula`);

--
-- Filtros para la tabla `mercancias`
--
ALTER TABLE `mercancias`
  ADD CONSTRAINT `mercancias_ibfk_1` FOREIGN KEY (`matricula_mer`) REFERENCES `furgonetas` (`matricula_fur`);

--
-- Filtros para la tabla `turismos`
--
ALTER TABLE `turismos`
  ADD CONSTRAINT `turismos_ibfk_1` FOREIGN KEY (`matricula_tur`) REFERENCES `vehiculos` (`matricula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
