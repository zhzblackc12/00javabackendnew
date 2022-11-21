package com.sjg.game.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

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
public class GameLoginLog implements Serializable {

    private static final long serialVersionUID = -4491458486362627991L;
    /**
     * 日志标识
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 用户标识
     */
    private String userId;

    /**
     * 游戏标识
     */
    private String gameId;

    /**
     * 设备类型
     */
    private String device;

    /**
     * 创建日期
     */
    private Timestamp createdAt;


}
