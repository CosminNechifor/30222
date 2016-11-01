package services.factories;

import models.animals.Animal;
import models.animals.Chameleon;
import models.animals.Crocodile;
import models.animals.Lizard;

/**
 * Created by p on 10/31/2016.
 */
public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) throws Exception{
        if(Constants.Animals.Reptile.CHAMELEON.equals(type)){
            return new Chameleon();
        }else if(Constants.Animals.Reptile.CROCODILE.equals(type)){
            return new Crocodile();
        }else if(Constants.Animals.Reptile.LIZARD.equals(type)){
            return new Lizard();
        }else{
            throw new Exception("Invalid animal exception!");
        }
    }
}
