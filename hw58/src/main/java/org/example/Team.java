package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team implements Runnable{
    private String name;
    private Game game;

    @Override
    public void run() {
        Random rnd = new Random();
        int balls = 0, cards = 0, offsides = 0, wins = 0, loss = 0, draw = 0, unBall = 0, points = 0;
        synchronized (game) {
            for (int i = 0; i < 10; i++) { // count of matches
                int flag = rnd.nextInt(3);
                if (flag == 1) {
                    game.setIswWins(true);
                    wins++;
                    points+=3;
                } else if (flag == 2) {
                    game.setIswWins(false);
                    loss++;
                } else draw++;
                game.setBallCount(rnd.nextInt(5));
                game.setUnBallCount(rnd.nextInt(5));
                game.setCardsCount(rnd.nextInt(5));
                game.setOffsidesCount(rnd.nextInt(5));


                balls += game.getBallCount();
                cards += game.getCardsCount();
                offsides += game.getOffsidesCount();
                unBall += game.getUnBallCount();
            }
            synchronized (game) {
                System.out.println(getName() + "\t" + wins + "\t\t" + draw + "\t\t" + loss
                        + "\t\t" + balls + "-" + unBall + "\t" + cards + "\t\t" + offsides + "\t\t\t\t| " + points);
            }
        }
    }
}
