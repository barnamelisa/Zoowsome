package model;

public class Crocodile extends Reptile{
    public Crocodile(Integer nrOfLegs, String name, Boolean laysEggs){
        super(nrOfLegs, name, laysEggs);
    }

    public Crocodile(){
        super(4,"Crocodil",true);
    }
}
