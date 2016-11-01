package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public class Butterfly extends Insect {

    public Butterfly(String name, int nrOfLegs, boolean dangerous){
        setName(name);
        setNrOfLegs(nrOfLegs);
        setDangerous(dangerous);
        setFly(true);
    }

    public Butterfly(String name){
        this(name,6,false);
    }

    public Butterfly(){
        this("Butterfly",6,false);
    }
}
