package Model.Chance;

import Model.Spiller;
import gui_main.GUI;

public abstract class ChanceCard {

    String description;

    public ChanceCard(String description){
        this.description = description;
    }

    public void doCard(Spiller player, GUI gui){
        gui.showMessage(description);
    }

}
