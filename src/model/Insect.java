package model;

public abstract class Insect extends Animal{
    private Boolean canFly;
    private Boolean isDangerous;

    public Insect(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous){
        super(nrOfLegs, name);
        this.canFly=canFly;
        this.isDangerous=isDangerous;
    }
    public Insect(){
        super();
        this.canFly=true;
        this.isDangerous=false;
    }
    public Boolean getCanFly() {
        return canFly;
    }

    public Boolean getDangerous() {
        return isDangerous;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }

    public void setDangerous(Boolean dangerous) {
        isDangerous = dangerous;
    }
}
