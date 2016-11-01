package services.factories;

import models.animals.Animal;
import models.animals.Cow;
import models.animals.Monkey;
import models.animals.Tiger;

/**
 * Created by p on 10/31/2016.
 */
public class MammalFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String type) throws Exception{
        if(Constants.Animals.Mammals.COW.equals(type)){
            return new Cow();
        }else if(Constants.Animals.Mammals.MONKEY.equals(type)){
            return new Monkey();
        }else if(Constants.Animals.Mammals.TIGER.equals(type)){
            return new Tiger();
        }else {
            throw new Exception("Invalid animal exception!");
        }
    }
}
