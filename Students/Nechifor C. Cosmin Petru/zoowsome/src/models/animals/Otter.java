package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Otter extends Aquatic {
    public Otter(String name, int avgSwimDepth){
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(typeOfWater.freshWater);
        setName(name);
        setNrOfLegs(4);
    }
    public Otter(String name){
        this(name,40);
    }
    public Otter(){
        this("Otter",40);
    }
}
