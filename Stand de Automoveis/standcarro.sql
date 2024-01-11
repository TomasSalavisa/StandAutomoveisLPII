-- --------------------------------------------------------
-- Anfitrião:                    127.0.0.1
-- Versão do servidor:           8.0.30 - MySQL Community Server - GPL
-- SO do servidor:               Win64
-- HeidiSQL Versão:              12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- A despejar estrutura da base de dados para standcarro
CREATE DATABASE IF NOT EXISTS `standcarro` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `standcarro`;

-- A despejar estrutura para tabela standcarro.carros
CREATE TABLE IF NOT EXISTS `carros` (
  `carro_id` int NOT NULL AUTO_INCREMENT,
  `Marca` varchar(50) NOT NULL DEFAULT '',
  `Modelo` varchar(50) NOT NULL DEFAULT '',
  `Segmento` varchar(50) NOT NULL DEFAULT '',
  `Combustivel` int NOT NULL,
  `Preco` int NOT NULL,
  `Ano` int NOT NULL,
  PRIMARY KEY (`carro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Exportação de dados não seleccionada.

-- A despejar estrutura para tabela standcarro.clientes
CREATE TABLE IF NOT EXISTS `clientes` (
  `Cliente_id` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) NOT NULL DEFAULT '',
  `Morada` varchar(50) NOT NULL DEFAULT '',
  `Telefone` int NOT NULL,
  `CodigoPostal` int NOT NULL,
  `Email` varchar(50) NOT NULL DEFAULT '',
  `Login` varchar(50) NOT NULL DEFAULT '',
  `Passe` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`Cliente_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Exportação de dados não seleccionada.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;