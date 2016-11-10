package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Owl extends Bird {
    //There are some owls who migrate
    public Owl(String name, boolean migrate){
        super(1,0.02);
        setNrOfLegs(2);
        setMigrates(migrate);
        setName(name);
        setAvgFlightAltitude(2000);
    }
    public Owl(String name){
        this(name,false);
    }
    public Owl(){
        this("Owl", false);
    }
}
