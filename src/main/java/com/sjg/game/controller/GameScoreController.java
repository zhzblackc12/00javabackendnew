package com.sjg.game.controller;

import com.sjg.game.entity.GameScore;
import com.sjg.game.services.GameScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
