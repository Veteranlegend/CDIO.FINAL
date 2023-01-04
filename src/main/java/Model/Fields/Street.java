package Model.Fields;

public class Street extends Owneble {
    int housePrice;

    public Street(String name, String message, int price, int housePrice, int[] rent) {
        super(name, message, price, rent);
        this.housePrice = housePrice;
    }
}
