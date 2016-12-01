package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/31/2016.
 */
public class Chameleon extends Reptile {
    public Chameleon(String name){
        super(1.0,0.01);
        setName(name);
        setLaysEggs(true);
        setNrOfLegs(4);
    }
    public Chameleon(){
        this("Chameleon");
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.CHAMELEON);
    }
}
