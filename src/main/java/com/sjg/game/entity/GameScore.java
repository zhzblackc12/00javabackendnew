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
public class GameScore implements Serializable {


    private static final long serialVersionUID = -7396725541057069834L;
    /**
     * 得分标识
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 用户标识
     */
    private String userId;

    /**
     * 区域编码
     */
    private String areaCode;

    /**
     * 游戏标识
     */
    private String gameId;

    /**
     * 设备类型
     */
    private String device;

    /**
     * 游戏得分0-100
     */
    private Integer score;

    /**
     * 游戏用时
     */
    private Integer useTime;

    /**
     * 创建日期
     */
    private Timestamp createdAt;


}
