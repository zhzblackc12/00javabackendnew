/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : game

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 21/11/2022 15:44:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for game_area
-- ----------------------------
DROP TABLE IF EXISTS `game_area`;
CREATE TABLE `game_area` (
  `area_code` varchar(8) COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域编码',
  `parent_area_code` varchar(8) COLLATE utf8mb4_general_ci NOT NULL COMMENT '上级区域编码',
  `area_name` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '区域名称',
  `created_at` timestamp NOT NULL COMMENT '创建日期',
  `updated_at` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改日期',
  PRIMARY KEY (`area_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for game_login_log
-- ----------------------------
DROP TABLE IF EXISTS `game_login_log`;
CREATE TABLE `game_login_log` (
  `id` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '日志标识',
  `user_id` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户标识',
  `game_id` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '游戏标识',
  `device` varchar(8) COLLATE utf8mb4_general_ci NOT NULL COMMENT '设备类型',
  `created_at` timestamp NOT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for game_photo
-- ----------------------------
DROP TABLE IF EXISTS `game_photo`;
CREATE TABLE `game_photo` (
  `md5` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '照片摘要',
  `photo` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '照片数据base64编码',
  `created_at` timestamp NOT NULL COMMENT '创建日期'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for game_score
-- ----------------------------
DROP TABLE IF EXISTS `game_score`;
CREATE TABLE `game_score` (
  `id` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '得分标识',
  `user_id` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户标识',
  `area_code` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域编码',
  `game_id` varchar(8) COLLATE utf8mb4_general_ci NOT NULL COMMENT '游戏标识',
  `device` varchar(8) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '设备类型',
  `score` int NOT NULL COMMENT '游戏得分0-100',
  `created_at` timestamp NOT NULL COMMENT '创建日期',
  `use_time` int NOT NULL DEFAULT '0' COMMENT '用时',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for game_user
-- ----------------------------
DROP TABLE IF EXISTS `game_user`;
CREATE TABLE `game_user` (
  `id` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户标识',
  `area_code` varchar(8) COLLATE utf8mb4_general_ci NOT NULL COMMENT '区域编码',
  `nickname` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '微信昵称',
  `openid` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '微信账号',
  `avator` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '头像图标',
  `phone` varchar(32) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '微信注册联系电话',
  `game_id` varchar(64) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '游戏标志',
  `device` varchar(8) COLLATE utf8mb4_general_ci NOT NULL COMMENT '设备标志',
  `created_at` timestamp NOT NULL COMMENT '创建日期',
  `updated_at` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- ----------------------------
-- Table structure for game_version
-- ----------------------------
DROP TABLE IF EXISTS `game_version`;
CREATE TABLE `game_version` (
  `id` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '版本标识',
  `game_id` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '游戏标识',
  `device` varchar(8) COLLATE utf8mb4_general_ci NOT NULL COMMENT '设备类型',
  `version` varchar(32) COLLATE utf8mb4_general_ci NOT NULL COMMENT '主版本.次版本.修复版本',
  `download` varchar(64) COLLATE utf8mb4_general_ci NOT NULL COMMENT '版本下载地址',
  `created_at` timestamp NOT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

SET FOREIGN_KEY_CHECKS = 1;
