package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private Integer ballCount;
    private Integer unBallCount;
    private Integer cardsCount;
    private Integer offsidesCount;
    private Boolean iswWins;
}
