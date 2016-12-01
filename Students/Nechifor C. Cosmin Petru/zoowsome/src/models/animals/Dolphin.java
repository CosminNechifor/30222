package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/31/2016.
 */
public class Dolphin extends Aquatic {
    public Dolphin(String name, int avgSwimDepth, typeOfWater water){
        super(5.0,0.05);
        setName(name);
        setNrOfLegs(0);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(water);
    }
    public Dolphin(String name){
        this(name,43,typeOfWater.SALT_WATER);
    }
    public Dolphin(String name, typeOfWater water){
        this(name,43,water);
    }
    public Dolphin(String name, int avgSwimDepth){
        this(name,avgSwimDepth,typeOfWater.SALT_WATER);
    }
    public Dolphin(){
        this("Dolphin",43,typeOfWater.SALT_WATER);
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.DOLPHIN);
    }
}

