package model;

public class Butterfly extends Insect{
    public Butterfly(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOfLegs, name, canFly, isDangerous);
    }

    public Butterfly(){
        super(0,"Fluturas",true,false);
    }
}
