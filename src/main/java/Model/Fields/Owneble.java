package Model.Fields;
import Model.Spiller;

public abstract class Owneble extends Field{
    private int price;
    private int rent;
    private Spiller owner;

    public Owneble(String name, String message, int price, int rent) {
        super(name, message);
        this.owner = null;
        this.rent = rent;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public Spiller getOwner() {
        return owner;
    }

    public void setOwner(Spiller owner) {
        this.owner = owner;
    }
}
