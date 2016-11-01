package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Eagle extends Bird {
    public Eagle(String name, boolean migrates, int avgFlightAltitude){
        setNrOfLegs(2);
        setName(name);
        setAvgFlightAltitude(avgFlightAltitude);
        setMigrates(migrates);
    }
    public Eagle(String name){
        this(name,true,3810);
    }
    public Eagle(){
        this("Eagle",true,3810);
    }
}
