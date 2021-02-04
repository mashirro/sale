/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : shiro

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2021-02-04 09:10:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for purchase_record
-- ----------------------------
DROP TABLE IF EXISTS `purchase_record`;
CREATE TABLE `purchase_record` (
  `id` varchar(38) NOT NULL COMMENT '主键',
  `user_id` varchar(38) NOT NULL COMMENT '用户id',
  `product_id` varchar(38) NOT NULL COMMENT '产品id',
  `price` decimal(16,2) NOT NULL COMMENT '价格',
  `quantity` int(12) NOT NULL COMMENT '数量',
  `sumprice` decimal(16,2) NOT NULL COMMENT '总价',
  `note` varchar(255) DEFAULT NULL COMMENT '备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购买信息表';
