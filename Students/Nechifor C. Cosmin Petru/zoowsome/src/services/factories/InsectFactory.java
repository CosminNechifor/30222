package services.factories;

import models.animals.Animal;
import models.animals.Butterfly;
import models.animals.Cockroach;
import models.animals.Spider;

/**
 * Created by p on 10/31/2016.
 */
public class InsectFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) throws Exception {
        if(Constants.Animals.Insect.BUTTERFLY.equals(type)){
            return new Butterfly();
        }else if(Constants.Animals.Insect.COCKROACH.equals(type)){
            return new Cockroach();
        }else if(Constants.Animals.Insect.SPIDER.equals(type)){
            return new Spider();
        }else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
