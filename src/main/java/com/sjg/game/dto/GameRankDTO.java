package com.sjg.game.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class GameRankDTO {
    private String areaCode;
    private String gameId;
    private String userId;
    private Double score;
}
