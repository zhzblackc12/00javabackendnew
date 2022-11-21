package com.sjg.game.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class GameVersionDTO implements Serializable {
    private static final long serialVersionUID = 3884515057553858263L;
    private String game_id;
    private String device;
}
