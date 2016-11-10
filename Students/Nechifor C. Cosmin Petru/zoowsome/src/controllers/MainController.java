package controllers;

import models.animals.Animal;
import models.employees.Caretaker;
import models.employees.Employee;
import services.factories.Animals.AnimalFactory;
import services.factories.Constants;
import services.factories.Animals.SpeciesFactory;
import services.factories.Employee.CaretakerFactory;



import java.util.Random;

/**
 * Created by p on 10/31/2016.
 */
public class MainController {
    public static void main(String[] args) throws Exception {

        AnimalFactory abstractFactory = new AnimalFactory();

        SpeciesFactory speciesFactoryMammals = abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);
        SpeciesFactory speciesFactoryReptiles = abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);
        SpeciesFactory speciesFactoryInsects = abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);
        SpeciesFactory speciesFactoryBirds = abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);
        SpeciesFactory speciesFactoryAquatic = abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);

        Random random = new Random();
        Animal[] animal = new Animal[Constants.numbers.SIZE_OF_ZOO];
        int randomIntAnimal;
        String result;

        for(int i = 0; i < Constants.numbers.SIZE_OF_ZOO; i++){
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
        for (int i = 0; i < Constants.numbers.SIZE_OF_ZOO; i++){
            System.out.printf("We have an %s with %d legs!\n", animal[i].getName(), animal[i].getNrOfLegs());
        }


        CaretakerFactory caretakerFactory = new CaretakerFactory();
        Employee[] employees = new Employee[Constants.numbers.NOOFWORKERS];

        for (int i = 0; i < Constants.numbers.NOOFWORKERS; i++){
            employees[i] = caretakerFactory.getEmployee(Constants.Employee.CARETAKER);
        }


        nextCaretaker:
        for (int i = 0; i < Constants.numbers.NOOFWORKERS; i++){
            for (int j = 0; j < Constants.numbers.SIZE_OF_ZOO; j++){
                if((employees[i].isDead() == false) && (animal[j].isTakenCareOf() == false)){
                    result = ((Caretaker) employees[i]).takeCareOf(animal[j]);
                    if(result.equals(Constants.Employee.Caretakers.TCO_KILLED)){
                        employees[i].setDead(true);
                        System.out.println(employees[i].getName() + " is dead!");
                        continue nextCaretaker;
                    }else if(result.equals(Constants.Employee.Caretakers.TCO_NO_TIME)){
                        continue;
                    }
                    else{
                        animal[j].setTakenCareOf(true);
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < Constants.numbers.SIZE_OF_ZOO; i++) {
            if (animal[i].isTakenCareOf()) {
                System.out.println(animal[i].getName() + " is taken care of.");
            } else {
                System.out.println(animal[i].getName() + " is not taken care of.");
            }
        }
    }
}
