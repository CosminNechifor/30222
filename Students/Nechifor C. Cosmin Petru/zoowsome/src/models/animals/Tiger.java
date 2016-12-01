package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import java.util.Date;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/30/2016.
 */
public class Tiger extends Mammal {

    Date time = new Date();

    public Tiger(){
        this("Tiger", 4);
    }

    public Tiger(String nameOfTheTiger, int nrOfLegs){
        super(6,0.4);
        setPercBodyHair(99);
        setNormalBodyTemp(95);
        setName(nameOfTheTiger);
        setNrOfLegs(nrOfLegs);
    }
    public Tiger(String nameOFTheTiger){
        this(nameOFTheTiger,4);
    }

    @Override
    public double getPredisposition() {
        if(time.getHours() > 5 && time.getHours() < 15){
            return Constants.numbers.TIGER_KILLING_PREDISPOSITION;
        }
        else{
            return 0;
        }
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.TIGER);
    }
}
