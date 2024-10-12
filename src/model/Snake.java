package model;

public class Snake extends Reptile{
    public Snake(Integer nrOfLegs, String name, Boolean laysEggs){
        super(nrOfLegs, name, laysEggs);
    }

    public Snake(){
        super(0,"Serpulet",true);
    }
}
