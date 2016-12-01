package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/30/2016.
 */
public class Cockroach extends Insect{
    public Cockroach(String name, int nrOfLegs, boolean canFly){
        super(0.5,0.07);
        setName(name);
        setDangerous(false);
        setFly(canFly);
        setNrOfLegs(nrOfLegs);
    }

    public Cockroach(String name){
        this(name,8,false);
    }

    public Cockroach(String name, int nrOfLegs){
        this(name,nrOfLegs,false);
    }

    public Cockroach(){
        this("Cockroach",8,false);
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insect.COCKROACH);
    }
}
