package model;

public class Eagle extends Bird{
    public Eagle(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude){
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }
    public Eagle(){
        super(2,"Heddwig",false,20);
    }
}
