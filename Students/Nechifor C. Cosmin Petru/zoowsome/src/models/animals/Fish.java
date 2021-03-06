package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/31/2016.
 */
public class Fish extends Aquatic {
    public Fish(String name, int avgSwimDepth, typeOfWater water){
        super(1.0,0.02);
        setNrOfLegs(0);
        setWaterType(water);
        setAvgSwimDepth(avgSwimDepth);
        setName(name);
    }
    public Fish(String name){
        this(name,40,typeOfWater.FRESH_WATER);
    }
    public Fish(String name, int avgSimDepth){
        this(name,avgSimDepth,typeOfWater.FRESH_WATER);
    }
    public Fish(String name, typeOfWater water){
        this(name,40,typeOfWater.FRESH_WATER);
    }
    public Fish(){
        this("Fish",40,typeOfWater.FRESH_WATER);
    }
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.FISH);
    }
}
