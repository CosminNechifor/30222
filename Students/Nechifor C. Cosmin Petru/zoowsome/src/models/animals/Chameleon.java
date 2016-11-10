package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Chameleon extends Reptile {
    public Chameleon(String name){
        super(1.0,0.01);
        setName(name);
        setLaysEggs(true);
        setNrOfLegs(4);
    }
    public Chameleon(){
        this("Chameleon");
    }
}
