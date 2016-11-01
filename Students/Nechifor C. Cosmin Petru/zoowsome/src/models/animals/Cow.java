package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public class Cow extends Mammal {
    public Cow(String name, int nrOfLegs){
        setNormalBodyTemp(45);
        setPercBodyHair(89);
        setNrOfLegs(nrOfLegs);
        setName(name);
    }

    public Cow(){
        this("Cow",4);
    }

    public Cow(String name){
        this(name,4);
    }
}
