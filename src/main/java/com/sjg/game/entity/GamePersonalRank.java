package com.sjg.game.entity;

import lombok.Data;

@Data
public class GamePersonalRank{
    private String areaCode;
    private String gameId;
    private String userId;
    private String nickname;
    private String avatar;
    private int score;
    private int rank;
}
