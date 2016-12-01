package repositories;

import models.animals.*;
import models.interfaces.XML_Parsable;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import services.factories.Constants;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by p on 11/20/2016.
 */
public class AnimalRepository {
    private static final String XML_FILENAME = "Animals.xml";
    public AnimalRepository(){

    }
    public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException{
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");

        StartDocument startDocument = eventFactory.createStartDocument();
        eventWriter.add(startDocument);

        StartElement configStartElement = eventFactory.createStartElement("", "", "content");
        eventWriter.add(configStartElement);
        eventWriter.add(end);

        for (XML_Parsable animal: animals){
            StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
            eventWriter.add(sElement);
            eventWriter.add(end);

            animal.encodeToXml(eventWriter);

            EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
            eventWriter.add(eElement);
            eventWriter.add(end);
        }
        eventWriter.add(eventFactory.createEndElement("", "", "content"));
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    public ArrayList<Animal> load() throws ParserConfigurationException, IOException, org.xml.sax.SAXException {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        File fXmlFile = new File(XML_FILENAME);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(fXmlFile);
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

        for (int i = 0; i < nodeList.getLength(); i++){
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element)node;
                String discriminant =
                        element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT)
                        .item(0)
                        .getTextContent();
                switch(discriminant){
                    case Constants.Animals.Insect.BUTTERFLY :
                        Animal butterfly = new Butterfly();
                        butterfly.decodeFromXml(element);
                        animals.add(butterfly);
                        break;
                    case Constants.Animals.Insect.COCKROACH :
                        Animal cockroach = new Cockroach();
                        cockroach.decodeFromXml(element);
                        animals.add(cockroach);
                        break;
                    case Constants.Animals.Insect.SPIDER :
                        Animal spider = new Spider();
                        spider.decodeFromXml(element);
                        animals.add(spider);
                        break;
                    case Constants.Animals.Aquatic.DOLPHIN :
                        Animal dolphin = new Dolphin();
                        dolphin.decodeFromXml(element);
                        animals.add(dolphin);
                        break;
                    case Constants.Animals.Aquatic.FISH :
                        Animal fish = new Fish();
                        fish.decodeFromXml(element);
                        animals.add(fish);
                        break;
                    case Constants.Animals.Aquatic.OTTER :
                        Animal otter = new Otter();
                        otter.decodeFromXml(element);
                        animals.add(otter);
                        break;
                    case Constants.Animals.Bird.EAGLE :
                        Animal eagle = new Eagle();
                        eagle.decodeFromXml(element);
                        animals.add(eagle);
                        break;
                    case Constants.Animals.Bird.OWL :
                        Animal owl = new Owl();
                        owl.decodeFromXml(element);
                        animals.add(owl);
                        break;
                    case Constants.Animals.Bird.SWALLOW :
                        Animal swallow = new Swallow();
                        swallow.decodeFromXml(element);
                        animals.add(swallow);
                        break;
                    case Constants.Animals.Mammals.COW :
                        Animal cow = new Cow();
                        cow.decodeFromXml(element);
                        animals.add(cow);
                        break;
                    case Constants.Animals.Mammals.MONKEY :
                        Animal monkey = new Monkey();
                        monkey.decodeFromXml(element);
                        animals.add(monkey);
                        break;
                    case Constants.Animals.Mammals.TIGER :
                        Animal tiger = new Tiger();
                        tiger.decodeFromXml(element);
                        animals.add(tiger);
                        break;
                    case Constants.Animals.Reptile.CHAMELEON :
                        Animal chameleon = new Chameleon();
                        chameleon.decodeFromXml(element);
                        animals.add(chameleon);
                        break;
                    case Constants.Animals.Reptile.CROCODILE :
                        Animal crocodile = new Crocodile();
                        crocodile.decodeFromXml(element);
                        animals.add(crocodile);
                        break;
                    case Constants.Animals.Reptile.LIZARD :
                        Animal lizard = new Lizard();
                        lizard.decodeFromXml(element);
                        animals.add(lizard);
                        break;
                    default:
                        break;
                }
            }
        }
        return animals;
    }

    public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");

        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);
        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(end);
    }



}
