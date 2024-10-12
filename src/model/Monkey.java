package model;

public class Monkey extends Mammal{
    public Monkey(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
        super(nrOfLegs, name, normalBodyTemp,percBodyHair);
    }

    public Monkey(){
        super(2,"Maimuta",36,99);
    }
}
