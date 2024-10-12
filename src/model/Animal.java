package model;

public abstract class Animal {
    private Integer nrOfLegs;
    private String name;
    public Animal(Integer nrOfLegs, String name){
        this.nrOfLegs=nrOfLegs;
        this.name=name;
    }

    public Animal(){
        this.nrOfLegs=4;
        this.name="Maia";
    }

    public Integer getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(Integer nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
