package model;

public abstract class Mammal extends Animal {
    private float normalBodyTemp;
    private float percBodyHair;

    public Mammal(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
        super(nrOfLegs,name);
        this.normalBodyTemp=normalBodyTemp;
        this.percBodyHair=percBodyHair;
    }
    public Mammal(){
        super();
        this.normalBodyTemp=40;
        this.percBodyHair=70;
    }


    public float getNormalBodyTemp() {
        return normalBodyTemp;
    }

    public float getPercBodyHair() {
        return percBodyHair;
    }

    public void setNormalBodyTemp(float normalBodyTemp) {
        this.normalBodyTemp = normalBodyTemp;
    }

    public void setPercBodyHair(float percBodyHair) {
        this.percBodyHair = percBodyHair;
    }
}
