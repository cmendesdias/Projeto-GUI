-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: projetojava
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `alunos`
--

DROP TABLE IF EXISTS `alunos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alunos` (
  `id_aluno` int NOT NULL AUTO_INCREMENT,
  `nome_aluno` varchar(50) DEFAULT NULL,
  `nasc_aluno` varchar(10) DEFAULT NULL,
  `id_curso_aluno_fk` int DEFAULT NULL,
  PRIMARY KEY (`id_aluno`),
  KEY `id_curso_aluno_fk` (`id_curso_aluno_fk`),
  CONSTRAINT `alunos_ibfk_1` FOREIGN KEY (`id_curso_aluno_fk`) REFERENCES `cursos` (`id_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alunos`
--

LOCK TABLES `alunos` WRITE;
/*!40000 ALTER TABLE `alunos` DISABLE KEYS */;
INSERT INTO `alunos` VALUES (2,'Generico 2','00/00/0000',10),(3,'Generico 3','21/07/1986',21),(4,'Caio','07/08/2001',1);
/*!40000 ALTER TABLE `alunos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cursos`
--

DROP TABLE IF EXISTS `cursos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursos` (
  `id_curso` int NOT NULL AUTO_INCREMENT,
  `nome_curso` varchar(50) DEFAULT NULL,
  `cod_inst` int DEFAULT NULL,
  `carga_curso` varchar(10) DEFAULT NULL,
  `tipo_curso` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursos`
--

LOCK TABLES `cursos` WRITE;
/*!40000 ALTER TABLE `cursos` DISABLE KEYS */;
INSERT INTO `cursos` VALUES (1,'Ciência da Computação',1,'1000 Horas','Bacharel'),(4,'Teste',1,'1 Hora','Bacharel'),(5,'Psicologia',2,'600 Horas','Bacharel'),(6,'Engenharia',3,'800 Horas','Bacharel'),(7,'Administração',3,'400 Horas','Gestão'),(8,'Medicina',4,'1800 Horas','Outros'),(9,'Técnico',2,'200 Horas','Outros'),(10,'Polímeros',2,'900 Horas','Bacharel'),(11,'Design',1,'150 Horas','Bacharel'),(12,'TI',1,'2000 Horas','Bacharel'),(13,'Biologia',1,'2000 Horas','Bacharel'),(14,'Psiquiatra',1,'750 Horas','Bacharel'),(15,'Neurologia',1,'3750 Horas','Bacharel'),(16,'Arquitetura',1,'1500 Horas','Gestão'),(17,'Elétrica',3,'900','Outros'),(18,'Odontologia',3,'1650','Outros'),(19,'Pedagogia',3,'504','Outros'),(20,'Gestão',4,'510','Outros'),(21,'Segurança da Informação',2,'750 Horas','Bacharel');
/*!40000 ALTER TABLE `cursos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `disciplina` (
  `id_disciplina` int NOT NULL AUTO_INCREMENT,
  `nome_disciplina` varchar(20) DEFAULT NULL,
  `carga_disciplina` varchar(20) DEFAULT NULL,
  `quant_aulas_disciplinas` varchar(30) DEFAULT NULL,
  `id_curso_disciplina_fk` int DEFAULT NULL,
  PRIMARY KEY (`id_disciplina`),
  KEY `id_curso_disciplina_fk` (`id_curso_disciplina_fk`),
  CONSTRAINT `disciplina_ibfk_1` FOREIGN KEY (`id_curso_disciplina_fk`) REFERENCES `cursos` (`id_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disciplina`
--

LOCK TABLES `disciplina` WRITE;
/*!40000 ALTER TABLE `disciplina` DISABLE KEYS */;
INSERT INTO `disciplina` VALUES (5,'POO','90 Horas',' 3',1),(6,'MySQL','120 Horas',' 3',1),(7,'Cálculo II','140 Horas',' 3',1),(8,'Integridade de Dados','90 Horas',' 3',21);
/*!40000 ALTER TABLE `disciplina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professor` (
  `id_professor` int NOT NULL AUTO_INCREMENT,
  `nome_prof` varchar(30) DEFAULT NULL,
  `nasc_prof` varchar(30) DEFAULT NULL,
  `endereco` varchar(200) DEFAULT NULL,
  `certificado` varchar(30) DEFAULT NULL,
  `id_curso_prof_fk` int DEFAULT NULL,
  `id_disciplina_fk` int DEFAULT NULL,
  PRIMARY KEY (`id_professor`),
  KEY `id_curso_prof_fk` (`id_curso_prof_fk`),
  KEY `id_disciplina_fk` (`id_disciplina_fk`),
  CONSTRAINT `professor_ibfk_1` FOREIGN KEY (`id_curso_prof_fk`) REFERENCES `cursos` (`id_curso`),
  CONSTRAINT `professor_ibfk_2` FOREIGN KEY (`id_disciplina_fk`) REFERENCES `disciplina` (`id_disciplina`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` VALUES (1,'M Pai','10/09/1920','Tal','Avançado em Excel',1,6),(2,'M Junior','10/09/1978','Sei lá','Segurança do Trabalho',1,5);
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'projetojava'
--

--
-- Dumping routines for database 'projetojava'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-13 14:34:47
