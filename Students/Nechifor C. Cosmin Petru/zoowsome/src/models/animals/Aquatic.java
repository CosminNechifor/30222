package models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Aquatic extends Animal{
    private int avgSwimDepth;
    public enum typeOfWater{
        SALT_WATER, FRESH_WATER
    }
    private typeOfWater waterType;

    public Aquatic(double maintenanceCost, double dangerPerc){
        super(maintenanceCost,dangerPerc);
    }

    public int getAvgSwimDepth() {
        return avgSwimDepth;
    }

    public void setAvgSwimDepth(int avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }

    public typeOfWater getWaterType() {
        return waterType;
    }

    public void setWaterType(typeOfWater water) {
        this.waterType = water;
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
        createNode(eventWriter, "waterType", String.valueOf(this.waterType));
    }

    @Override
    public void decodeFromXml(Element element) {
        setAvgSwimDepth(Integer.valueOf(element
                .getElementsByTagName("avgSwimDepth")
                .item(0)
                .getTextContent()));

        setWaterType(typeOfWater.valueOf(element
                .getElementsByTagName("waterType")
                .item(0)
                .getTextContent()));
    }
}
