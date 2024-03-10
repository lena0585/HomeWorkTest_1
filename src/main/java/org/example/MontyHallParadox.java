package org.example;

public class MontyHallParadox {
    public static void main(String[] args) {
        int numGames = 1000;
        int wins = 0;

        for (int i = 0; i < numGames; i++) {
            Player player = new Player();
            Game game = new Game(3);
            game.setPlayer(player);

            boolean win = game.play();
            if (win) {
                wins++;
            }
        }

        System.out.println("Number of games: " + numGames);
        System.out.println("Number of wins: " + wins);
        System.out.println("Win ratio: " + (double) wins / numGames);
    }
}