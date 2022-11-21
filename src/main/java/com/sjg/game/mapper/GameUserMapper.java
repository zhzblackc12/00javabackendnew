package com.sjg.game.mapper;

import com.sjg.game.entity.GameUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author june
 * @since 2022-11-14
 */

@Mapper
public interface GameUserMapper {
    GameUser getUserByOpenId(@Param("openId") String openId);

    long insertGameUser(GameUser gameUser);

    long updateGameUser(GameUser gameUser);

    GameUser getUserById(@Param("userId") String userId);

    List<GameUser> getUserByIds(@Param("ids") List<String> ids);

}
