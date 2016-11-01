package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Dolphin extends Aquatic {
    public Dolphin(String name, int avgSwimDepth, typeOfWater water){
        setName(name);
        setNrOfLegs(0);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(water);
    }
    public Dolphin(String name){
        this(name,43,typeOfWater.saltWater);
    }
    public Dolphin(String name, typeOfWater water){
        this(name,43,water);
    }
    public Dolphin(String name, int avgSwimDepth){
        this(name,avgSwimDepth,typeOfWater.saltWater);
    }
    public Dolphin(){
        this("Dolphin",43,typeOfWater.saltWater);
    }
}

