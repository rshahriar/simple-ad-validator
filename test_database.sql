-- MySQL dump 10.13  Distrib 5.5.36, for Win64 (x86)
--
-- Host: localhost    Database: widespace
-- ------------------------------------------------------
-- Server version	5.5.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ad_status`
--

DROP TABLE IF EXISTS `ad_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ad_status` (
  `appId` varchar(100) NOT NULL,
  `appStatus` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`appId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ad_status`
--

LOCK TABLES `ad_status` WRITE;
/*!40000 ALTER TABLE `ad_status` DISABLE KEYS */;
INSERT INTO `ad_status` VALUES ('01c82f36-c8e8-4aed-9c0f-7c60061d78c1',1),('02305a75-88d2-45fb-a722-67ba9f3a5722',1),('038c09cb-1f75-49ee-93a6-6cb1f6a410d4',1),('06f1f012-9785-4199-a549-5c198b0cc6e3',1),('095bfc1c-92e6-4472-afdd-f8a914ad3273',1),('0fcecf3f-cb18-4383-8175-40630c0b35a5',1),('10acc644-3139-408a-8015-e8d0bcc624b0',1),('10e11392-3079-4506-a6f8-b3ac38f2ce49',1),('13708364-8548-4087-a07a-5a192098503a',1),('1528f46f-93ab-4ac4-948d-51f2002cbffe',1),('15489986-560f-48d1-bda6-4532599c490e',1),('1b1f387a-c7c2-409e-b3fd-c511acba73d9',1),('1cfd5874-2e4f-4b4b-b7cf-9c8aa401127d',1),('219928de-1dc6-4d6f-8456-cebadfb42178',1),('229a6a35-0bde-4c97-afd6-77f4ec3f154c',1),('241167f5-900e-4001-8973-d6c88e0a44c7',1),('253a71c0-a59c-4c12-90a6-2b197bfecd52',1),('28e71d46-ed93-4979-bb78-baf639e34356',1),('2918e283-837d-47e8-8360-79b464ecfc78',1),('2d85d357-dc30-4637-8276-68e3d5571c18',1),('2e820414-cf22-4dc8-8cbc-99ee85223477',1),('2eedba3c-f7c7-4bc8-b474-b31e3e072b5d',1),('31778dc9-579c-43ae-bcb3-71878a868de9',1),('3a9057de-9dd4-4e05-bb12-c5b52cd9b56d',1),('3cc5b973-e7a3-47b3-900e-f49c00b5c769',1),('3d61d38c-1692-41ad-a428-be70ed3802e4',1),('3ff96009-099e-4c94-a417-1a68518eb336',1),('406eacaf-8ac9-4c53-914c-68e8953b1f64',1),('42642742-09f1-4734-bccf-cf28d36a160f',1),('45d8767e-5b3f-4157-8e26-7698893dff7a',1),('473f9421-5325-4189-80ec-1322e845c788',1),('47f9d194-ddf6-48a3-a877-3550da6daf7a',1),('4c069bd8-c60e-411c-826a-23ab2e5c831d',1),('4c0ca2f5-b3f3-414a-b626-1e4487bc3553',1),('51877435-2c61-4db9-b250-398b24a1618a',1),('527ba0f4-5244-4ece-9686-2b6c57c2a5cb',1),('5c4812fa-af69-436d-9f7d-f6ab12440cfa',1),('5d2d4ffe-10d8-4192-8f3b-0c666e372cc1',1),('5ecfb577-77e0-462e-924d-ac70243b561f',1),('65130bcc-f5e0-45b9-9a01-c8502211153d',1),('6b1d3556-a281-4da7-b1c5-74274dc725da',1),('6cbb9986-f512-4a85-9070-33dc1dce8e45',1),('6e2e0ca5-20b1-4906-8a7e-73891d4b9aea',1),('719dcb49-8aea-4a5c-8319-0f6d4c54b98b',1),('7874ddcb-59c4-4d1b-b042-d8d2006aaa51',1),('79dba437-5d44-4896-b4d5-90875fe78ece',1),('7a67b267-299e-4210-91cc-6889ba4f0b8c',1),('7b6bf50b-2d00-4699-81d4-bc8ab06321ab',1),('82087699-5856-4a1c-8bd2-6d1031d37162',1),('82f597e5-ef4e-40ee-a8a4-08b91eb42983',1),('8bf22d79-f355-4301-b751-bfbd8eb140c8',1),('8eba6904-8fb1-4432-a95c-f15a5bb6a45d',1),('8ebac19f-7775-472a-b3fd-aad73bf9b914',1),('92f17774-ff57-422d-9004-ebb628b6fa25',1),('96bb1599-53cf-46e6-b623-5d72c380dabe',1),('9a9a93ed-7a25-473a-a367-0d013f4161ca',1),('a065d844-fbcc-4b29-8989-75340f64c698',1),('a0778c16-043f-4382-a5cd-f6bfc37963c4',1),('a0c2fb66-0fc1-46f5-87c9-bcf26961b82b',1),('a3c1d87a-44a9-44b3-9665-d947570d6ce6',1),('a5113064-640c-43c8-b47e-c2ea67e5d7a0',1),('a64e8df3-9747-446a-afb3-e46056b839bc',1),('a9337785-c200-4ace-bbc5-5d11495c5bf9',1),('aba5c719-1a32-43aa-8411-e5684849b5a2',1),('acaf1ee4-ce6d-4b6d-8400-329de55bc289',1),('ae611547-9457-4c96-b00e-1fa84226b052',1),('b2255f32-651e-43df-b1e5-b3e0d86b571b',1),('b5cbbc68-c3d6-4165-9561-96ba6798ca3f',1),('b6f97e34-7079-4c86-b3a3-f655ea555ca2',1),('bc179bd4-dedf-48e4-84cc-ec4cbc844dfc',1),('be2a15bd-8af6-4120-a6f4-3952123fa426',1),('beb01209-033b-401b-a1b3-f08869df86f3',1),('bf7dd88f-cef1-4fce-b294-b98b92f91d73',1),('bf87cae4-ea6f-4238-a5ad-ffa31d61d68a',1),('c347bd70-caf0-42eb-b0f4-c1df679c55c1',1),('c54467c0-65e7-4cf7-b780-8397173050e9',1),('c7eeac8f-e1ec-4085-b2c7-e6ead5b074f0',1),('c93770ba-2193-4ede-b3db-b50f7eee73fe',1),('ca7d9e58-aa68-4f83-b873-a2ac1f4c247a',1),('caf329a3-70e7-471a-a39e-b02c048b8134',1),('cc096ee8-923c-4337-97c7-3eb4148114ef',1),('cc5b3a13-64ef-4088-923a-a5aefa859e14',1),('d227611f-ec2c-449d-b87e-e0f39f04af0e',1),('d5b93151-bc76-49f2-b546-a3d5f905bff3',1),('d785ac4a-9e06-4f18-af74-b840039b5ce6',1),('da99423d-7fd0-474e-9c52-ba0618574b4a',1),('dbeec74a-64d4-4e07-aaef-d68453dedaa7',1),('dc9343c7-e8d6-4e22-a459-986c4601d9f3',1),('e0dd6055-8338-4dfa-8fd1-4929ba5b158d',1),('e34cca88-e0d4-4454-8bd7-7c956b33f1bc',1),('e57bdf8f-7b83-4eef-bdb3-5e12fcbe1f1b',1),('ea78a8dd-67ac-47e2-a9cc-9e69b9c70a31',1),('ed1854b6-2e07-46c9-86f8-b80965da48ca',1),('ed1e7121-78a3-42b5-a2ea-ada8e48e7da9',1),('eeb06a67-cb8f-429a-a78f-854b6b9908bf',1),('f0cf541b-2b8d-4e83-8a01-58a4d30e6149',1),('f76d08d0-1414-48e1-a01d-cefb9805cc50',1),('f9105b04-79d3-41dd-8bba-c811920f725d',1),('fb017876-49e4-4f89-860b-3170b779f6c0',1),('fbb77207-193c-47ac-9892-d7d673faa0b4',1);
/*!40000 ALTER TABLE `ad_status` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-02-16 21:37:50
