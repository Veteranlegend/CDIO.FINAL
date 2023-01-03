package Model;
import Model.Account;

public class Spiller {
    private String name;
    public Account account;
    public int position = 0;
    public int playerNumber;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Spiller(String name, int startingBalance) {
        this.name = name;
        this.account = new Account(startingBalance);
        this.position = 0;
    }

    public void setPosition(int Pos){
        this.position = Pos;
    }

    public int getPosition(){
        return position;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
