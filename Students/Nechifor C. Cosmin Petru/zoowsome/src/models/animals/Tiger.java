package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public class Tiger extends Mammal {

    public Tiger(){
        this("Tiger", 4);
    }

    public Tiger(String nameOfTheTiger, int nrOfLegs){
        setPercBodyHair(99);
        setNormalBodyTemp(95);
        setName(nameOfTheTiger);
        setNrOfLegs(nrOfLegs);
    }
    public Tiger(String nameOFTheTiger){
        this(nameOFTheTiger,4);
    }
}
