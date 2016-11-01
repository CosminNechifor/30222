package services.factories;

import models.animals.Animal;
import models.animals.Dolphin;
import models.animals.Fish;
import models.animals.Otter;

import java.lang.Exception;

/**
 * Created by p on 10/31/2016.
 */
public class AquaticFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) throws Exception{
        if(Constants.Animals.Aquatic.DOLPHIN.equals(type)){
            return new Dolphin();
        }else if(Constants.Animals.Aquatic.FISH.equals(type)){
            return new Fish();
        }else if(Constants.Animals.Aquatic.OTTER.equals(type)){
            return new Otter();
        }else{
            throw new Exception("Invalid animal exception!");
        }
    }
}
