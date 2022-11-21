package com.sjg.game.controller;

import com.sjg.game.entity.GameArea;
import com.sjg.game.services.GameAreaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gameArea")
public class GameAreaController {

    @Autowired
    private GameAreaServiceImpl gameAreaServiceImpl;

    @GetMapping("/getGameArea")
    public List<GameArea> getGameArea(){
        return gameAreaServiceImpl.getGameArea();
    }
}
