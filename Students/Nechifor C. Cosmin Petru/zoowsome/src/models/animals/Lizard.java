package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/31/2016.
 */
public class Lizard extends Reptile {
    public Lizard(String name, boolean laysEggs){
        super(1,0.01);
        setNrOfLegs(4);
        setName(name);
        setLaysEggs(laysEggs);
    }

    public Lizard(String name){
        this(name,true);
    }

    public Lizard(){
        this("Lizard",true);
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.LIZARD);
    }
}
