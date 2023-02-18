package com.kodilla.rps;

import java.util.Random;

public class RoundExe {

    PlayerComputer playerComputer;
    Player player;
    private int randomNumber;
    private int valueOfChoose;
    public int getValueOfChoose() {
        return valueOfChoose;
    }
    private String nameOfComputerChoose;
    private String nameOfPlayerChoose;

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
            draw();
        }
        //when player give rock
        if (valueOfChoose == 1) {
            switch (randomNumber) {
                case 2:
                    lose();
                case 3:
                    win();
                    break;
            }
        }
        //when player give paper
        if (valueOfChoose == 2) {
            switch (randomNumber) {
                case 3:
                    lose();
                    break;
                case 1:
                    win();
            }
        }
        //when player give scissors
        if (valueOfChoose == 3) {
            switch (randomNumber) {
                case 1:
                    lose();
                    break;
                case 2:
                    win();
                    break;
            }
        }
    }
    public void draw() {
        System.out.println("Remis " + player.getPlayerName() + " : " + playerComputer.playerScore);
        System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
    }
    public void win() {
        player.playerScore += 1;
        System.out.println("Wygrałeś " + player.playerScore + " : " + playerComputer.playerScore);
        System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
    }
    public void lose() {
        playerComputer.playerScore += 1;
        System.out.println("Przegrałeś " + player.playerScore + " : " + playerComputer.playerScore);
        System.out.println(player.playerName + ":" + nameOfPlayerChoose + " " + playerComputer.playerName + ":" + nameOfComputerChoose);
    }
}

