package com.sjg.game.mapper;

import com.sjg.game.entity.GameScore;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author june
 * @since 2022-11-14
 */
@Mapper
public interface GameScoreMapper{

    long addUserGameScore(GameScore gameScore);

    long updateUserGameScore(GameScore gameScore);
}
