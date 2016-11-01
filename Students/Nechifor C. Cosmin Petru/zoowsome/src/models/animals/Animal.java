package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Animal {
    private int nrOfLegs;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrOfLegs() {
        return nrOfLegs;
    }

    public void setNrOfLegs(int nrOfLegs) {
        this.nrOfLegs = nrOfLegs;
    }
}
