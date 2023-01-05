package Model.Fields;
import Model.Spiller;

import java.awt.*;

public abstract class Owneble extends Field{
    private int price;
    private int[] rent;
    private Spiller owner;

    Color color;

    public Owneble(String name, String message, int price, int[] rent, Color color) {
        super(name, message);
        this.owner = null;
        this.rent = rent;
        this.price = price;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int[] getRent() {
        return rent;
    }

    public void setRent(int[] rent) {
        this.rent = rent;
    }

    public Spiller getOwner() {
        return owner;
    }

    public void setOwner(Spiller owner) {
        this.owner = owner;
    }
}
