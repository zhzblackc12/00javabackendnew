package com.sjg.game.services;

import com.sjg.game.entity.GameUser;
import com.sjg.game.mapper.GameUserMapper;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Service
public class GameUserServiceImpl{

    @Autowired
    private GameUserMapper gameUserMapper;
    /**
     * 根据用户openId获取用信息
     */
    public GameUser getUserByOpenId(String wxOpenId){
        return gameUserMapper.getUserByOpenId(wxOpenId);
    }

    public long insertGameUser(GameUser gameUser) {
        //保存用户信息
       long l= gameUserMapper.insertGameUser(gameUser);
        return l;
    }

    public GameUser getUserById(String userId){
        return gameUserMapper.getUserById(userId);
    }

    public long updateGameUser(GameUser gameUser){
        return gameUserMapper.updateGameUser(gameUser);
    }

    public List<GameUser> getUserByIds(List<String> lists){
        List<GameUser> gameUserList=gameUserMapper.getUserByIds(lists);
        return gameUserList;
    }
}
