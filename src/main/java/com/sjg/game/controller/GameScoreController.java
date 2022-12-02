package com.sjg.game.controller;

import com.sjg.game.entity.GameScore;
import com.sjg.game.services.GameScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gamescore")
public class GameScoreController {

    @Autowired
    private GameScoreServiceImpl gameScoreServiceImpl;

    @PostMapping("/addUserGameScore")
    public long addUserGameScore(@RequestBody GameScore gameScore) {

        return gameScoreServiceImpl.addUserGameScore(gameScore);
    }

    @PostMapping("/updateUserGameScore")
    public long updateUserGameScore(@RequestBody GameScore gameScore) {

        return gameScoreServiceImpl.updateUserGameScore(gameScore);
    }

    @GetMapping("/selectUserGameScore")
    public GameScore selectUserGameScore(String userId,String areaCode,String gameId){
        GameScore gameScore=new GameScore();
        gameScore.setGameId(gameId);
        gameScore.setAreaCode(areaCode);
        gameScore.setUserId(userId);
        GameScore gs=gameScoreServiceImpl.selectUserGameScore(gameScore);
        return  gs;
    }
}
