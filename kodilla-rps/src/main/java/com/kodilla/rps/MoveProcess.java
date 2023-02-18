package com.kodilla.rps;

import java.util.Scanner;

public class MoveProcess {

    PlayerComputer playerComputer;
    Player player;
    FirstMenu firstMenu;

    public void moveExe(Player player, PlayerComputer playerComputer, FirstMenu firstMenu) {
        this.playerComputer = playerComputer;
        this.player = player;
        this.firstMenu = firstMenu;

        System.out.println("Twój ruch:");

        Scanner scanChoose = new Scanner(System.in);
        String scanPlayerChoose = scanChoose.nextLine();


        RoundExe roundExe = new RoundExe(playerComputer, player);
        roundExe.chooseMenu(scanPlayerChoose);

        if((roundExe.getValueOfChoose() == 2) || (roundExe.getValueOfChoose() == 1) || (roundExe.getValueOfChoose() == 3)) {
            roundExe.rng();
            roundExe.numberToWord();
            roundExe.gameLogic();
        }
        if (roundExe.getValueOfChoose() == 4) {
            reset();
        }
        if (roundExe.getValueOfChoose() == 5) {
            endGame();
        }
    }
    public void reset() {
        System.out.println("Czy napewno chcesz zresetować grę ? t/n ");

        Scanner scanReset = new Scanner(System.in);
        String resetChoose = scanReset.nextLine();

        switch (resetChoose) {
            case "t":
                firstMenu.roundQty = -1;
                System.out.println("Resetowanie gry...");
                break;
            case "n":
                System.out.println("Anulowano");
                break;
            default:
                System.out.println("Niepoprwany wybór");
        }
    }
    public void endGame() {
        System.out.println("Czy napewno chcesz zakończyć grę ? t/n ");

        Scanner scanEnd = new Scanner(System.in);
        String endChoose = scanEnd.nextLine();

        switch (endChoose) {
            case "t":
                firstMenu.roundQty = -1;
                RpsRunner rpsRunner = new RpsRunner();
                rpsRunner.end = true;
                System.out.println("Kończenie gry...");;
                break;
            case "n":
                System.out.println("Anulowano");
                break;
            default:
                System.out.println("Niepoprwany wybór");
        }
    }
}