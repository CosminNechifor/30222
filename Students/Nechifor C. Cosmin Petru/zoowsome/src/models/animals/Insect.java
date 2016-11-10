package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Insect extends Animal {
    private boolean fly;
    private boolean dangerous;

    public Insect(double maintenanceCost, double dangerPerc){
        super(maintenanceCost,dangerPerc);
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public boolean canFly(){
        return fly;
    }
}
