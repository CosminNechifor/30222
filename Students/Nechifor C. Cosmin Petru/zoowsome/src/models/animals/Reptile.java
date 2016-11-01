package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Reptile extends Animal {
    private boolean laysEggs;

    public boolean islaysEggs(){
        return laysEggs;
    }
    public void setLaysEggs(boolean laysEggs){
        this.laysEggs = laysEggs;
    }
}
