--雇员表
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` bigint(20) NOT NULL,
  `nike_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `real_name` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `sex` tinyint(4) DEFAULT NULL COMMENT '性别',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `card_no` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `adress` varchar(255) DEFAULT NULL COMMENT '地址',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='雇员表';

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '呼保义', '宋江', '1', '40', '420110199005061235', '武汉市江汉区', 'songjiang@126.com', '2020-05-27 17:47:10', '2020-05-27 17:47:13');
INSERT INTO `employee` VALUES ('2', '玉麒麟', '卢俊义', '1', '38', '420110199105061235', '武汉市武昌区', 'lujunyi@126.com', '2020-05-27 17:49:36', '2020-05-27 17:49:39');
INSERT INTO `employee` VALUES ('3', '智多星', '吴用', '1', '36', '420110199205061235', '武汉市洪山区', 'wuyong@126.com', '2020-05-27 17:50:50', '2020-05-27 17:50:53');
