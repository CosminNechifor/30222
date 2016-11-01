package services.factories;

import models.animals.Animal;
import models.animals.Eagle;
import models.animals.Owl;
import models.animals.Swallow;

/**
 * Created by p on 10/31/2016.
 */
public class BirdFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) throws Exception{
        if(Constants.Animals.Bird.EAGLE.equals(type)){
            return new Eagle();
        }else if(Constants.Animals.Bird.OWL.equals(type)){
            return new Owl();
        }else if(Constants.Animals.Bird.SWALLOW.equals(type)){
            return new Swallow();
        }else{
            throw new Exception("Invalid animal exception!");
        }
    }
}
