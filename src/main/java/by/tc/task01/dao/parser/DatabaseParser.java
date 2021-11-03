package by.tc.task01.dao.parser;

import by.tc.task01.entity.Appliance;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DatabaseParser {


    public static void main(String[] args) throws IOException, JDOMException {
        String databasePath =
                "F:\\EPAM_September\\by\\training\\jwd\\jwd-task01-template_v2\\src\\main\\resources\\appliancedatabase.xml";

        SAXBuilder saxBuilder = new SAXBuilder();
        Document document = saxBuilder.build(databasePath);

        Element root = document.getRootElement();
        List<Element> ap = root.getChildren();
        Iterator<Element> applaianceIterator = ap.iterator();
        while (applaianceIterator.hasNext()) {
            Element applElement = applaianceIterator.next();
            System.out.println(applElement.getChildText("title"));
        }
    }

}



//        SAXParserFactory factory = SAXParserFactory.newInstance();
//        SAXParser parser = factory.newSAXParser();
//
//        AdvancedXMLHandler handler = new AdvancedXMLHandler();
//        parser.parse(new File("resources/appliancedatabase.xml"), handler);
//
//        for (Appliance appl : applianceArrayList) {
//            System.out.println(appl.);
//
//        }
//    }
//
//    private static class AdvancedXMLHandler extends DefaultHandler {
//        @Override
//        public void startElement(String uri, String localName, String qName, Attributes attributes) {
//
//        }
//
//
//    }

