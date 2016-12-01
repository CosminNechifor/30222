package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.util.Date;

import static repositories.AnimalRepository.createNode;

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

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.CROCODILE);
    }
}
