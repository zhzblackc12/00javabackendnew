package com.sjg.game.controller;

import com.sjg.game.dto.GameVersionDTO;
import com.sjg.game.entity.GameVersion;
import com.sjg.game.services.GameVersionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class GameVersionController {

    @Autowired
    private GameVersionServiceImpl gameVersionServiceImpl;

    @GetMapping("/getGameVersion")
    public GameVersion getGameVersion(GameVersionDTO gameVersionDTO){
        GameVersion gameVersion=gameVersionServiceImpl.getGameVersion(gameVersionDTO);
        return gameVersion;
    }
}
