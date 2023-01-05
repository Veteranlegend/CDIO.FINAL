package Model;
import Model.Account;
import Model.Fields.Field;
import Model.Fields.Owneble;

import java.util.ArrayList;

public class Spiller {
    private String name;
    public Account account;
    public int position = 0;
    public int playerNumber;

    public boolean setOutofJailCard;
    public boolean isJail;
    public int jailTurns;

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
        this.isJail = false;
    }

    public ArrayList<Field> getAllOwnedFields(Spiller player, FieldList fl){
        ArrayList<Field> ownedFields = new ArrayList<>();
        Field[] fields = fl.getFields();

        for (int i = 0; i < fields.length; i++) {
        Field currentField = fl.getField(i);

            if (currentField instanceof Owneble && ((Owneble) currentField).getOwner() != null){
                if (((Owneble) currentField).getOwner() == player){
                    ownedFields.add(currentField);
                }
            }
        }
        return ownedFields;
    }

    public boolean isSetOutofJailCard() {
        return setOutofJailCard;
    }

    public void setSetOutofJailCard(boolean setOutofJailCard) {
        this.setOutofJailCard = setOutofJailCard;
    }
    public void setPosition(int pos){
        this.position = pos%39;
    }

    public int getPosition(){
        return position;
    }
    public void movePosition(int moveAmount){
        setPosition(getPosition()+moveAmount);
    }
    public boolean isJail() {
        return isJail;
    }
    public void setJail(boolean jail) {
        isJail = jail;
    }

    public int getJailTurns() {
        return jailTurns;
    }
    public void setJailTurns(int jailTurns) {
        this.jailTurns = jailTurns;
    }
    public Account getAccount() {
        return account;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}
