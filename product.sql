/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : shiro

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2021-02-02 19:20:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` varchar(38) NOT NULL COMMENT '主键',
  `product_name` varchar(60) NOT NULL COMMENT '产品名称',
  `stock` int(10) NOT NULL COMMENT '库存',
  `price` decimal(16,2) NOT NULL COMMENT '单价',
  `version` int(10) NOT NULL DEFAULT '0' COMMENT '版本号',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品信息表';
