package models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Mammal extends Animal {
    private float normalBodyTemp;
    private float percBodyHair;

    public Mammal(double maintenanceCost, double dangerPerc){
        super(maintenanceCost,dangerPerc);
    }

    public float getNormalBodyTemp() {
        return normalBodyTemp;
    }

    public void setNormalBodyTemp(float normalBodyTemp) {
        this.normalBodyTemp = normalBodyTemp;
    }

    public float getPercBodyHair() {
        return percBodyHair;
    }

    public void setPercBodyHair(float percBodyHair) {
        this.percBodyHair = percBodyHair;
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
        createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
    }

    @Override
    public void decodeFromXml(Element element) {
        setNormalBodyTemp(Float.valueOf(element
                .getElementsByTagName("normalBodyTemp")
                .item(0)
                .getTextContent()));

        setPercBodyHair(Float.valueOf(element
                .getElementsByTagName("percBodyHair")
                .item(0)
                .getTextContent()));
    }
}
