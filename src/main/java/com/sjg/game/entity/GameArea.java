package com.sjg.game.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class GameArea implements Serializable {

    private static final long serialVersionUID = -3472278512060944186L;
    /**
     * 区域编码
     */
    @TableId(value = "area_code", type = IdType.ASSIGN_ID)
    private String areaCode;

    /**
     * 上级区域编码
     */
    private String parentAreaCode;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 创建日期
     */
    private LocalDateTime createdAt;

    /**
     * 修改日期
     */
    private LocalDateTime updatedAt;


}
