package model;

public class Hen extends Bird{
    public Hen(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude){
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }
    public Hen(){
        super(2,"Gainusa",true,200);
    }
}
