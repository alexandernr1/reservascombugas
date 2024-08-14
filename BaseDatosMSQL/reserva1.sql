CREATE DATABASE  IF NOT EXISTS `reserva1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `reserva1`;
-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: reserva1
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `abono`
--

DROP TABLE IF EXISTS `abono`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `abono` (
  `idabono` int NOT NULL AUTO_INCREMENT,
  `idingreso` int NOT NULL,
  `idhabitacion` int NOT NULL,
  `idcliente` int NOT NULL,
  `fechaabono` date NOT NULL,
  `abonohabitacion` int NOT NULL,
  `descuentos` varchar(45) NOT NULL,
  `conceptodescuento` varchar(45) NOT NULL,
  `formaabono` varchar(45) NOT NULL,
  `totalabonos` int NOT NULL,
  `privilegiosadmon` varchar(45) NOT NULL,
  `privilegiosrecepcion` varchar(45) NOT NULL,
  `otroscobros` int NOT NULL,
  `numero_turno` int NOT NULL,
  PRIMARY KEY (`idabono`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `abono`
--

LOCK TABLES `abono` WRITE;
/*!40000 ALTER TABLE `abono` DISABLE KEYS */;
INSERT INTO `abono` VALUES (1,1,1,10,'2024-05-28',50000,'0','','Tarjeta debito/credito',0,'0','0',0,0),(2,3,1,10,'2024-05-28',0,'0','','Efectivo',0,'0','0',0,0),(3,6,1,14,'2024-05-28',0,'0','','Transferencia ',0,'0','0',0,0),(4,6,1,14,'2024-05-28',0,'0','','Efectivo',0,'0','0',0,0),(5,8,5,10,'2024-05-28',0,'0','','Efectivo',0,'0','0',0,0),(6,8,5,10,'2024-05-28',50000,'0','','Efectivo',0,'0','0',0,0),(7,9,1,10,'2024-05-29',60000,'0','','Efectivo',0,'0','0',0,0),(8,10,1,1,'2024-05-29',50000,'3000','','Efectivo',0,'0','0',0,0),(9,12,3,10,'2024-05-30',180000,'0','','Efectivo',0,'0','0',0,0),(10,13,1,10,'2024-05-31',180000,'5000','','Efectivo',0,'0','0',0,0),(11,19,8,10,'2024-05-31',3000,'0','','Efectivo',0,'0','0',0,0),(12,21,6,1,'2024-05-31',180000,'3000','','Transferencia ',0,'0','0',0,0),(13,28,3,1,'2024-06-04',50000,'3000','','Efectivo',0,'0','0',0,0),(14,31,13,10,'2024-06-05',50000,'0','','Efectivo',0,'0','0',0,0),(15,32,9,10,'2024-06-11',100000,'0','','Efectivo',0,'0','0',0,0),(16,33,12,10,'2024-06-11',10000,'0','','Efectivo',0,'0','0',0,0),(17,1,14,10,'2024-06-11',50000,'0','','Efectivo',0,'0','0',0,74),(18,6,5,1,'2024-06-12',0,'0','','Efectivo',0,'0','0',0,0),(19,13,36,15,'2024-06-15',40000,'0','','Efectivo',0,'0','0',0,74),(20,16,8,1,'2024-06-24',10000,'0','','Efectivo',0,'0','0',0,2),(21,22,2,15,'2024-07-10',60000,'0','','Efectivo',0,'0','0',0,16),(22,27,6,10,'2024-07-16',20000,'0','','Efectivo',0,'0','0',20000,43);
/*!40000 ALTER TABLE `abono` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `acompañantes`
--

DROP TABLE IF EXISTS `acompañantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acompañantes` (
  `idacompañante` int NOT NULL AUTO_INCREMENT,
  `idcliente` int DEFAULT NULL,
  `nombre_apellido` varchar(45) DEFAULT NULL,
  `tipo_documento` varchar(45) DEFAULT NULL,
  `documento` int DEFAULT NULL,
  `parentesco` varchar(45) DEFAULT NULL,
  `num_habitacion` int DEFAULT NULL,
  `checkin` date DEFAULT NULL,
  `num_huesped_principal` int DEFAULT NULL,
  `ciudad_de_residencia` varchar(100) DEFAULT NULL,
  `ciudad_de_procedencia` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idacompañante`),
  KEY `fk_acompañante_ingreso_idx` (`idcliente`),
  CONSTRAINT `fk_acompañante_ingreso` FOREIGN KEY (`idcliente`) REFERENCES `ingreso` (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acompañantes`
--

LOCK TABLES `acompañantes` WRITE;
/*!40000 ALTER TABLE `acompañantes` DISABLE KEYS */;
INSERT INTO `acompañantes` VALUES (1,14,'jose luna','Cedula de ciudadania',768790,'Esposo/a',11,NULL,NULL,NULL,NULL),(2,14,'luis javier','Cedula de ciudadania',456,'Esposo/a',11,NULL,NULL,NULL,NULL),(3,10,'marcos nieves','Cedula de ciudadania',730920,'Esposo/a',10,NULL,NULL,NULL,NULL),(4,10,'edith romero','Cedula de ciudadania',45678,'Esposo/a',10,NULL,NULL,NULL,NULL),(5,15,'alex nieves','Cedula de ciudadania',1143362,'Esposo/a',21,NULL,NULL,NULL,NULL),(6,15,'jesus','Cedula de ciudadania',1143351,'Esposo/a',21,NULL,NULL,NULL,NULL),(7,15,'juana sanche','Cedula de ciudadania',11333,'Esposo/a',311,NULL,NULL,NULL,NULL),(8,1,'alex','Cedula de ciudadania',1143,'Esposo/a',4,NULL,NULL,NULL,NULL),(9,15,'laura perez','Cedula de ciudadania',1123,'Esposo/a',12,NULL,NULL,NULL,NULL),(10,15,'jesus','Cedula de ciudadania',1143351,'Esposo/a',210,NULL,NULL,NULL,NULL),(11,15,'laura perez','Cedula de ciudadania',123456,'Esposo/a',7,NULL,NULL,NULL,NULL),(12,15,'alexander','Cedula de ciudadania',11433,'Esposo/a',4,'2024-07-15',1047,'cartagena','cartagena'),(13,1,'carlos','Cedula de ciudadania',1104,'Esposo/a',6,'2024-07-15',1104012302,'cart','cart'),(14,1,'ales','Cedula de ciudadania',11433,'Esposo/a',6,'2024-07-15',1104012302,'carta','carta'),(15,1,'alex','Cedula de ciudadania',1143362120,'Familiar',6,'2024-07-15',1104012302,'cart','cart'),(16,10,'lucia','Cedula de ciudadania',1104,'Madre',0,'2024-07-15',1143362120,'cart','cart');
/*!40000 ALTER TABLE `acompañantes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cambio_habitacion`
--

DROP TABLE IF EXISTS `cambio_habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cambio_habitacion` (
  `idcambio` int NOT NULL AUTO_INCREMENT,
  `idingreso` int NOT NULL,
  `idhabitacion` int NOT NULL,
  `empleado` varchar(45) NOT NULL,
  `fecha_nuevoingreso` varchar(45) NOT NULL,
  `numero_turno` int NOT NULL,
  `numero_habita` int NOT NULL,
  `tipo_habita` varchar(45) NOT NULL,
  `costoalojamiento` int NOT NULL,
  `documento` varchar(45) NOT NULL,
  `cliente` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `tipo_cliente` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `numpersona` int NOT NULL,
  `deuda_anterior` int NOT NULL,
  PRIMARY KEY (`idcambio`),
  KEY `fk_cambio_ingreso_idx` (`idingreso`),
  KEY `fk_cambio_habitacion_idx` (`idhabitacion`),
  CONSTRAINT `fk_cambio_habitacion` FOREIGN KEY (`idhabitacion`) REFERENCES `habitacion` (`idHabitacion`),
  CONSTRAINT `fk_cambio_ingreso` FOREIGN KEY (`idingreso`) REFERENCES `ingreso` (`idingreso`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cambio_habitacion`
--

LOCK TABLES `cambio_habitacion` WRITE;
/*!40000 ALTER TABLE `cambio_habitacion` DISABLE KEYS */;
INSERT INTO `cambio_habitacion` VALUES (2,13,36,'Ana marcela Diaz Rodriguez','15-06-2024 11:05 AM',49,35,'Doble',80000,'1047','carlos  puentes','30043','General','Activo',2,0),(3,6,5,'andres galvis','18-06-2024 08:58 AM',52,5,'Individual',60000,'1104012302','lucia mendoza','3147499069','General','Finalizado',2,240000),(4,16,8,'GINA PEREZ','24-06-2024 09:29 PM',2,8,'Doble',84000,'1104012302','lucia mendoza','3147499069','General','Finalizado',1,336000),(5,22,2,'GINA PEREZ','10-07-2024 11:45 AM',16,2,'Individual',60000,'1047','carlos  puentes','30043','General','Finalizado',1,42400),(6,27,6,'Alexander   Nieves Romero','16-07-2024 08:39 AM',43,6,'Individual',60000,'1143362120','alexander nieves','3226141','General','Finalizado',1,300000);
/*!40000 ALTER TABLE `cambio_habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idcliente` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `tipodocumento` varchar(50) NOT NULL,
  `numdocumento` varchar(11) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `telefono` varchar(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `pais` varchar(255) DEFAULT NULL,
  `ciudad` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'lucia','mendoza','Cedula de ciudadania','1104012302','los alpes','3147499069','luchys1789@hotil.com','Afganistán','Bogotá'),(4,'maria','mendoza','Cedula de ciudadania','1104012302','los alpes','31474990','luchys1789@hotmail.es','colombia','cartagena'),(10,'alexander','nieves','Cedula de ciudadania','1143362120','los alpes','3226141','alexnieves_romero@out.com','Albania','Medellín'),(14,'edith del carmen','romero reyes','Cedula de ciudadania','45482648','el carmelo','301765993','edith@hotmail.com','Albania','Medellín'),(15,'carlos ','puentes','Cedula de ciudadania','1047','los alpes','30043','carlos@gmail.com','Albania','Medellín'),(16,'juana','peña perez','Cedula de ciudadania','1143768','el pozon','314749','juana@gmail.com','Albania','Medellín'),(17,'jesu','antonio','Cedula de ciudadania','1143351','los alpes','321614','jesus@gmail.com','Colombia','Ipiales'),(20,'pepe','piña','Cedula de ciudadania','1234567','los alpes','6615358','pepe@gmail.com','Colombia','Cartagena'),(22,'selena','mendoza atencia','Cedula de ciudadania','123456','los alpes','3229123','selena@gmail.com','Colombia','Cartagena'),(25,'alexander','nieves','Cedula de ciudadania','1143362120','los alpes','3226141','alexnieves_romero@out.com','Colombia','Cartagena'),(26,'alexander','nieves','Cedula de ciudadania','1143362120','los alpes','3226141','alexnieves_romero@out.com','Colombia','Cartagena'),(27,'alexander','nieves','Cedula de ciudadania','1143362120','los alpes','3226141','alexnieves_romero@out.com','Colombia','Cartagena'),(28,'lucia','mendoza','Cedula de ciudadania','1104012302','los alpes','3147499069','luchys1789@hotil.com','colombia','cartagena'),(29,'lucia','mendoza','Cedula de ciudadania','1104012302','los alpes','3147499069','luchys1789@hotil.com','colombia','cartagena');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consumo`
--

DROP TABLE IF EXISTS `consumo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `consumo` (
  `idconsumo` int NOT NULL AUTO_INCREMENT,
  `idabonos` int NOT NULL,
  `idproducto` int NOT NULL,
  `cantidad` decimal(7,2) NOT NULL,
  `precio_venta` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL,
  PRIMARY KEY (`idconsumo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consumo`
--

LOCK TABLES `consumo` WRITE;
/*!40000 ALTER TABLE `consumo` DISABLE KEYS */;
/*!40000 ALTER TABLE `consumo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `idpersona` int NOT NULL AUTO_INCREMENT,
  `acceso` varchar(15) NOT NULL,
  `login` varchar(100) NOT NULL,
  `password` varchar(11) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `eps` varchar(100) NOT NULL,
  `arl` varchar(100) NOT NULL,
  PRIMARY KEY (`idpersona`),
  CONSTRAINT `fk_persona_empleado` FOREIGN KEY (`idpersona`) REFERENCES `persona` (`idpersona`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (78,'Empleado','gina','1234','A','sura','sura'),(81,'Empleado','Ana','1128','A','sura',''),(83,'General','combugas','empleado','A','No','No'),(84,'Administrador','berludis','1234','A','no','no'),(85,'Empleado','1143362120','2120','A','sura','sura');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `espera`
--

DROP TABLE IF EXISTS `espera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `espera` (
  `idespera` int NOT NULL AUTO_INCREMENT,
  `idempleado` int NOT NULL,
  `numero` int NOT NULL,
  `empleado` varchar(100) NOT NULL,
  `fecha` date NOT NULL,
  `cantidadpersonas` int NOT NULL,
  `tipohabitacion` varchar(50) NOT NULL,
  `hora_llegada` date NOT NULL,
  `cliente` varchar(100) NOT NULL,
  `estado` varchar(50) NOT NULL,
  PRIMARY KEY (`idespera`),
  KEY `fk_espera_empleado_idx` (`idempleado`),
  CONSTRAINT `fk_espera_empleado` FOREIGN KEY (`idempleado`) REFERENCES `empleado` (`idpersona`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `espera`
--

LOCK TABLES `espera` WRITE;
/*!40000 ALTER TABLE `espera` DISABLE KEYS */;
INSERT INTO `espera` VALUES (2,81,1,'Ana marcela Diaz Rodriguez','2024-05-04',1,'Individual','2024-05-03','marcos','A la Espera');
/*!40000 ALTER TABLE `espera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitacion`
--

DROP TABLE IF EXISTS `habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habitacion` (
  `idHabitacion` int NOT NULL AUTO_INCREMENT,
  `numero` varchar(45) NOT NULL,
  `piso` varchar(4) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `caracteristicas` varchar(200) DEFAULT NULL,
  `precio` int NOT NULL,
  `estado` varchar(15) DEFAULT NULL,
  `tipohabitacion` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`idHabitacion`)
) ENGINE=InnoDB AUTO_INCREMENT=313 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacion`
--

LOCK TABLES `habitacion` WRITE;
/*!40000 ALTER TABLE `habitacion` DISABLE KEYS */;
INSERT INTO `habitacion` VALUES (1,'1','1','1 Cama','Sencilla',60000,'Disponible','Individual'),(2,'2','1','1 Cama','Sencilla',60000,'Disponible','Individual'),(3,'3','1','1 Cama','Sencilla',60000,'Disponible','Individual'),(4,'4','1','1 Cama','Sencilla',60000,'Disponible','Individual'),(5,'5','1','1 Cama','Sencilla',60000,'Ocupado','Individual'),(6,'6','1','1 Cama','Sencilla',60000,'Disponible','Individual'),(7,'7','1','1 Cama','Doble',75000,'Disponible','Doble'),(8,'8','1','2 Camas','Sencillas',84000,'Disponible','Doble'),(9,'9','1','1 Cama','Sencillas',60000,'Disponible','Individual'),(10,'10','1','1 Cama','Sencillas',60000,'Disponible','Individual'),(11,'11','1','1 Cama','Sencillas',60000,'Disponible','Individual'),(12,'12','1','1 Cama','Sencillas',60000,'Disponible','Individual'),(13,'21','2','2 Camas','Sencillas',84000,'Disponible','Doble'),(14,'22','2','2 Camas','Sencillas',84000,'Disponible','Doble'),(15,'23','2','2 Camas','Doble Sencilla',130000,'Disponible','Triple'),(16,'24','2','2 Camas','Sencillas',84000,'Disponible','Doble'),(17,'25','2','2 Camas','Sencillas',84000,'Disponible','Doble'),(26,'26','2','2 Camas','Sencillas',84000,'Disponible','Doble'),(27,'27','2','2 Camas','Sencillas',84000,'Disponible','Doble'),(28,'28','2','2 Camas','Sencillas',84000,'Disponible','Doble'),(29,'29','2','2 Camas','Doble Sencilla',130000,'Disponible','Triple'),(30,'210','2','2 Camas','Sencillas',84000,'Disponible','Doble'),(31,'211','2','3 Camas','Sencillas',125000,'Disponible','Triple'),(32,'31','3','1 Cama','Doble',80000,'Disponible','Triple'),(33,'32','3','2 Camas','Doble Sencilla',135000,'Disponible','Triple'),(34,'33','3','1 Cama','Doble',80000,'Disponible','Doble'),(35,'34','3','1 Cama','Doble',80000,'Disponible','Doble'),(36,'35','3','1 Cama Qeen','Doble',80000,'Disponible','Doble'),(37,'36','3','1 Cama Qeen','Doble',80000,'Disponible','Doble'),(38,'37','3','3 Camas','Sencillas',130000,'Disponible','Triple'),(39,'38','3','1 Cama','Doble',80000,'Disponible','Doble'),(40,'39','3','1 Cama','Doble',80000,'Disponible','Doble'),(41,'310','3','1 Cama','Doble',80000,'Disponible','Doble'),(42,'311','3','1 Cama','Doble',80000,'Disponible','Doble'),(43,'312','3','2 Camas doble - sencilla','Doble Sencilla',1350000,'Disponible','Triple');
/*!40000 ALTER TABLE `habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ingreso`
--

DROP TABLE IF EXISTS `ingreso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ingreso` (
  `idingreso` int NOT NULL AUTO_INCREMENT,
  `idhabitacion` int NOT NULL,
  `idcliente` int NOT NULL,
  `fecha_hora_ingreso` varchar(45) NOT NULL,
  `num_personas` int NOT NULL,
  `tipo_cliente` varchar(45) NOT NULL,
  `costoalojamiento` int NOT NULL,
  `motivo_viaje` varchar(45) DEFAULT NULL,
  `estado` varchar(45) NOT NULL,
  `ciudad_de_recidencia` varchar(100) DEFAULT NULL,
  `ciudad_de_procedencia` varchar(100) DEFAULT NULL,
  `num_habitacion` int NOT NULL,
  PRIMARY KEY (`idingreso`),
  KEY `fk_ingreso_habiatacion_idx` (`idhabitacion`),
  KEY `fk_ingreso_cliente_idx` (`idcliente`),
  CONSTRAINT `fk_ingreso_cliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`),
  CONSTRAINT `fk_ingreso_habiatacion` FOREIGN KEY (`idhabitacion`) REFERENCES `habitacion` (`idHabitacion`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ingreso`
--

LOCK TABLES `ingreso` WRITE;
/*!40000 ALTER TABLE `ingreso` DISABLE KEYS */;
INSERT INTO `ingreso` VALUES (2,31,10,'15-06-2024 08:14 AM',1,'General',125000,'no aplica','Finalizado',NULL,NULL,0),(3,8,10,'13-06-2024 06:09 PM',2,'General',84000,'no aplica','Finalizado',NULL,NULL,0),(4,7,10,'15-06-2024 08:44 AM',2,'General',75000,'no aplica','Finalizado',NULL,NULL,0),(5,9,10,'14-06-2024 12:05 PM',2,'General',60000,'no aplica','Finalizado',NULL,NULL,0),(6,5,1,'18-06-2024 08:58 AM',2,'General',60000,NULL,'Finalizado',NULL,NULL,0),(9,11,14,'14-06-2024 09:45 AM',1,'General',60000,'no aplica','Finalizado',NULL,NULL,0),(10,10,10,'14-06-2024 11:26 AM',2,'General',60000,'no aplica','Finalizado',NULL,NULL,0),(13,36,15,'15-06-2024 11:05 AM',2,'General',80000,NULL,'Finalizado',NULL,NULL,0),(14,1,10,'14-06-2024 07:57 AM',1,'General',60000,'trabjao','Finalizado',NULL,NULL,0),(15,2,15,'20-06-2024 10:04 AM',1,'General',60000,'no aplica motivo','Finalizado',NULL,NULL,0),(16,8,1,'24-06-2024 09:29 PM',1,'General',84000,NULL,'Finalizado',NULL,NULL,0),(17,31,14,'20-06-2024 10:18 AM',1,'General',125000,'no aplica motivo','Finalizado',NULL,NULL,0),(18,17,10,'20-06-2024 10:19 AM',1,'General',84000,'no aplica motivo','Finalizado',NULL,NULL,0),(19,7,15,'24-06-2024 09:40 PM',2,'General',75000,'luna de miel','Finalizado',NULL,NULL,0),(20,9,15,'09-07-2024 11:14 AM',1,'General',60000,'no aplica motivo','Finalizado',NULL,NULL,0),(21,10,10,'09-07-2024 12:10 PM',1,'General',60000,'no aplica motivo','Finalizado','cartagena','cartagena',0),(22,2,15,'10-07-2024 11:45 AM',1,'General',60000,NULL,'Finalizado',NULL,NULL,0),(23,14,10,'10-07-2024 11:39 AM',1,'General',84000,'no aplica motivo','Finalizado','carttagena','cartagena',0),(24,3,15,'11-07-2024 09:04 AM',1,'General',60000,'no aplica motivo','Finalizado','catacho','cartacho',0),(25,4,15,'11-07-2024 09:12 AM',1,'General',60000,'no aplica motivo','Finalizado','cartacho','cartacho',0),(26,1,15,'11-07-2024 09:48 AM',1,'General',60000,'no aplica motivo','Finalizado','cartacho','cartacho',0),(27,6,10,'16-07-2024 08:39 AM',1,'General',60000,NULL,'Finalizado',NULL,NULL,0),(28,5,10,'15-07-2024 08:42 AM',1,'General',60000,'no aplica','Activo','cartagena','cartagena',5),(29,6,1,'15-07-2024 08:42 AM',1,'General',60000,'no aplica','Finalizado','cartagena','cartagena',6);
/*!40000 ALTER TABLE `ingreso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inicioturno`
--

DROP TABLE IF EXISTS `inicioturno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inicioturno` (
  `idinicioturno` int NOT NULL AUTO_INCREMENT,
  `fecha_hora_inicio` varchar(45) NOT NULL,
  `turno` varchar(45) NOT NULL,
  `numero_turno` int NOT NULL,
  `estado` varchar(45) NOT NULL,
  `empleado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idinicioturno`),
  KEY `fk_inicioturno_empleado_idx` (`empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inicioturno`
--

LOCK TABLES `inicioturno` WRITE;
/*!40000 ALTER TABLE `inicioturno` DISABLE KEYS */;
INSERT INTO `inicioturno` VALUES (1,'24-06-2024 09:21 PM','Turno 1 24/06/2024',1,'Finalizado','GINA PEREZ'),(2,'24-06-2024 09:23 PM','Turno 1 24/06/2024',2,'Finalizado','GINA PEREZ'),(3,'24-06-2024 09:38 PM','Turno 1 24/06/2024',3,'Finalizado','GINA PEREZ'),(4,'25-06-2024 04:08 PM','Turno 1 25/06/2024',4,'Finalizado','GINA PEREZ'),(5,'25-06-2024 06:34 PM','Turno 1 25/06/2024',5,'Finalizado','GINA PEREZ'),(6,'26-06-2024 03:28 PM','Turno 1 26/06/2024',6,'Finalizado','GINA PEREZ'),(7,'28-06-2024 01:08 PM','Turno 1 28/06/2024',7,'Finalizado','GINA PEREZ'),(8,'28-06-2024 05:00 PM','Turno 1 28/06/2024',8,'Finalizado','GINA PEREZ'),(9,'02-07-2024 04:36 PM','Turno 1 02/07/2024',9,'Finalizado','GINA PEREZ'),(10,'09-07-2024 09:01 AM','Turno 1 09/07/2024',10,'Finalizado','GINA PEREZ'),(11,'09-07-2024 09:10 AM','Turno 1 09/07/2024',11,'Finalizado','GINA PEREZ'),(12,'10-07-2024 09:32 AM','Turno 1 10/07/2024',12,'Finalizado','GINA PEREZ'),(13,'10-07-2024 09:32 AM','Turno 1 10/07/2024',13,'Finalizado','GINA PEREZ'),(14,'10-07-2024 09:34 AM','Turno 1 10/07/2024',14,'Finalizado','GINA PEREZ'),(15,'10-07-2024 11:31 AM','Turno 1 10/07/2024',15,'Finalizado','GINA PEREZ'),(16,'10-07-2024 11:44 AM','Turno 1 10/07/2024',16,'Finalizado','GINA PEREZ'),(17,'10-07-2024 12:00 PM','Turno 1 10/07/2024',17,'Finalizado','GINA PEREZ'),(18,'10-07-2024 12:05 PM','Turno 1 10/07/2024',18,'Finalizado','GINA PEREZ'),(19,'11-07-2024 09:02 AM','Turno 1 11/07/2024',19,'Finalizado','GINA PEREZ'),(20,'13-07-2024 09:50 AM','Turno 1 13/07/2024',20,'Finalizado','GINA PEREZ'),(21,'13-07-2024 09:52 AM','Turno 1 13/07/2024',21,'Finalizado','GINA PEREZ'),(22,'13-07-2024 09:52 AM','Turno 1 13/07/2024',21,'Finalizado','GINA PEREZ'),(23,'13-07-2024 10:08 AM','Turno 1 13/07/2024',22,'Finalizado','GINA PEREZ'),(24,'13-07-2024 10:25 AM','Turno 1 13/07/2024',23,'Finalizado','GINA PEREZ'),(25,'13-07-2024 10:29 AM','Turno 1 13/07/2024',24,'Finalizado','GINA PEREZ'),(26,'13-07-2024 10:34 AM','Turno 1 13/07/2024',25,'Finalizado','ANA MARCELA DIAZ RODRIGUEZ'),(27,'13-07-2024 10:34 AM','Turno 1 13/07/2024',25,'Finalizado','ANA MARCELA DIAZ RODRIGUEZ'),(28,'13-07-2024 10:34 AM','Turno 1 13/07/2024',25,'Finalizado','ANA MARCELA DIAZ RODRIGUEZ'),(29,'13-07-2024 10:38 AM','Turno 1 13/07/2024',26,'Finalizado','GINA PEREZ'),(30,'13-07-2024 10:38 AM','Turno 1 13/07/2024',27,'Finalizado','ANA MARCELA DIAZ RODRIGUEZ'),(31,'13-07-2024 10:39 AM','Turno 1 13/07/2024',28,'Finalizado','GINA PEREZ'),(32,'13-07-2024 11:20 AM','Turno 1 13/07/2024',29,'Finalizado','ANA MARCELA DIAZ RODRIGUEZ'),(33,'13-07-2024 11:22 AM','Turno 1 13/07/2024',30,'Finalizado','GINA PEREZ'),(34,'13-07-2024 11:38 AM','Turno 1 13/07/2024',31,'Finalizado','GINA PEREZ'),(35,'13-07-2024 11:50 AM','Turno 1 13/07/2024',32,'Finalizado','ANA MARCELA DIAZ RODRIGUEZ'),(36,'13-07-2024 11:51 AM','Turno 1 13/07/2024',33,'Finalizado','GINA PEREZ'),(37,'13-07-2024 11:59 AM','Turno 1 13/07/2024',34,'Finalizado','GINA PEREZ'),(38,'13-07-2024 12:33 PM','Turno 1 13/07/2024',35,'Finalizado','ANA MARCELA DIAZ RODRIGUEZ'),(39,'15-07-2024 08:28 AM','Turno 1 15/07/2024',36,'Finalizado','ANA MARCELA DIAZ RODRIGUEZ'),(40,'15-07-2024 09:55 AM','Turno 1 15/07/2024',37,'Finalizado','GINA PEREZ'),(41,'15-07-2024 10:17 AM','Turno 1 15/07/2024',38,'Finalizado','GINA PEREZ'),(42,'15-07-2024 10:17 AM','Turno 1 15/07/2024',38,'Finalizado','GINA PEREZ'),(43,'15-07-2024 10:23 AM','Turno 1 15/07/2024',39,'Finalizado','Alexander   Nieves Romero'),(44,'15-07-2024 10:23 AM','Turno 1 15/07/2024',39,'Finalizado','Alexander   Nieves Romero'),(45,'15-07-2024 10:25 AM','Turno 1 15/07/2024',40,'Finalizado','Alexander   Nieves Romero'),(46,'15-07-2024 10:26 AM','Turno 1 15/07/2024',41,'Finalizado','GINA PEREZ'),(47,'15-07-2024 12:08 PM','Turno 1 15/07/2024',42,'Finalizado','Alexander   Nieves Romero'),(48,'16-07-2024 08:31 AM','Turno 1 16/07/2024',43,'Activo','Alexander   Nieves Romero');
/*!40000 ALTER TABLE `inicioturno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `limpieza`
--

DROP TABLE IF EXISTS `limpieza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `limpieza` (
  `idlimpieza` int NOT NULL AUTO_INCREMENT,
  `idempleado` int NOT NULL,
  `idhabitacion` int NOT NULL,
  `numero` int NOT NULL,
  `tipo_habitacion` varchar(100) NOT NULL,
  `fecha` date NOT NULL,
  `estado` varchar(11) NOT NULL,
  `turno` varchar(11) NOT NULL,
  PRIMARY KEY (`idlimpieza`),
  KEY `fk_limpieza_empleado_idx` (`idempleado`),
  KEY `fk_limpieza_habitacion_idx` (`idhabitacion`),
  CONSTRAINT `fk_limpieza_empleado` FOREIGN KEY (`idempleado`) REFERENCES `empleado` (`idpersona`),
  CONSTRAINT `fk_limpieza_habitacion` FOREIGN KEY (`idhabitacion`) REFERENCES `habitacion` (`idHabitacion`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `limpieza`
--

LOCK TABLES `limpieza` WRITE;
/*!40000 ALTER TABLE `limpieza` DISABLE KEYS */;
INSERT INTO `limpieza` VALUES (16,81,7,7,'Doble','2024-05-20','Disponible','Turno 1'),(17,78,5,6,'Individual','2024-05-20','Disponible','Turno 1'),(18,81,17,25,'Doble','2024-06-24','Disponible','Turno 2');
/*!40000 ALTER TABLE `limpieza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `idpago` int NOT NULL AUTO_INCREMENT,
  `idsalida` int NOT NULL,
  `cliente` varchar(45) NOT NULL,
  `numero` int NOT NULL,
  `fechaemision` varchar(15) NOT NULL,
  `tipocomprobante` varchar(20) NOT NULL,
  `numcomprobante` int NOT NULL,
  `efectivo` int NOT NULL,
  `tarjeta` int NOT NULL,
  `transferencia` int NOT NULL,
  `descuentos` int NOT NULL,
  `cobrosfraccion` int NOT NULL,
  `valorcobrar` int NOT NULL,
  `netoapagar` int NOT NULL,
  `empleado` varchar(45) NOT NULL,
  `numero_turno` int NOT NULL,
  `deuda_anterior` int NOT NULL,
  `estado` varchar(25) NOT NULL,
  PRIMARY KEY (`idpago`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (2,0,'alexander nieves',1,'19-06-2024','Recibo',1,306000,0,0,0,6000,306000,306000,'Ana marcela Diaz Rodriguez',62,0,'Pagado'),(3,0,'edith del carmen romero reyes',211,'20-06-2024','Recibo',2,25000,50000,50000,0,0,125000,125000,'Ana marcela Diaz Rodriguez',67,0,'Pagado'),(4,0,'lucia mendoza',210,'20-06-2024','Recibo',3,84000,0,0,0,0,84000,84000,'Ana marcela Diaz Rodriguez',69,0,'Pagado'),(5,0,'carlos  puentes',2,'20-06-2024','Recibo',4,60000,0,0,0,0,60000,60000,'Ana marcela Diaz Rodriguez',70,0,'Pagado'),(6,0,'alexander nieves',25,'20-06-2024','Recibo',5,84000,0,0,0,0,84000,84000,'Ana marcela Diaz Rodriguez',71,0,'Pagado'),(7,0,'alexander nieves',25,'20-06-2024','Recibo',6,84000,0,0,0,0,84000,84000,'Ana marcela Diaz Rodriguez',72,0,'Pagado'),(8,0,'alexander nieves',25,'20-06-2024','Recibo',7,84000,0,0,0,0,84000,84000,'Ana marcela Diaz Rodriguez',73,0,'Pagado'),(9,0,'lucia mendoza',210,'20-06-2024','Recibo',8,84000,0,0,0,0,84000,84000,'Ana marcela Diaz Rodriguez',73,0,'Pagado'),(10,0,'lucia mendoza',210,'20-06-2024','Recibo',9,40000,44000,0,0,0,84000,84000,'Ana marcela Diaz Rodriguez',74,0,'Pagado'),(11,0,'alexander nieves',25,'20-06-2024','Recibo',10,4000,20000,60000,0,0,84000,84000,'',74,0,'Pagado'),(12,0,'alexander nieves',25,'24-06-2024','Recibo',11,336000,0,0,0,0,336000,336000,'jLabel2 jLabel3',2,0,'Pagado'),(13,0,'lucia mendoza',8,'25-06-2024','Recibo',12,74000,0,0,0,0,74000,410000,'ANA MARCELA DIAZ RODRIGUEZ',5,336000,'Pagado'),(14,0,'lucia mendoza',8,'28-06-2024','Recibo',13,342800,0,0,0,16800,342800,342800,'GINA PEREZ',7,336000,'Pagado'),(15,0,'carlos  puentes',7,'28-06-2024','Recibo',14,0,297000,0,0,0,297000,297000,'jLabel2 jLabel3',7,0,'Pagado'),(16,0,'carlos  puentes',9,'10-07-2024','Recibo',15,0,60000,0,0,0,60000,60000,'ANA MARCELA DIAZ RODRIGUEZ',14,0,'Pagado'),(17,0,'lucia mendoza',8,'10-07-2024','Recibo',16,500000,834000,0,0,0,1334000,1670000,'',14,336000,'Pagado'),(18,0,'carlos  puentes',9,'10-07-2024','Recibo',17,0,0,66000,0,6000,66000,66000,'ANA MARCELA DIAZ RODRIGUEZ',15,0,'Pagado'),(19,0,'carlos  puentes',2,'10-07-2024','Recibo',18,6000,0,0,0,6000,6000,48400,'GINA PEREZ',16,42400,'Pagado'),(20,0,'alexander nieves',22,'11-07-2024','Recibo',19,84000,0,0,0,0,84000,84000,'ANA MARCELA DIAZ RODRIGUEZ',19,0,'Pagado'),(21,0,'carlos  puentes',3,'11-07-2024','Recibo',20,0,60000,0,0,0,60000,60000,'jLabel2 jLabel3',19,0,'Pagado'),(22,0,'carlos  puentes',4,'11-07-2024','Recibo',21,60000,0,0,0,0,60000,60000,'jLabel2 jLabel3',19,0,'Pagado'),(23,0,'carlos  puentes',1,'11-07-2024','Recibo',22,60000,0,0,0,0,60000,60000,'jLabel2 jLabel3',19,0,'Pagado'),(24,0,'alexander nieves',4,'11-07-2024','Recibo',23,80000,0,0,0,0,80000,80000,'',19,0,'Pagado'),(25,0,'alexander nieves',10,'16-07-2024','Recibo',24,200000,61000,0,21000,0,261000,261000,'Alexander   Nieves Romero',43,0,'Pagado'),(26,0,'lucia mendoza',6,'16-07-2024','Recibo',25,0,0,60000,0,0,60000,60000,'',43,0,'Pagado'),(27,0,'alexander nieves',6,'16-07-2024','Recibo',26,0,0,60000,0,0,60000,360000,'Alexander   Nieves Romero',43,300000,'Pagado');
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `idpersona` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `tipodocumento` varchar(50) NOT NULL,
  `numdocumento` varchar(11) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `telefono` varchar(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `pais` varchar(255) NOT NULL,
  `ciudad` varchar(100) NOT NULL,
  PRIMARY KEY (`idpersona`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `telefono_UNIQUE` (`telefono`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (78,'Gina','Perez','Cedula de ciudadania','1105698','turbaco','3225131','andresg@gmail.com','colom','cartagena'),(81,'ANA MARCELA','DIAZ RODRIGUEZ','Cedula de ciudadania','1128325348','URB Asturias','3023700341','madiazrodriguez@gmail.com','colombia','cartagena'),(83,'combugas','usuario general','Targeta de identidad','900139412-2','ternera','00','oo','colombia','cartagena'),(84,'BERLUDIS','QUINTANA','Cedula de ciudadania','1143356','turbaco','313','berludis','colombia','cartagena'),(85,'Alexander ',' Nieves Romero','Cedula de ciudadania','1143362120','los Alpes norte','3226141645','alexnives_romero@otlook.com','colombia','cartagena');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idproducto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(15) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `unidad_medida` varchar(25) NOT NULL,
  `precio_venta` decimal(7,2) NOT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reserva` (
  `idreserva` int NOT NULL AUTO_INCREMENT,
  `idhabitacion` int NOT NULL,
  `idcliente` int NOT NULL,
  `idempleado` int NOT NULL,
  `tiporeserva` varchar(20) NOT NULL,
  `numreserva` int DEFAULT NULL,
  `fechareserva` date NOT NULL,
  `fechaingreso` date DEFAULT NULL,
  `fechasalida` date NOT NULL,
  `costoalojamiento` decimal(7,2) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `numpersonas` int DEFAULT NULL,
  `numnoches` int NOT NULL,
  PRIMARY KEY (`idreserva`),
  UNIQUE KEY `numreserva` (`numreserva`),
  KEY `fk_reserva_empleado_idx` (`idempleado`),
  KEY `fk_resserva_habitacion_idx` (`idhabitacion`),
  KEY `fk_reserva_cliente_idx` (`idcliente`),
  CONSTRAINT `fk_reserva_cliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`),
  CONSTRAINT `fk_reserva_empleado` FOREIGN KEY (`idempleado`) REFERENCES `empleado` (`idpersona`),
  CONSTRAINT `fk_reserva_habitacion` FOREIGN KEY (`idhabitacion`) REFERENCES `habitacion` (`idHabitacion`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (1,14,1,81,'Reserva',NULL,'2024-06-05','2024-06-05','2024-06-06',84000.00,'Reserva estandar ',3,1);
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salida`
--

DROP TABLE IF EXISTS `salida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salida` (
  `idsalida` int NOT NULL AUTO_INCREMENT,
  `idingreso` int NOT NULL,
  `idcliente` int NOT NULL,
  `idhabitacion` int NOT NULL,
  `idabono` int NOT NULL,
  `empleado` varchar(45) NOT NULL,
  `numero` int NOT NULL,
  `cliente` varchar(100) DEFAULT NULL,
  `numnoches` int DEFAULT NULL,
  `costoalojamiento` int DEFAULT NULL,
  `fechaingreso` varchar(50) NOT NULL,
  `fechasalida` varchar(50) NOT NULL,
  `tipocliente` varchar(50) NOT NULL,
  `valor_noches` int NOT NULL,
  `abonos` int NOT NULL,
  `valor_total` int NOT NULL,
  `descuentos` int NOT NULL,
  `cobros_extra` int NOT NULL,
  `otros_cobros` int NOT NULL,
  `totalpago` int NOT NULL,
  `numero_turno` int NOT NULL,
  `deuda_anterior` int NOT NULL,
  PRIMARY KEY (`idsalida`),
  KEY `fk_salida_cliente_idx` (`idcliente`),
  KEY `fk_salida_habitacion_idx` (`idhabitacion`),
  KEY `fk_salida_empleado_idx` (`empleado`),
  CONSTRAINT `fk_salida_cliente` FOREIGN KEY (`idcliente`) REFERENCES `cliente` (`idcliente`),
  CONSTRAINT `fk_salida_habitacion` FOREIGN KEY (`idhabitacion`) REFERENCES `habitacion` (`idHabitacion`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salida`
--

LOCK TABLES `salida` WRITE;
/*!40000 ALTER TABLE `salida` DISABLE KEYS */;
INSERT INTO `salida` VALUES (1,1,10,14,17,'',22,'alexander nieves',1,84000,'11-06-2024 03:38 PM','11-06-2024 03:45 PM','General',84000,50000,34000,0,0,0,34000,0,0),(2,13,15,36,19,'',35,'carlos  puentes',1,80000,'15-06-2024 11:05 AM','15-06-2024 11:08 AM','General',80000,40000,40000,0,0,0,40000,0,0),(3,13,15,36,19,'Ana marcela Diaz Rodriguez',35,'carlos  puentes',1,80000,'15-06-2024 11:05 AM','15-06-2024 11:08 AM','General',80000,40000,40000,0,0,0,40000,0,0),(4,9,14,11,7,'Ana marcela Diaz Rodriguez',11,'edith del carmen romero reyes',1,60000,'14-06-2024 09:45 AM','15-06-2024 11:20 AM','General',60000,60000,0,0,6000,0,6000,0,0),(5,10,10,10,8,'jLabel2 jLabel3',10,'alexander nieves',1,60000,'14-06-2024 11:26 AM','15-06-2024 11:23 AM','General',60000,50000,13000,3000,6000,0,19000,0,0),(6,3,10,8,2,'',8,'alexander nieves',2,84000,'13-06-2024 06:09 PM','15-06-2024 11:25 AM','General',168000,0,168000,0,8400,0,176400,0,0),(7,5,10,9,0,'',9,'alexander nieves',1,60000,'14-06-2024 12:05 PM','15-06-2024 11:29 AM','General',60000,0,60000,0,6000,0,66000,0,0),(8,2,10,31,18,'',211,'alexander nieves',1,125000,'15-06-2024 08:14 AM','15-06-2024 11:33 AM','General',125000,0,125000,0,12500,0,137500,0,0),(9,8,1,6,6,'',6,'lucia mendoza',4,60000,'14-06-2024 09:37 AM','18-06-2024 10:28 AM','General',240000,50000,190000,0,0,0,190000,0,0),(10,8,1,6,6,'',6,'lucia mendoza',4,60000,'14-06-2024 09:37 AM','18-06-2024 10:28 AM','General',240000,50000,190000,0,0,0,190000,0,0),(11,8,1,6,6,'',6,'lucia mendoza',4,60000,'14-06-2024 09:37 AM','18-06-2024 10:28 AM','General',240000,50000,190000,0,0,0,190000,0,0),(12,11,15,13,0,'',21,'carlos  puentes',3,84000,'15-06-2024 07:56 AM','18-06-2024 11:14 AM','General',252000,0,252000,0,8400,0,260400,0,0),(13,4,10,7,0,'',7,'alexander nieves',3,75000,'15-06-2024 08:44 AM','18-06-2024 11:19 AM','General',225000,0,225000,0,7500,0,232500,0,0),(14,6,1,5,18,'',5,'lucia mendoza',1,60000,'18-06-2024 08:58 AM','18-06-2024 11:36 AM','General',60000,0,60000,0,6000,0,66000,0,0),(15,12,15,30,9,'',210,'carlos  puentes',4,84000,'15-06-2024 10:06 AM','19-06-2024 09:15 AM','General',336000,180000,156000,0,0,0,156000,0,1170000),(16,14,10,1,0,'Ana marcela Diaz Rodriguez',1,'alexander nieves',5,60000,'14-06-2024 07:57 AM','19-06-2024 11:33 AM','General',300000,0,300000,0,6000,0,306000,0,0),(17,17,14,31,0,'',211,'edith del carmen romero reyes',1,125000,'20-06-2024 10:18 AM','20-06-2024 05:50 PM','General',125000,0,125000,0,0,0,125000,0,0),(18,15,15,2,0,'',2,'carlos  puentes',1,60000,'20-06-2024 10:04 AM','20-06-2024 09:15 PM','General',60000,0,60000,0,0,0,60000,0,0),(19,18,10,17,0,'',25,'alexander nieves',4,84000,'20-06-2024 10:19 AM','24-06-2024 09:35 PM','General',336000,0,336000,0,0,0,336000,0,0),(20,19,15,7,11,'',7,'carlos  puentes',4,75000,'24-06-2024 09:40 PM','28-06-2024 04:56 PM','General',300000,3000,297000,0,0,0,297000,0,0),(21,16,1,8,20,'',8,'lucia mendoza',16,84000,'24-06-2024 09:29 PM','10-07-2024 10:17 AM','General',1344000,10000,1334000,0,0,0,1334000,0,336000),(22,20,15,9,0,'',9,'carlos  puentes',1,60000,'09-07-2024 11:14 AM','10-07-2024 11:31 AM','General',60000,0,60000,0,6000,0,66000,0,0),(23,22,15,2,21,'',2,'carlos  puentes',1,60000,'10-07-2024 11:45 AM','10-07-2024 11:48 AM','General',60000,60000,0,0,6000,0,6000,0,42400),(24,23,10,14,0,'',22,'alexander nieves',1,84000,'10-07-2024 11:39 AM','11-07-2024 09:02 AM','General',84000,0,84000,0,0,0,84000,0,0),(25,24,15,3,0,'',3,'carlos  puentes',1,60000,'11-07-2024 09:04 AM','11-07-2024 09:12 AM','General',60000,0,60000,0,0,0,60000,0,0),(26,25,15,4,0,'',4,'carlos  puentes',1,60000,'11-07-2024 09:12 AM','11-07-2024 09:47 AM','General',60000,0,60000,0,0,0,60000,0,0),(27,26,15,1,0,'',1,'carlos  puentes',1,60000,'11-07-2024 09:48 AM','11-07-2024 10:09 AM','General',60000,0,60000,0,0,0,60000,0,0),(28,21,10,10,12,'',10,'alexander nieves',7,60000,'09-07-2024 12:10 PM','16-07-2024 08:32 AM','General',420000,180000,261000,21000,0,0,261000,0,0),(29,29,1,6,0,'',6,'lucia mendoza',1,60000,'15-07-2024 08:42 AM','16-07-2024 08:34 AM','General',60000,0,60000,0,0,0,60000,0,0),(30,27,10,6,22,'',6,'alexander nieves',1,60000,'16-07-2024 08:39 AM','16-07-2024 08:43 AM','General',60000,20000,40000,0,0,20000,60000,0,300000);
/*!40000 ALTER TABLE `salida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salidaturno`
--

DROP TABLE IF EXISTS `salidaturno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salidaturno` (
  `idsalidaturno` int NOT NULL AUTO_INCREMENT,
  `idabonos` int NOT NULL,
  `idempleado` int NOT NULL,
  `empleado` varchar(45) NOT NULL,
  `idhabitacion` int NOT NULL,
  `turno` varchar(45) NOT NULL,
  `fecha_hora_inicio` varchar(45) NOT NULL,
  `fecha_hora_salida` varchar(45) NOT NULL,
  `habitaciones_ocupadas` int NOT NULL,
  `total_recibos` int NOT NULL,
  `base` int NOT NULL,
  `tarjetas` int NOT NULL,
  `efectivo` int NOT NULL,
  `transferencias` int NOT NULL,
  `totalhabitaciones` decimal(10,0) NOT NULL,
  `total_abonos` int NOT NULL,
  `otros_ingresos` int NOT NULL,
  `total_recaudo` int NOT NULL,
  `entrega_admon` int NOT NULL,
  `total_efectivo` int NOT NULL,
  `observaciones` varchar(100) DEFAULT NULL,
  `numero_turno` int NOT NULL,
  PRIMARY KEY (`idsalidaturno`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salidaturno`
--

LOCK TABLES `salidaturno` WRITE;
/*!40000 ALTER TABLE `salidaturno` DISABLE KEYS */;
INSERT INTO `salidaturno` VALUES (1,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 01/06/2024','01-06-2024 04:17 PM','01-06-2024 04:54 PM',0,0,150000,0,0,0,0,0,0,0,0,0,'uuk',0),(2,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 05/06/2024','05-06-2024 09:38 AM','05-06-2024 10:31 AM',3,0,150000,0,0,0,204000,0,0,0,0,0,'ssfgfg',0),(3,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 11/06/2024','11-06-2024 01:12 PM','11-06-2024 01:13 PM',29,0,150000,0,0,0,3767000,0,0,0,0,0,'',13),(4,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 11/06/2024','11-06-2024 01:12 PM','11-06-2024 01:13 PM',29,0,150000,0,0,0,3767000,0,0,0,0,0,'',13),(5,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 11/06/2024','11-06-2024 01:17 PM','11-06-2024 01:17 PM',29,0,150000,0,0,0,3767000,0,0,0,0,0,'',15),(6,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 11/06/2024','11-06-2024 01:29 PM','11-06-2024 01:29 PM',29,0,150000,0,0,0,3767000,0,0,0,0,0,'',16),(7,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 11/06/2024','11-06-2024 01:32 PM','11-06-2024 01:32 PM',29,0,150000,0,0,0,3767000,0,0,0,0,0,'',17),(8,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 11/06/2024','11-06-2024 01:41 PM','11-06-2024 01:41 PM',29,0,150000,0,0,0,3767000,0,0,0,0,0,'',18),(9,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 11/06/2024','11-06-2024 04:38 PM','11-06-2024 04:45 PM',1,0,150000,0,0,0,80000,0,0,0,0,0,'',24),(10,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 11/06/2024','11-06-2024 04:38 PM','11-06-2024 04:45 PM',1,0,150000,0,0,0,80000,0,0,0,0,0,'',24),(11,0,78,'andres galvis',0,'Turno 1 11/06/2024','11-06-2024 04:51 PM','11-06-2024 04:51 PM',1,0,150000,0,0,0,80000,0,0,0,0,0,'',26),(12,0,78,'andres galvis',0,'Turno 1 11/06/2024','11-06-2024 05:47 PM','11-06-2024 05:52 PM',1,0,150000,0,0,0,60000,0,0,0,0,0,'',29),(13,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 13/06/2024','12-06-2024 06:58 PM','13-06-2024 10:02 AM',1,0,150000,0,0,0,60000,0,0,0,0,0,'',33),(14,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 13/06/2024','13-06-2024 10:59 AM','13-06-2024 11:17 AM',1,0,150000,0,0,0,75000,0,0,0,0,0,'',37),(15,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 15/06/2024','15-06-2024 08:13 AM','15-06-2024 08:47 AM',9,0,150000,0,0,0,644000,0,0,0,0,0,'',43),(16,0,78,'andres galvis',0,'Turno 1 15/06/2024','15-06-2024 09:23 AM','15-06-2024 09:22 AM',9,0,150000,0,0,0,644000,0,0,0,0,0,'',45),(17,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 15/06/2024','15-06-2024 09:23 AM','15-06-2024 09:22 AM',9,0,150000,0,0,0,644000,0,0,0,0,0,'',46),(18,0,0,'jLabel2 jLabel3',0,'Turno 1 18/06/2024','15-06-2024 11:02 AM','18-06-2024 08:35 AM',5,0,150000,0,0,0,363000,0,0,0,0,0,'',49),(19,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 18/06/2024','18-06-2024 08:36 AM','18-06-2024 08:35 AM',5,0,150000,0,0,0,363000,0,0,0,0,0,'',50),(20,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 18/06/2024','18-06-2024 08:44 AM','18-06-2024 08:44 AM',5,0,150000,0,0,0,363000,0,0,0,0,0,'',51),(21,0,78,'andres galvis',0,'Turno 1 18/06/2024','18-06-2024 08:58 AM','18-06-2024 09:19 AM',5,0,150000,0,0,0,363000,0,0,0,0,0,'',52),(22,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 18/06/2024','18-06-2024 10:18 AM','18-06-2024 10:23 AM',5,0,150000,0,0,0,363000,0,0,0,0,0,'',53),(23,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 18/06/2024','18-06-2024 10:28 AM','18-06-2024 10:33 AM',4,0,150000,0,0,0,303000,0,0,0,0,0,'',54),(24,0,78,'andres galvis',0,'Turno 1 18/06/2024','18-06-2024 10:28 AM','18-06-2024 10:33 AM',4,0,150000,0,0,0,303000,0,0,0,0,0,'',55),(25,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 18/06/2024','18-06-2024 11:14 AM','18-06-2024 11:17 AM',3,0,150000,0,0,0,219000,0,0,0,0,0,'',56),(26,0,78,'andres galvis',0,'Turno 1 18/06/2024','18-06-2024 11:14 AM','18-06-2024 11:17 AM',3,0,150000,0,0,0,219000,0,0,0,0,0,'',57),(27,0,78,'andres galvis',0,'Turno 1 18/06/2024','18-06-2024 11:19 AM','18-06-2024 11:35 AM',2,0,150000,0,0,0,144000,0,0,0,0,0,'',58),(28,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 18/06/2024','18-06-2024 11:35 AM','18-06-2024 11:38 AM',1,0,150000,0,0,0,84000,0,0,0,0,0,'',59),(29,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 20/06/2024','20-06-2024 10:03 AM','20-06-2024 10:25 AM',4,0,150000,0,0,0,353000,0,0,0,0,0,'',63),(30,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 20/06/2024','20-06-2024 10:29 AM','20-06-2024 10:36 AM',4,0,150000,0,0,0,353000,0,0,0,0,0,'',65),(31,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 20/06/2024','20-06-2024 05:50 PM','20-06-2024 05:54 PM',3,0,150000,0,0,0,228000,0,0,0,0,0,'',67),(32,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 20/06/2024','20-06-2024 06:39 PM','20-06-2024 07:22 PM',3,0,150000,0,0,0,228000,0,0,0,0,0,'',68),(33,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 20/06/2024','20-06-2024 08:06 PM','20-06-2024 08:07 PM',3,0,150000,0,0,0,228000,0,0,0,0,0,'',69),(34,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 20/06/2024','20-06-2024 09:14 PM','20-06-2024 09:16 PM',2,0,150000,0,0,0,168000,0,0,0,0,0,'',70),(35,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 20/06/2024','20-06-2024 09:31 PM','20-06-2024 09:32 PM',2,0,150000,0,0,0,168000,0,0,0,0,0,'',71),(36,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 20/06/2024','20-06-2024 09:39 PM','20-06-2024 09:40 PM',2,0,150000,0,0,0,168000,0,0,0,0,0,'',72),(37,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 20/06/2024','20-06-2024 09:48 PM','20-06-2024 09:48 PM',2,0,150000,0,168000,0,168000,0,0,0,0,0,'',73),(38,0,0,'jLabel2 jLabel3',0,'Turno 1 21/06/2024','20-06-2024 10:05 PM','21-06-2024 06:44 PM',2,0,150000,64000,44000,60000,168000,90000,0,258000,44000,0,'',74),(39,0,81,'Ana marcela Diaz Rodriguez',0,'Turno 1 21/06/2024','21-06-2024 06:54 PM','21-06-2024 06:56 PM',2,0,150000,0,0,0,168000,0,0,0,0,0,'',75),(40,0,0,'GINA PEREZ',0,'Turno 1 24/06/2024','24-06-2024 06:01 PM','24-06-2024 08:34 PM',2,0,150000,0,0,0,168000,0,0,0,0,0,'',80),(41,0,0,'GINA PEREZ',0,'Turno 1 24/06/2024','24-06-2024 09:07 PM','24-06-2024 09:11 PM',2,0,150000,0,0,0,168000,0,0,0,0,0,'',81),(42,0,0,'GINA PEREZ',0,'Turno 1 24/06/2024','24-06-2024 09:21 PM','24-06-2024 09:23 PM',2,0,150000,0,0,0,168000,0,0,0,0,0,'',1),(43,0,0,'GINA PEREZ',0,'Turno 1 24/06/2024','24-06-2024 09:23 PM','24-06-2024 09:33 PM',1,0,150000,0,336000,0,84000,10000,0,346000,336000,0,'',2),(44,0,0,'GINA PEREZ',0,'Turno 1 24/06/2024','24-06-2024 09:38 PM','24-06-2024 09:59 PM',2,0,150000,0,0,0,159000,0,0,0,0,0,'',3),(45,0,0,'GINA PEREZ',0,'Turno 1 25/06/2024','25-06-2024 04:08 PM','25-06-2024 04:09 PM',2,0,150000,0,0,0,159000,0,0,0,0,0,'',4),(46,0,0,'GINA PEREZ',0,'Turno 1 26/06/2024','25-06-2024 06:34 PM','26-06-2024 03:25 PM',2,0,150000,0,74000,0,159000,0,0,74000,74000,0,'',5),(48,0,0,'GINA PEREZ',0,'Turno 1 28/06/2024','26-06-2024 03:28 PM','28-06-2024 01:08 PM',2,0,150000,0,0,0,159000,0,0,0,0,0,'',6),(49,0,0,'jLabel2 jLabel3',0,'Turno 1 28/06/2024','28-06-2024 01:08 PM','28-06-2024 04:56 PM',2,0,150000,0,342800,0,159000,0,0,342800,342800,0,'',7),(50,0,0,'GINA PEREZ',0,'Turno 1 02/07/2024','28-06-2024 05:00 PM','02-07-2024 04:36 PM',1,0,150000,0,0,0,84000,0,0,0,0,0,'',8),(51,0,0,'jLabel2 jLabel3',0,'Turno 1 08/07/2024','02-07-2024 04:36 PM','08-07-2024 09:18 AM',1,0,150000,0,0,0,84000,0,0,0,0,0,'',9),(52,0,0,'GINA PEREZ',0,'Turno 1 09/07/2024','09-07-2024 09:01 AM','09-07-2024 09:04 AM',1,0,150000,0,0,0,84000,0,0,0,0,0,'',10),(53,0,0,'GINA PEREZ',0,'Turno 1 09/07/2024','09-07-2024 09:01 AM','09-07-2024 09:04 AM',1,0,150000,0,0,0,84000,0,0,0,0,0,'',10),(54,0,0,'GINA PEREZ',0,'Turno 1 09/07/2024','09-07-2024 09:01 AM','09-07-2024 09:07 AM',1,0,150000,0,0,0,84000,0,0,0,0,0,'',10),(55,0,0,'GINA PEREZ',0,'Turno 1 09/07/2024','09-07-2024 09:10 AM','09-07-2024 09:15 AM',1,0,150000,0,0,0,84000,0,0,0,0,0,'',11),(56,0,0,'GINA PEREZ',0,'Turno 1 09/07/2024','09-07-2024 09:10 AM','09-07-2024 09:32 AM',1,0,150000,0,0,0,84000,0,0,0,0,0,'',11),(57,0,0,'GINA PEREZ',0,'Turno 1 10/07/2024','10-07-2024 09:32 AM','10-07-2024 09:32 AM',3,0,150000,0,0,0,204000,0,0,0,0,0,'',12),(58,0,0,'GINA PEREZ',0,'Turno 1 10/07/2024','10-07-2024 09:32 AM','10-07-2024 09:33 AM',3,0,150000,0,0,0,204000,0,0,0,0,0,'Ninguna',13),(59,0,0,'ANA MARCELA DIAZ RODRIGUEZ',0,'Turno 1 10/07/2024','10-07-2024 09:34 AM','10-07-2024 10:22 AM',2,0,150000,894000,500000,0,120000,0,0,1394000,500000,0,'ninguna',14),(60,0,0,'GINA PEREZ',0,'Turno 1 10/07/2024','10-07-2024 11:44 AM','10-07-2024 11:53 AM',2,0,150000,0,6000,0,144000,60000,0,114400,6000,42400,'',16),(61,0,0,'GINA PEREZ',0,'Turno 1 10/07/2024','10-07-2024 12:00 PM','10-07-2024 12:03 PM',2,0,150000,0,0,0,144000,0,0,0,0,0,'',17),(62,0,0,'GINA PEREZ',0,'Turno 1 10/07/2024','10-07-2024 12:05 PM','10-07-2024 12:05 PM',2,0,150000,0,0,0,144000,0,0,0,0,0,'',18),(63,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','11-07-2024 09:02 AM','13-07-2024 09:30 AM',2,0,150000,60000,284000,0,120000,0,0,688000,284000,0,'',19),(64,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 09:50 AM','13-07-2024 09:52 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',20),(65,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 09:52 AM','13-07-2024 10:07 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',21),(66,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 10:08 AM','13-07-2024 10:07 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',22),(67,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 10:25 AM','13-07-2024 10:29 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',23),(68,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 10:29 AM','13-07-2024 10:34 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',24),(69,0,0,'ANA MARCELA DIAZ RODRIGUEZ',0,'Turno 1 13/07/2024','13-07-2024 10:34 AM','13-07-2024 10:37 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',25),(70,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 10:38 AM','13-07-2024 10:38 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',26),(71,0,0,'ANA MARCELA DIAZ RODRIGUEZ',0,'Turno 1 13/07/2024','13-07-2024 10:38 AM','13-07-2024 10:38 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',27),(72,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 10:39 AM','13-07-2024 11:20 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',28),(73,0,0,'ANA MARCELA DIAZ RODRIGUEZ',0,'Turno 1 13/07/2024','13-07-2024 11:20 AM','13-07-2024 11:20 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',29),(74,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 11:22 AM','13-07-2024 11:38 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',30),(75,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 11:38 AM','13-07-2024 11:50 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',31),(76,0,0,'ANA MARCELA DIAZ RODRIGUEZ',0,'Turno 1 13/07/2024','13-07-2024 11:50 AM','13-07-2024 11:51 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',32),(77,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 11:51 AM','13-07-2024 11:59 AM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',33),(78,0,0,'GINA PEREZ',0,'Turno 1 13/07/2024','13-07-2024 11:59 AM','13-07-2024 12:32 PM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',34),(79,0,0,'ANA MARCELA DIAZ RODRIGUEZ',0,'Turno 1 13/07/2024','13-07-2024 12:33 PM','13-07-2024 12:33 PM',2,0,150000,0,0,0,120000,0,0,0,0,0,'',35),(80,0,0,'ANA MARCELA DIAZ RODRIGUEZ',0,'Turno 1 15/07/2024','15-07-2024 08:28 AM','15-07-2024 09:54 AM',4,0,150000,0,0,0,240000,0,0,0,0,0,'',36),(81,0,0,'GINA PEREZ',0,'Turno 1 15/07/2024','15-07-2024 09:55 AM','15-07-2024 10:16 AM',4,0,150000,0,0,0,240000,0,0,0,0,0,'',37),(82,0,0,'GINA PEREZ',0,'Turno 1 15/07/2024','15-07-2024 10:17 AM','15-07-2024 10:22 AM',4,0,150000,0,0,0,240000,0,0,0,0,0,'',38),(83,0,0,'Alexander   Nieves Romero',0,'Turno 1 15/07/2024','15-07-2024 10:23 AM','15-07-2024 10:25 AM',4,0,150000,0,0,0,240000,0,0,0,0,0,'',39),(84,0,0,'Alexander   Nieves Romero',0,'Turno 1 15/07/2024','15-07-2024 10:25 AM','15-07-2024 10:25 AM',4,0,150000,0,0,0,240000,0,0,0,0,0,'',40),(85,0,0,'GINA PEREZ',0,'Turno 1 15/07/2024','15-07-2024 10:26 AM','15-07-2024 11:35 AM',4,0,150000,0,0,0,240000,0,0,0,0,0,'',41),(86,0,0,'Alexander   Nieves Romero',0,'Turno 1 15/07/2024','15-07-2024 12:08 PM','15-07-2024 12:08 PM',4,0,150000,0,0,0,240000,0,0,0,0,0,'',42);
/*!40000 ALTER TABLE `salidaturno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculo` (
  `idvehiculo` int NOT NULL AUTO_INCREMENT,
  `placa` varchar(8) NOT NULL,
  `modelo` varchar(10) NOT NULL,
  `tipo_vahiculo` varchar(45) NOT NULL,
  PRIMARY KEY (`idvehiculo`),
  CONSTRAINT `fk_vehiculo_cliente` FOREIGN KEY (`idvehiculo`) REFERENCES `cliente` (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-16  9:39:44
