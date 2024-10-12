package model;

import static model.WaterType.Saltwater;

public abstract class Aquatic extends Animal{
    private Integer avgSwimDepth;
    private WaterType waterType;
    public Aquatic(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType){
        super(nrOfLegs, name);
        this.avgSwimDepth=avgSwimDepth;
        this.waterType=waterType;
    }
    public Aquatic(){
        super();
        this.avgSwimDepth=20;
        this.waterType=Saltwater;
    }

    public Integer getAvgSwimDepth() {
        return avgSwimDepth;
    }

    public void setAvgSwimDepth(Integer avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }
}
