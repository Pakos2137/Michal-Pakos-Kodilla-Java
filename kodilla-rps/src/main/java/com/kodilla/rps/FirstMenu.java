package com.kodilla.rps;

import java.util.Scanner;

public class FirstMenu {
    public int roundQty;
    Player player;

    public void firstMenuRunner(Player player) {
        this.player = player;

        System.out.println("Witaj W Grze kamień papier nożyce");
        System.out.println("Podaj swoje imię: ");

        Scanner scanName = new Scanner(System.in);
        player.setPlayerName(scanName.nextLine());

        System.out.println("Podaj liczbę rund do rozegrania:");
        Scanner scanRoundQty = new Scanner(System.in);
        roundQty = scanRoundQty.nextInt();

        System.out.println("Imię: " + player.getPlayerName() + '\n' + "Ilość rund: " + roundQty);
        System.out.printf(
                "1 - kamień " + '\n' +
                        "2 - papier " + '\n' +
                        "3 - nożyce " + '\n' +
                        "n - reset " + '\n' +
                        "x - koniec gry " + '\n');
    }
}
