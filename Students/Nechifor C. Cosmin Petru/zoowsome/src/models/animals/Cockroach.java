package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public class Cockroach extends Insect{
    public Cockroach(String name, int nrOfLegs, boolean canFly){
        super(0.5,0.07);
        setName(name);
        setDangerous(false);
        setFly(canFly);
        setNrOfLegs(nrOfLegs);
    }
    public Cockroach(String name){
        this(name,8,false);
    }
    public Cockroach(String name, int nrOfLegs){
        this(name,nrOfLegs,false);
    }
    public Cockroach(){
        this("Cockroach",8,false);
    }
}
