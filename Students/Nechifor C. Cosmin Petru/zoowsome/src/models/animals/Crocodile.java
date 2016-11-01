package models.animals;

/**
 * Created by p on 10/31/2016.
 */
public class Crocodile extends Reptile {
    public Crocodile(String name){
        setLaysEggs(true);
        setName(name);
        setNrOfLegs(4);
    }
    public Crocodile(){
        this("Crocodile");
    }
}
