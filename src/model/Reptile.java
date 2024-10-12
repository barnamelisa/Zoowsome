package model;

public abstract class Reptile extends Animal{
    private Boolean laysEggs;
    public Reptile(Integer nrOfLegs, String name, Boolean laysEggs){
        super(nrOfLegs, name);
        this.laysEggs=laysEggs;
    }
    public Reptile(){
        super();
        this.laysEggs=true;
    }

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(Boolean laysEggs) {
        this.laysEggs = laysEggs;
    }
}
