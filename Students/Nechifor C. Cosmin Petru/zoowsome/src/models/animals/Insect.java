package models.animals;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import static repositories.AnimalRepository.createNode;

/**
 * Created by p on 10/30/2016.
 */
public abstract class Insect extends Animal {
    private boolean fly;
    private boolean dangerous;

    public Insect(double maintenanceCost, double dangerPerc){
        super(maintenanceCost,dangerPerc);
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public boolean canFly(){
        return fly;
    }

    @Override
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
        super.encodeToXml(eventWriter);
        createNode(eventWriter, "fly", String.valueOf(this.fly));
        createNode(eventWriter, "dangerous", String.valueOf(this.dangerous));
    }

    @Override
    public void decodeFromXml(Element element) {
        setFly(Boolean.valueOf(element
                .getElementsByTagName("fly")
                .item(0)
                .getTextContent()));

        setDangerous(Boolean.valueOf(element
                .getElementsByTagName("dangerous")
                .item(0)
                .getTextContent()));
    }
}
