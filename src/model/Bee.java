package model;

public class Bee extends Insect{
    public Bee(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOfLegs, name, canFly, isDangerous);
    }

    public Bee(){
        super(6,"Albinuta",true,false);
    }
}
