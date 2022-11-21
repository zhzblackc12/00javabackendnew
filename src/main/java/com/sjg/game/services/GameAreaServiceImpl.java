package com.sjg.game.services;

import com.sjg.game.entity.GameArea;
import com.sjg.game.mapper.GameAreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author june
 * @since 2022-11-14
 */
@Service
public class GameAreaServiceImpl{

    @Autowired
    private GameAreaMapper gameAreaMapper;

    public  List<GameArea> getGameArea(){
       List<GameArea> gameAreaList= gameAreaMapper.getGameAreaAll();
       return gameAreaList;
    }
}
