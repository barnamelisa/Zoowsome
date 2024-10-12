package model;

import static model.WaterType.Freshwater;

public class Dolphin extends Aquatic{
    public Dolphin(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType){
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }
    public Dolphin(){
        super(0,"Ariel",10000,Freshwater);
    }
}
