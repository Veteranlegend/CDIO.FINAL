package Controler;

import Model.Dice;
import Model.Spiller;
import Model.SpillerListe;
import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class Spil {

    final int MAXPLAYERS = 6;
    final int MINPLAYERS = 3;




    public void play() {

        Dice dice1 = new Dice(6,1);
        Dice dice2 = new Dice(6,1);
        GUI gui = new GUI();
        Spiller spiller;

        String amountPlayers = gui.getUserButtonPressed("Vælg antallet af spiller", "3", "4", "5", "6");

        SpillerListe sl = new SpillerListe(Integer.parseInt(amountPlayers));

        sl.setCurrentPlayer(0);
        spiller = sl.getCurrentPlayer();

        for (int i = 0; i < Integer.parseInt(amountPlayers); i++) {
            String navn = gui.getUserString("Indtast dit navn !");
            gui.showMessage("Du valgte navn: " + navn);
            sl.getCurrentPlayer().setName(navn);
            sl.getNextPlayer();
        }



        System.out.println(dice1.roll() + dice2.roll());

    }

}