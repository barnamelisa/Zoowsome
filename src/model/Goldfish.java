package model;

import static model.WaterType.Freshwater;

public class Goldfish extends Aquatic{
    public Goldfish(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType){
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }
    public Goldfish(){
        super(0,"Nemo",20,Freshwater);
    }
}
