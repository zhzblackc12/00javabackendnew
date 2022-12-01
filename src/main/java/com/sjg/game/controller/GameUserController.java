package com.sjg.game.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.sjg.game.entity.GameUser;
import com.sjg.game.services.GameUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class GameUserController {

    @Autowired
    private GameUserServiceImpl gameUserServiceImpl;

    @GetMapping("/getUserByOpenId")
    public GameUser getUserByOpenId(String wxOpenId){
        GameUser gameUser=gameUserServiceImpl.getUserByOpenId(wxOpenId);
        return gameUser;
    }

    @PostMapping("/insertGameUser")
    public long insertGameUser(@RequestBody GameUser gameUser) {
        //保存用户信息
        long l= gameUserServiceImpl.insertGameUser(gameUser);
        return l;
    }

    @GetMapping("/getUserById")
    public GameUser getUserById(String userId){
        return gameUserServiceImpl.getUserById(userId);
    }

    @PostMapping("/updateGameUser")
    public long updateGameUser(@RequestBody GameUser gameUser){
        return gameUserServiceImpl.updateGameUser(gameUser);
    }

    @GetMapping("/getUserByIds")
    public List<GameUser> getUserByIds(String ids){
        List<String> lists=JSONObject.parseArray(ids,String.class);
        List<GameUser> gameUserList=gameUserServiceImpl.getUserByIds(lists);
        return gameUserList;
    }
}
