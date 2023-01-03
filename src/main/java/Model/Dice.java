package Model;

import java.util.Random;

public class Dice {

    private final int faces;
    private int faceValue;

    public Dice(int faces, int faceValue){
    this.faces = faces;
    this.faceValue = faceValue;
    }

    public int roll() {
        Random ran = new Random();
        faceValue = ran.nextInt(faces)+1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

}

