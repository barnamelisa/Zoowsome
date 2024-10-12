package model;

import static model.WaterType.Saltwater;

public class Octopus extends Aquatic{
    public Octopus(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType){
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }
    public Octopus(){
        super(8,"Caracatita Elena",200,Saltwater);
    }
}
