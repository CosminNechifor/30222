package controllers;

import models.animals.Animal;
import services.factories.AnimalFactory;
import services.factories.Constants;
import services.factories.SpeciesFactory;

import java.util.Random;

/**
 * Created by p on 10/31/2016.
 */
public class MainController {
    public static final int SIZE_OF_ZOO = 50;
    public static void main(String[] args) throws Exception {

        /*
        AnimalFactory abstractFactory = new AnimalFactory();
        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
        Animal animal = speciesFactory1.getAnimal(Constants.Animals.Mammals.MONKEY);
        System.out.printf("We have an animal with %d legs!\n", animal.getNrOfLegs());
        */


        AnimalFactory abstractFactory = new AnimalFactory();

        SpeciesFactory speciesFactoryMammals = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
        SpeciesFactory speciesFactoryReptiles = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
        SpeciesFactory speciesFactoryInsects = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
        SpeciesFactory speciesFactoryBirds = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
        SpeciesFactory speciesFactoryAquatic = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);

        Random random = new Random();
        Animal[] animal = new Animal[SIZE_OF_ZOO];
        int randomIntAnimal;

        for(int i = 0; i < SIZE_OF_ZOO; i++){
            randomIntAnimal = random.nextInt(15);
            switch (randomIntAnimal){
                case 0:
                    animal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.MONKEY);
                    break;
                case 1:
                    animal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.COW);
                    break;
                case 2:
                    animal[i] = speciesFactoryMammals.getAnimal(Constants.Animals.Mammals.TIGER);
                    break;
                case 3:
                    animal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptile.CHAMELEON);
                    break;
                case 4:
                    animal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptile.CROCODILE);
                    break;
                case 5:
                    animal[i] = speciesFactoryReptiles.getAnimal(Constants.Animals.Reptile.LIZARD);
                    break;
                case 6:
                    animal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insect.BUTTERFLY);
                    break;
                case 7:
                    animal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insect.COCKROACH);
                    break;
                case 8:
                    animal[i] = speciesFactoryInsects.getAnimal(Constants.Animals.Insect.SPIDER);
                    break;
                case 9:
                    animal[i] = speciesFactoryAquatic.getAnimal(Constants.Animals.Aquatic.DOLPHIN);
                    break;
                case 10:
                    animal[i] = speciesFactoryAquatic.getAnimal(Constants.Animals.Aquatic.FISH);
                    break;
                case 11:
                    animal[i] = speciesFactoryAquatic.getAnimal(Constants.Animals.Aquatic.OTTER);
                    break;
                case 12:
                    animal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Bird.EAGLE);
                    break;
                case 13:
                    animal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Bird.OWL);
                    break;
                case 14:
                    animal[i] = speciesFactoryBirds.getAnimal(Constants.Animals.Bird.SWALLOW);
                    break;
            }
        }
        for (int i = 0; i < SIZE_OF_ZOO; i++){
            System.out.printf("We have an %s with %d legs!\n", animal[i].getName(), animal[i].getNrOfLegs());
        }
    }
}
