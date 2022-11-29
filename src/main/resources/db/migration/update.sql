ALTER TABLE `game`.`game_user`
    CHANGE COLUMN `avator` `avatar` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '头像图标' AFTER `openid`;