package models.animals;

import services.factories.Constants;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/31/2016.
 */
public class Eagle extends Bird {
    public Eagle(String name, boolean migrates, int avgFlightAltitude){
        super(2.0,0.09);
        setNrOfLegs(2);
        setName(name);
        setAvgFlightAltitude(avgFlightAltitude);
        setMigrates(migrates);
    }
    public Eagle(String name){
        this(name,true,3810);
    }
    public Eagle(){
        this("Eagle",true,3810);
    }
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Bird.EAGLE);
    }
}
