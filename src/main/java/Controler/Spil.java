package Controler;

import Model.Dice;
import Model.Spiller;
import Model.SpillerListe;
import View.ViewGUI;
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
        ViewGUI viewGUI = new ViewGUI(gui);
        Spiller spiller;

        String amountPlayers = gui.getUserButtonPressed("Vælg antallet af spiller", "3", "4", "5", "6");

        SpillerListe sl = new SpillerListe(Integer.parseInt(amountPlayers));

        sl.setCurrentPlayer(0);
        spiller = sl.getCurrentPlayer();

        viewGUI.addPlayers(sl);






        System.out.println(dice1.roll() + dice2.roll());

    }

}