/*
 Navicat Premium Data Transfer

 Source Server         : mid
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : 120.79.42.224:3060
 Source Schema         : web_template

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 22/01/2019 14:54:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_asset_assign
-- ----------------------------
DROP TABLE IF EXISTS `t_asset_assign`;
CREATE TABLE `t_asset_assign`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `asset_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '原凭证ID',
  `desc` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `status` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '状态',
  `create_user` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '创建人ID,对应df_system.t_user.id',
  `create_time` datetime(0) NOT NULL,
  `update_user` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '更新人ID,对应df_system.t_user.id',
  `update_time` datetime(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4;

-- ----------------------------
-- Records of t_asset_assign
-- ----------------------------
INSERT INTO `t_asset_assign` VALUES ('14070e0e3cfe403098fa9ca37e8e7e76', 'e2d1c4512d554db9ae4a5f30cbc2e4b1', NULL, '04', '2fb4a37dcc8043e3b6b8da9deba7b2b8', '2019-01-03 17:38:25', '2fb4a37dcc8043e3b6b8da9deba7b2b8', '2019-01-03 17:38:36');

SET FOREIGN_KEY_CHECKS = 1;
