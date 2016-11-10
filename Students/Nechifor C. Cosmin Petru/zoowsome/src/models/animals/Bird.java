package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Bird extends Animal{
    private boolean migrates;
    private int avgFlightAltitude;

    public Bird(double maintenanceCost, double dangerPerc){
        super(maintenanceCost,dangerPerc);
    }

    public int getAvgFlightAltitude() {
        return avgFlightAltitude;
    }

    public void setAvgFlightAltitude(int avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }

    public void setMigrates(boolean migrates) {
        this.migrates = migrates;
    }

    public boolean isMigrates() {
        return migrates;
    }

}
