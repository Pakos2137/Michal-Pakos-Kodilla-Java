package com.kodilla.rps;

public class RpsRunner {
    static boolean end = false;
    public static void main(String[] args) {

        while (!end) {
            PlayerComputer playerComputer = new PlayerComputer();
            Player player = new Player();
            FirstMenu firstMenu = new FirstMenu();
            MoveProcess moveProcess = new MoveProcess();

            firstMenu.firstMenuRunner(player);

            while (player.getPlayerScore() <= firstMenu.roundQty && playerComputer.playerScore <= firstMenu.roundQty) {

                moveProcess.moveExe(player, playerComputer, firstMenu);
            }
            if(player.getPlayerScore() > playerComputer.playerScore) {
                System.out.println("Gra zakończona Wygrałeś");
            }
            if(player.getPlayerScore() < playerComputer.playerScore) {
                System.out.println("Gra zakończona Przegrałeś");
            }
            if(player.getPlayerScore() == playerComputer.playerScore) {
                System.out.println("Gra zakończona Remis");
            }
        }
    }
}
