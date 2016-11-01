package services.factories;

/**
 * Created by p on 10/31/2016.
 */
public class AnimalFactory {
    public SpeciesFactory getSpeciesFactory(String type) throws Exception{
        if(Constants.Species.MAMMALS.equals(type)){
            return new MammalFactory();
        }else if(Constants.Species.REPTILES.equals(type)){
            return new ReptileFactory();
        }else if(Constants.Species.BIRDS.equals(type)){
            return new BirdFactory();
        }else if(Constants.Species.INSECTS.equals(type)){
            return new InsectFactory();
        }else if(Constants.Species.AQUATICS.equals(type)){
            return new AquaticFactory();
        }else{
            throw new Exception("Invalid species exception!");
        }
    }
}
