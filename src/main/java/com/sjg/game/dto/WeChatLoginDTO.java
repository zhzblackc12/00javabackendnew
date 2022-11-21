package com.sjg.game.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author:june
 * @Date:2022/11/13
 * @Description:微信登录
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeChatLoginDTO implements Serializable {
    private static final long serialVersionUID = 8693993012339392904L;

    /**
     * 微信凭证token
     */
    private String accessToken;

    /**
     * token有效时间
     */
    private Long expiresIn;

    /**
     * 微信 openid
     */
    private String openid;

    /**
     * 微信openId对应的appId
     */
    private String appId;
}
