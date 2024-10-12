package model;

public class Ant extends Insect{
    public Ant(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOfLegs, name, canFly, isDangerous);
    }

    public Ant(){
        super(6,"Furnicuta",true,false);
    }
}
