package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/31/2016.
 */
public class Swallow extends Bird {
    public Swallow(String name, boolean migrates, int avgFlightAlt ){
        super(1,0.01);
        setName(name);
        setAvgFlightAltitude(avgFlightAlt);
        setMigrates(migrates);
        setNrOfLegs(2);
    }
    public Swallow(String name, boolean migrates){
        this(name,migrates,2000);
    }
    public Swallow(String name, int avgFlightAlt){
        this(name,true,avgFlightAlt);
    }
    public Swallow(){
        this("Swallow",true,2000);
    }
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.SWALLOW);
    }
}
