package models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Bird extends Animal{
    private boolean migrates;
    private int avgFlightAltitude;

    public Bird(double maintenanceCost, double dangerPerc){
        super(maintenanceCost,dangerPerc);
    }

    public int getAvgFlightAltitude() {
        return avgFlightAltitude;
    }

    public void setAvgFlightAltitude(int avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }

    public void setMigrates(boolean migrates) {
        this.migrates = migrates;
    }

    public boolean isMigrates() {
        return migrates;
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "migrates", String.valueOf(this.migrates));
        createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
    }

    @Override
    public void decodeFromXml(Element element) {
        setMigrates(Boolean.valueOf(element
                .getElementsByTagName("migrates")
                .item(0)
                .getTextContent()));

        setAvgFlightAltitude(Integer.valueOf(element
                .getElementsByTagName("avgFlightAltitude")
                .item(0)
                .getTextContent()));
    }
}
