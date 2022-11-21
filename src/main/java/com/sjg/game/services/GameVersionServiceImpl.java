package com.sjg.game.services;

import com.sjg.game.entity.GameVersion;
import com.sjg.game.dto.GameVersionDTO;
import com.sjg.game.mapper.GameVersionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author june
 * @since 2022-11-14
 */
@Service
public class GameVersionServiceImpl{
    @Autowired
    private GameVersionMapper gameVersionMapper;

    public GameVersion getGameVersion(GameVersionDTO gameVersionDTO){
        GameVersion gameVersion=gameVersionMapper.getGameVersionByGameId(gameVersionDTO);
        return gameVersion;
    }
}
