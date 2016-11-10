package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public class Monkey extends Mammal {

    public Monkey(String name, int nrOfLegs){
        super(2.0,0.10);
        setName(name);
        setNrOfLegs(nrOfLegs);
        setPercBodyHair(98);
        setNormalBodyTemp(45);
    }

    public Monkey(){
        this("Monkey",2);
    }

    public Monkey(String name){
        this(name,2);
    }
}
