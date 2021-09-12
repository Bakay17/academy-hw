package org.example;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();

        Thread chelsea = new Thread(new Team("Chelsea", game));
        Thread united = new Thread(new Team("United", game));
        Thread city = new Thread(new Team("City", game));
        Thread arsenal = new Thread(new Team("Arsenal", game));
        Thread tottenham = new Thread(new Team("Totten", game));
        Thread liverpool = new Thread(new Team("Liver", game));

        System.out.println("Team statistics for the last 10 games\n" +
                           "------------------------------------------------------------------------");
        System.out.println("Team\tWins\tDraw\tLoss\tGoals\tCards\tOffsides\t\t| POINTS\n" +
                           "------------------------------------------------------------------------");
        chelsea.start();
        united.start();
        city.start();
        arsenal.start();
        tottenham.start();
        liverpool.start();
    }
}
