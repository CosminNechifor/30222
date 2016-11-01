package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Aquatic extends Animal{
    private int avgSwimDepth;
    public enum typeOfWater{
        saltWater, freshWater
    }
    private typeOfWater waterType;

    public int getAvgSwimDepth() {
        return avgSwimDepth;
    }

    public void setAvgSwimDepth(int avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }

    public typeOfWater getWaterType() {
        return waterType;
    }

    public void setWaterType(typeOfWater water) {
        this.waterType = water;
    }
}
