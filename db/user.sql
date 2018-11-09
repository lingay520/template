# Host: 192.168.0.9  (Version 5.5.38-0ubuntu0.12.04.1)
# Date: 2018-11-09 09:31:52
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "user"
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `add_time` bigint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'小狗',1541719220369),(2,'小明',1541719220369),(3,'xiaomao',1541719974660),(4,'小猫',1541720595301),(5,'xiaomao',1541719974660),(6,NULL,0),(7,NULL,0),(8,'',0),(9,'dsfsdf',0),(10,NULL,0),(11,NULL,0),(12,NULL,0),(13,'sdfdsfs',0),(14,'sdfdsfs',0),(15,NULL,0),(16,NULL,0),(17,NULL,0),(18,'sdfsdfsf222',0),(19,'sdfs2223dfsf222',0),(20,'小猫',1541725451599),(21,'小猫',1541725523548),(22,'小猫',1541725858421),(23,'sdfs2223dfsf222',0),(24,'小猫',1541726308526),(25,'sdfs2223dfsf222',0);
