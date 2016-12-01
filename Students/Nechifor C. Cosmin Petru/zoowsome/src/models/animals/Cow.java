package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/30/2016.
 */
public class Cow extends Mammal {
    public Cow(String name, int nrOfLegs){
        super(3.0,0.02);
        setNormalBodyTemp(45);
        setPercBodyHair(89);
        setNrOfLegs(nrOfLegs);
        setName(name);
    }

    public Cow(){
        this("Cow",4);
    }

    public Cow(String name){
        this(name,4);
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.COW);
    }
}
