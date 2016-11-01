package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Chameleon extends Reptile {
    public Chameleon(String name){
        setName(name);
        setLaysEggs(true);
        setNrOfLegs(4);
    }
    public Chameleon(){
        this("Chameleon");
    }
}
