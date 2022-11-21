package com.sjg.game.services;

import com.sjg.game.entity.GameLoginLog;
import com.sjg.game.mapper.GameLoginLogMapper;
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
public class GameLoginLogServiceImpl {
    @Autowired
    private GameLoginLogMapper gameLoginLogMapper;

    public long insertLoginLog(GameLoginLog gameLoginLog){
       return gameLoginLogMapper.insertLoginLog(gameLoginLog);
    }

}
