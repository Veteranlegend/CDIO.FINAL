package Model.Chance;

import Model.Spiller;
import gui_main.GUI;

import static Model.Account.deposit;

public class RecieveMoney extends ChanceCard{

    public int amount;

    public RecieveMoney(String description, int amount) {
        super(description);
        this.amount = amount;
    }

    @Override
    public void doCard(Spiller player, GUI gui) {
        super.doCard(player, gui);
        deposit(player.getAccount(), amount);
    }
}
