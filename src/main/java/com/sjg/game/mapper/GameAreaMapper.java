package com.sjg.game.mapper;

import com.sjg.game.entity.GameArea;
import org.apache.ibatis.annotations.Mapper;

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
public interface GameAreaMapper {
    List<GameArea> getGameAreaAll();
}
