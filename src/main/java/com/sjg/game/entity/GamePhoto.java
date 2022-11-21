package com.sjg.game.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author june
 * @since 2022-11-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GamePhoto implements Serializable {


    private static final long serialVersionUID = -7595682731456857269L;
    /**
     * 照片摘要
     */
    private String md5;

    /**
     * 照片数据base64编码
     */
    private String photo;

    /**
     * 创建日期
     */
    private LocalDateTime createdAt;


}
