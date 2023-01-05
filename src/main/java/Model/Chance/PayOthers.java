package Model.Chance;

import Model.Spiller;
import gui_main.GUI;

import static Model.Account.withdraw;

public class PayOthers extends ChanceCard {

    public int amount;

    public PayOthers(String description, int amount) {
        super(description);
        this.amount = amount;
    }

    @Override
    public void doCard(Spiller player, GUI gui) {
        super.doCard(player, gui);
        withdraw(player.getAccount(), amount);
    }
}
