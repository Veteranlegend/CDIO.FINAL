package Model;

import Model.Account;
import Model.Spiller;

import java.awt.*;

public class SpillerListe {

    Spiller[] players;
    Account[] accounts;
    Spiller currentPlayer;

    int currentPlayerID;

    private String[] names = {"Peter", "Marcus", "Oliver", "Phill"};
    private Color[] colors = {Color.CYAN, Color.GREEN, Color.WHITE, Color.BLUE, Color.orange, Color.RED, Color.WHITE };

    /**
     * Makes a new player and account for that player and stores it in the playerlist
     * @param playerAmount Specifies how many accounts and players you want to make
     */
    public SpillerListe(int playerAmount){
        players = new Spiller[playerAmount];
        accounts = new Account[playerAmount];
        for (int i = 0; i < playerAmount; i++) {
            players[i] = new Spiller(null,3000);
            players[i].setAccount(accounts[i]);
            players[i].setPlayerNumber(i);
        }
    }

    //Getters and setters
    public Color getColor(int id) { return colors[id% colors.length];}

    public int getPlayerAmount() { return players.length; }
    public Spiller getPlayerList(int id) { return players[id]; }

    public void setNames(String[] names) {
        this.names = names;
    }

    public Spiller setCurrentPlayer(int index){
        return currentPlayer = players[index];
    }

    public Spiller getCurrentPlayer(){
        return currentPlayer;
    }

    public Spiller getNextPlayer(){
        currentPlayerID = (currentPlayerID + 1) % players.length;
        currentPlayer = players[currentPlayerID];
        return currentPlayer;
    }
}