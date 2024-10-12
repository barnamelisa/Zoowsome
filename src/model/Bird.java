package model;

public abstract class Bird extends Animal{
    private Boolean migrates;
    private Integer avgFlightAltitude;
    public Bird(Integer nrOfLegs, String name, Boolean migrates, Integer avgFlightAltitude){
        super(nrOfLegs, name);
        this.migrates=migrates;
        this.avgFlightAltitude=avgFlightAltitude;
    }
    public Bird(){
        super();
        this.migrates=true;
        this.avgFlightAltitude=3;
    }

    public boolean isMigrates() {
        return migrates;
    }

    public int getAvgFlightAltitude() {
        return avgFlightAltitude;
    }

    public void setMigrates(Boolean migrates) {
        this.migrates = migrates;
    }

    public void setAvgFlightAltitude(Integer avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }
}
