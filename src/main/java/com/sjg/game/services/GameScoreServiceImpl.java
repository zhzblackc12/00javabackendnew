package com.sjg.game.services;

import com.sjg.game.entity.GameScore;
import com.sjg.game.mapper.GameScoreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author june
 * @since 2022-11-14
 */
@Service
public class GameScoreServiceImpl {

    @Autowired
    private GameScoreMapper gameScoreMapper;

    public long addUserGameScore(GameScore gameScore) {
        return gameScoreMapper.addUserGameScore(gameScore);
    }

    public long updateUserGameScore(GameScore gameScore) {
       return gameScoreMapper.updateUserGameScore(gameScore);
    }
}
