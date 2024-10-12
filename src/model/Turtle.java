package model;

public class Turtle extends Reptile{
    public Turtle(Integer nrOfLegs, String name, Boolean laysEggs){
        super(nrOfLegs, name, laysEggs);
    }

    public Turtle(){
        super(4,"Broscuta testoasa",true);
    }
}
