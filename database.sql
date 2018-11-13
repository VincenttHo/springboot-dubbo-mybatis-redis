CREATE TABLE `t_ess_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `mobile` varchar(50) DEFAULT NULL COMMENT '手机',
  `gender` varchar(15) DEFAULT NULL COMMENT '性别',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `status` varchar(100) DEFAULT NULL COMMENT '是否有效',
  `myDesc` varchar(2000) DEFAULT NULL COMMENT '描述',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `isAuth` tinyint(1) DEFAULT NULL,
  `creator` varchar(30) DEFAULT NULL COMMENT '创建人',
  `createtime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifier` varchar(30) DEFAULT NULL COMMENT '修改人',
  `modifytime` datetime DEFAULT NULL COMMENT '修改时间',
  `deleted` tinyint(1) DEFAULT '0',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `pinyinCode` varchar(60) DEFAULT NULL COMMENT '拼音码',
  `wubiCode` varchar(60) DEFAULT NULL COMMENT '五笔码',
  `spellingCode` varchar(60) DEFAULT NULL COMMENT '全拼码',
  `trueName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '真实姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=751 DEFAULT CHARSET=utf8 COMMENT='用户信息';

-- ----------------------------
-- Records of t_ess_user
-- ----------------------------
INSERT INTO `t_ess_user` VALUES ('1', null, 'M', null, 'VALID', null, null, '0', null, null, null, '2018-08-28 16:38:38', '0', null, null, null, null, 'test1');
INSERT INTO `t_ess_user` VALUES ('3', '13111111111', 'M', '878972123@qq.com', 'VALID', null, null, '0', null, '2017-10-18 15:27:55', null, null, '0', null, null, null, null, 'test2');
INSERT INTO `t_ess_user` VALUES ('4', '13222222222', 'M', '878972123@qq.com', 'VALID', null, null, '0', null, '2017-10-18 15:58:30', null, null, '0', '1985-10-15 00:00:00', 'csptjk', 'iygcvh', 'CeUiP;TlJmKa', 'test3');
INSERT INTO `t_ess_user` VALUES ('5', '13333333333', 'F', 'aa@163.com', 'VALID', null, null, '0', null, '2017-10-18 16:13:45', null, null, '0', '1999-05-05 00:00:00', 'ptzzcsbk', 'gcjxiyxh', 'P;TlZvVsCeUiBhKa', 'test4');
INSERT INTO `t_ess_user` VALUES ('6', '13444444444', 'F', 'aa@163.com', 'VALID', null, null, '0', null, '2017-10-18 18:38:57', null, null, '0', '1999-05-05 00:00:00', 'ptzzcsbk2.0', 'gcjxiyxh2.0', 'P;TlZvVsCeUiBhKa2.0', 'test5');
