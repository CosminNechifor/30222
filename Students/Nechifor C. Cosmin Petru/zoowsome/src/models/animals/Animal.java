package models.animals;

import java.util.Random;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Animal implements Killer {
    private int nrOfLegs;
    private String name;
    private final double maintenanceCost;
    private final double dangerPerc;
    private boolean takenCareOf = false;

    public Animal(double maintenanceCost, double dangerPerc) {
        this.maintenanceCost = maintenanceCost;
        this.dangerPerc = dangerPerc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }

    @Override
    public boolean kill() {
        double survivability;
        double dangerPercent;
        survivability = Math.random(); // the value that is returned [0,1)
        dangerPercent = dangerPerc + getPredisposition();
        if(survivability < dangerPercent){
            return true;
        }
        else{
            return false;
        }
    }

    public void setTakenCareOf(boolean takenCareOf) {
        this.takenCareOf = takenCareOf;
    }

    public boolean isTakenCareOf() {
        return takenCareOf;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public double getDangerPerc() {
        return dangerPerc;
    }

    @Override
    public double getPredisposition() {
        return 0;
    }
}
