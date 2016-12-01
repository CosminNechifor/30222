package models.interfaces;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

/**
 * Created by p on 11/20/2016.
 */
public interface XML_Parsable {
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException;
    public void decodeFromXml(Element element);
}
