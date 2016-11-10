package models.animals;

import services.factories.Constants;

import java.util.Date;

/**
 * Created by p on 10/30/2016.
 */
public class Spider extends Insect {

    Date time = new Date();
    public Spider(String name, boolean dangerous){
        super(1,0.2);
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

    @Override
    public double getPredisposition() {
        if(time.getHours() > 23 && time.getHours() < 6 ){
            return Constants.numbers.SPIDER_KILLING_PREDISPOSITION;
        }
        else{
            return 0;
        }
    }
}
