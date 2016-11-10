package models.animals;

import services.factories.Constants;

import java.util.Date;

/**
 * Created by p on 10/31/2016.
 */
public class Crocodile extends Reptile {

    Date time = new Date();

    public Crocodile(String name){
        super(3.0,0.4);
        setLaysEggs(true);
        setName(name);
        setNrOfLegs(4);
    }
    public Crocodile(){
        this("Crocodile");
    }

    @Override
    public double getPredisposition() {
        if(time.getHours() > 5 && time.getHours() < 10 ){
            return Constants.numbers.CROCODILE_KILLING_PREDISPOSITION;
        }
        else{
            return 0;
        }
    }
}
