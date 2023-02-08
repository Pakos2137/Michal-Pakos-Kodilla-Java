package com.kodilla.good.patterns;

import java.util.Objects;

public class Player {
    public String playerName;
    public int playerScore;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player1 = (Player) o;
        return playerScore == player1.playerScore && Objects.equals(playerName, player1.playerName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(playerName, playerScore);
    }
}
