package com.sjg.game.mapper;

import com.sjg.game.dto.GameVersionDTO;
import com.sjg.game.entity.GameVersion;
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
public interface GameVersionMapper {
    GameVersion getGameVersionByGameId(GameVersionDTO gameVersionDTO);
}
