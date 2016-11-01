package models.animals;

/**
 * Created by p on 10/30/2016.
 */
public class Spider extends Insect {
    public Spider(String name, boolean dangerous){
        setFly(false);
        setDangerous(dangerous);
        setNrOfLegs(8);
        setName(name);
    }

    public Spider(){
        this("Spider", false);
    }

    public Spider(String name){
        this(name,false);
    }
}
