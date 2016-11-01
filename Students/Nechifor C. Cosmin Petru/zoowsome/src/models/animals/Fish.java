package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Fish extends Aquatic {
    public Fish(String name, int avgSwimDepth, typeOfWater water){
        setNrOfLegs(0);
        setWaterType(water);
        setAvgSwimDepth(avgSwimDepth);
        setName(name);
    }
    public Fish(String name){
        this(name,40,typeOfWater.freshWater);
    }
    public Fish(String name, int avgSimDepth){
        this(name,avgSimDepth,typeOfWater.freshWater);
    }
    public Fish(String name, typeOfWater water){
        this(name,40,typeOfWater.freshWater);
    }
    public Fish(){
        this("Fish",40,typeOfWater.freshWater);
    }
}
