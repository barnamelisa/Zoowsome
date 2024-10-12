package model;

public class Tiger extends Mammal{
    public Tiger(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
        super(nrOfLegs, name, normalBodyTemp,percBodyHair);
    }

    public Tiger(){
        super(4,"Tigrulet",52,87);
    }
}
