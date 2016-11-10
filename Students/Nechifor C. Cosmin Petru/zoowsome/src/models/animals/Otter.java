package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Otter extends Aquatic {
    public Otter(String name, int avgSwimDepth){
        super(1,0.01);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(typeOfWater.FRESH_WATER);
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
