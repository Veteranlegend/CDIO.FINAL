package View;

import Model.Spiller;
import Model.SpillerListe;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

import static gui_fields.GUI_Car.Pattern.*;
import static gui_fields.GUI_Car.Type.*;

public class ViewGUI {
    private GUI gui;
    private GUI_Player[] gui_players;
    private GUI_Car[] gui_cars;
    private GUI_Field[] gui_fields;


    public ViewGUI(GUI gui){
        this.gui = gui;
        this.gui_fields = gui.getFields();
    }

    GUI_Car.Type[] carTypes = {CAR, RACECAR, TRACTOR, UFO};
    GUI_Car.Pattern[] carPatterns = {FILL, HORIZONTAL_GRADIANT, DIAGONAL_DUAL_COLOR,
            HORIZONTAL_DUAL_COLOR, HORIZONTAL_LINE, CHECKERED, DOTTED, ZEBRA};
    Color[] colors = {Color.BLUE, Color.ORANGE,Color.RED, Color.GREEN,Color.YELLOW, Color.WHITE };
    public void addPlayers(SpillerListe sl){
        gui_cars = new  GUI_Car[sl.getPlayerAmount()];
        gui_players = new GUI_Player[sl.getPlayerAmount()];

        for (int i = 0; i < sl.getPlayerAmount(); i++) {
            Spiller player = sl.getPlayerList(i);

            String navn = gui.getUserString("Indtast dit navn !");
            gui.showMessage("Du valgte navn: " + navn);
            player.setName(navn);

            GUI_Car.Type carType = CAR;
            String type = gui.getUserButtonPressed("Vælg din bil type", "CAR", "RACECAR", "TRACTOR", "UFO");
            for (GUI_Car.Type item : carTypes) {
                if (item.toString().equals(type)) {
                    carType = item;
                }
            }

            String primaryColor = gui.getUserButtonPressed("Vælg din bils primær farve", "BLUE", "ORANGE", "RED", "GREEN", "YELLOW", "WHITE");
            Color primaryCarColor = Color.BLACK;
            switch (primaryColor) {
                case "BLUE" -> primaryCarColor = Color.BLUE;
                case "ORANGE" -> primaryCarColor = Color.ORANGE;
                case "RED" -> primaryCarColor = Color.RED;
                case "GREEN" -> primaryCarColor = Color.GREEN;
                case "YELLOW" -> primaryCarColor = Color.YELLOW;
                case "WHITE" -> primaryCarColor = Color.WHITE;
                default -> {}
            }
            String secondaryColor = gui.getUserButtonPressed("Vælg din bils sekundær farve", "BLUE", "ORANGE", "RED", "GREEN", "YELLOW", "WHITE");
            Color secondaryCarColor = Color.BLACK;
            switch (secondaryColor) {
                case "BLUE" -> secondaryCarColor = Color.BLUE;
                case "ORANGE" -> secondaryCarColor = Color.ORANGE;
                case "RED" -> secondaryCarColor = Color.RED;
                case "GREEN" -> secondaryCarColor = Color.GREEN;
                case "YELLOW" -> secondaryCarColor = Color.YELLOW;
                case "WHITE" -> secondaryCarColor = Color.WHITE;
                default -> {}
            }
            GUI_Car.Pattern carPattern = FILL;
            String pattern = gui.getUserButtonPressed("Vælg din bils farve pattern", "FILL", "HORIZONTAL_GRADIANT", "DIAGONAL_DUAL_COLOR",
                    "HORIZONTAL_DUAL_COLOR", "HORIZONTAL_LINE", "CHECKERED", "DOTTED", "ZEBRA");
            for (GUI_Car.Pattern value : carPatterns) {
                if (value.toString().equals(pattern)) {
                    carPattern = value;
                }
            }


            gui_cars[i] = new GUI_Car(primaryCarColor, secondaryCarColor, carType, carPattern);
            gui_players[i] = new GUI_Player(player.getName(), sl.getPlayerList(i).getAccount().getBalance(), gui_cars[i]);
            gui.addPlayer(gui_players[i]);
        }
    }
}
