package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Lizard extends Reptile {
    public Lizard(String name, boolean laysEggs){
        super(1,0.01);
        setNrOfLegs(4);
        setName(name);
        setLaysEggs(laysEggs);
    }

    public Lizard(String name){
        this(name,true);
    }

    public Lizard(){
        this("Lizard",true);
    }
}
