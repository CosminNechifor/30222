package services.factories;

import models.animals.Animal;

/**
 * Created by p on 10/31/2016.
 */
public abstract class SpeciesFactory {
    public abstract Animal getAnimal(String type) throws Exception;
}
