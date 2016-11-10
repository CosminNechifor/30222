package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Mammal extends Animal {
    private float normalBodyTemp;
    private float percBodyHair;

    public Mammal(double maintenanceCost, double dangerPerc){
        super(maintenanceCost,dangerPerc);
    }

    public float getNormalBodyTemp() {
        return normalBodyTemp;
    }

    public void setNormalBodyTemp(float normalBodyTemp) {
        this.normalBodyTemp = normalBodyTemp;
    }

    public float getPercBodyHair() {
        return percBodyHair;
    }

    public void setPercBodyHair(float percBodyHair) {
        this.percBodyHair = percBodyHair;
    }
}
