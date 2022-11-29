package com.sjg.game.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * <p>
 *
 * </p>
 *
 * @author june
 * @since 2022-11-14
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GameUser implements Serializable {

    private static final long serialVersionUID = 3203693526925794113L;
    /**
     * 用户标识
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 区域编码
     */
    private String areaCode;

    /**
     * 微信昵称
     */
    private String nickname;

    /**
     * 微信账号
     */
    private String openid;

    /**
     * 头像图标
     */
    private String avatar;

    /**
     * 微信注册联系电话
     */
    private String phone;

    /**
     * 游戏标志
     */
    private String gameId;

    /**
     * 设备标志
     */
    private String device;

    /**
     * 创建日期
     */
    private Timestamp createdAt;

    /**
     * 修改日期
     */
    private Timestamp updatedAt;


}
