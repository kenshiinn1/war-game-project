package ca.sheridancollege.project;

import java.util.ArrayList;

public abstract class Game {
    private final String name; // the title of the game
    private ArrayList<Player> players; // the players of the game

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public abstract void play();

    public abstract void declareWinner();
}
