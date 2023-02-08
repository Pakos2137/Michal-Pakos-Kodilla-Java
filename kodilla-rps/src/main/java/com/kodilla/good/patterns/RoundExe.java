package com.kodilla.good.patterns;

import java.util.Random;

public class RoundExe {

    PlayerComputer playerComputer;
    Player player;
    public int randomNumber;
    int valueOfChoose;

    String nameOfComputerChoose;
    String nameOfPlayerChoose;

    public RoundExe(PlayerComputer playerComputer, Player player) {
        this.playerComputer = playerComputer;
        this.player = player;
    }

    public void chooseMenu(String choose) {

        switch (choose) {
            case "1":
                valueOfChoose = 1;
                break;
            case "2":
                valueOfChoose = 2;
                break;
            case "3":
                valueOfChoose = 3;
                break;
            case "n":
                valueOfChoose = 4;
                break;
            case "x":
                valueOfChoose = 5;
                break;
            default:
                System.out.println("błędny znak");
                valueOfChoose = 6;
        }
    }

    public void rng() {
        Random random = new Random();
        randomNumber = random.nextInt(3) + 1;
    }
    public void numberToWord() {
        switch (valueOfChoose) {
            case 1 -> nameOfPlayerChoose = "Kamień";
            case 2 -> nameOfPlayerChoose = "Papier";
            case 3 -> nameOfPlayerChoose = "Nożyce";
        }
        switch (randomNumber) {
            case 1 -> nameOfComputerChoose = "Kamień";
            case 2 -> nameOfComputerChoose = "Papier";
            case 3 -> nameOfComputerChoose = "Nożyce";
        }
    }

    public void gameLogic() {
        //draw
        if (randomNumber == valueOfChoose) {
            System.out.println("Remis " + player.playerScore + " : " + playerComputer.playerScore);
            System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
        }
        //when player give rock
        if (valueOfChoose == 1) {
            switch (randomNumber) {
                case 2:
                    playerComputer.playerScore += 1;
                    System.out.println("Przegrales " + player.playerScore + " : " + playerComputer.playerScore);
                    System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
                    break;
                case 3:
                    player.playerScore += 1;
                    System.out.println("Wygrałes " + player.playerScore + " : " + playerComputer.playerScore);
                    System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
                    break;
            }
        }
        //when player give paper
        if (valueOfChoose == 2) {
            switch (randomNumber) {
                case 3:
                    playerComputer.playerScore += 1;
                    System.out.println("Przegrales " + player.playerScore + " : " + playerComputer.playerScore);
                    System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
                    break;
                case 1:
                    player.playerScore += 1;
                    System.out.println("Wygrałes " + player.playerScore + " : " + playerComputer.playerScore);
                    System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
                    break;
            }
        }
        //when player give scissors
        if (valueOfChoose == 3) {
            switch (randomNumber) {
                case 1:
                    playerComputer.playerScore += 1;
                    System.out.println("Przegrales " + player.playerScore + " : " + playerComputer.playerScore);
                    System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
                    break;
                case 2:
                    player.playerScore += 1;
                    System.out.println("Wygrałes " + player.playerScore + " : " + playerComputer.playerScore);
                    System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
                    break;
            }
        }
    }
}

