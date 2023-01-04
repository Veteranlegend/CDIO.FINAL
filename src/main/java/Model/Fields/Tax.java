package Model.Fields;

public class Tax extends Field{
    int tax;
    public Tax(String name, String message, int tax) {
        super(name, message);
        this.tax = tax;
    }
}
