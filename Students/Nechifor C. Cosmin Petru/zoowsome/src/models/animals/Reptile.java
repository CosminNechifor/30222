package models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Reptile extends Animal {
    private boolean laysEggs;

    public Reptile(double maintenanceCost, double dangerPerc){
        super(maintenanceCost,dangerPerc);
    }

    public boolean islaysEggs(){
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs){
        this.laysEggs = laysEggs;
    }

    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
    }

    @Override
    public void decodeFromXml(Element element) {
        setLaysEggs(Boolean.valueOf(element
                .getElementsByTagName("laysEggs")
                .item(0)
                .getTextContent()));
    }
}
