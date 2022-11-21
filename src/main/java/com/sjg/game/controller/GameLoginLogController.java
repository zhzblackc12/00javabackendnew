package com.sjg.game.controller;

import com.sjg.game.entity.GameLoginLog;
import com.sjg.game.services.GameLoginLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loginlog")
public class GameLoginLogController {

    @Autowired
    private GameLoginLogServiceImpl gameLoginLogServiceImpl;

    @PostMapping("/insertLoginLog")
    public long insertLoginLog(@RequestBody GameLoginLog gameLoginLog){
        return gameLoginLogServiceImpl.insertLoginLog(gameLoginLog);
    }
}
