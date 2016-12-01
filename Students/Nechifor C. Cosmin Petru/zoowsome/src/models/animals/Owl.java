package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/31/2016.
 */
public class Owl extends Bird {
    //There are some owls who migrate
    public Owl(String name, boolean migrate){
        super(1,0.02);
        setNrOfLegs(2);
        setMigrates(migrate);
        setName(name);
        setAvgFlightAltitude(2000);
    }
    public Owl(String name){
        this(name,false);
    }
    public Owl(){
        this("Owl", false);
    }
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.OWL);
    }
}
