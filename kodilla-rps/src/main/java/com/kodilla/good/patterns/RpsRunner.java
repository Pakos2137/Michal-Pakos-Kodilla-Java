package com.kodilla.good.patterns;

import java.util.Collection;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        boolean end = false;

        PlayerComputer playerComputer = new PlayerComputer();
        Player player = new Player();

        while (!end){
            System.out.println("Witaj W Grze kamień papier nożyce");
            System.out.println("Podaj swoje imię: ");

            Scanner scanName = new Scanner(System.in);
            player.playerName = scanName.nextLine();

            System.out.println("Podaj liczbę rund do rozegrania:");
            Scanner scanRoundQty = new Scanner(System.in);
            int roundQty = scanRoundQty.nextInt();

            System.out.println("Imię: " + player.playerName + '\n' + " Ilość rund: " + roundQty);
            System.out.printf(
                    "1 - kamień " + '\n' +
                    "2 - papier " + '\n' +
                    "3 - nożyce " + '\n' +
                    "n - reset " + '\n' +
                    "x - koniec gry " + '\n');

            while (player.playerScore < roundQty || playerComputer.playerScore < roundQty) {
                System.out.println("Twój ruch:");

                Scanner scanChoose = new Scanner(System.in);
                String scanPlayerChoose = scanChoose.nextLine();

                RoundExe roundExe = new RoundExe(playerComputer , player);
                roundExe.chooseMenu(scanPlayerChoose);

                roundExe.rng();
                System.out.println(roundExe.randomNumber);
                roundExe.gameLogic();
                roundExe.numberToWord();

                if(roundExe.valueOfChoose == 4) {
                    roundQty = -1;
                }

                if(roundExe.valueOfChoose == 5) {
                    end = true;
                    roundQty = -1;
                }
            }
        }
    }
}