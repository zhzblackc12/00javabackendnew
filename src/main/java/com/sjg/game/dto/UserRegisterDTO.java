package com.sjg.game.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author:june
 * @Date:2022/11/12
 * @Description:用户注册
 */
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterDTO implements Serializable {
    private static final long serialVersionUID = 3737447471649262370L;

    /**
     * 手机号
     */
    private String id;

    /**
     * 微信openId
     */
    private String areaCode;

    /**
     * 微信openId对应的appId
     */
    private String appId;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像地址
     */
    private String avatar;

    /**
     * 设备id
     */
    private String deviceId;
}
