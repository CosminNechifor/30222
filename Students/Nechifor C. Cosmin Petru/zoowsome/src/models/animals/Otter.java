package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/31/2016.
 */
public class Otter extends Aquatic {
    public Otter(String name, int avgSwimDepth){
        super(1,0.01);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(typeOfWater.FRESH_WATER);
        setName(name);
        setNrOfLegs(4);
    }
    public Otter(String name){
        this(name,40);
    }
    public Otter(){
        this("Otter",40);
    }
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.OTTER);
    }
}
