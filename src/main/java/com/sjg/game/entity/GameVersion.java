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
public class GameVersion implements Serializable {

    private static final long serialVersionUID = -2371440767524111938L;
    /**
     * 版本标识
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 游戏标识
     */
    private String gameId;

    /**
     * 设备类型
     */
    private String device;

    /**
     * 主版本.次版本.修复版本
     */
    private String version;

    /**
     * 版本下载地址
     */
    private String download;

    /**
     * 创建日期
     */
    private LocalDateTime createdAt;


}
