package model;

public class Cow extends Mammal{
    public Cow(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
        super(nrOfLegs, name, normalBodyTemp,percBodyHair);
    }

    public Cow(){
        super(4,"Vacuta",40,90);
    }
}
