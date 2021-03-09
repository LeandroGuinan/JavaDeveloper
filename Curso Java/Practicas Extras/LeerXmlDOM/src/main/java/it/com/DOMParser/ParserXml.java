package it.com.DOMParser;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParserXml {
    
    public void Parser(String url) throws ParserConfigurationException, SAXException, IOException{
        
        //se crea un archivo en memoria con la ruta:
        File xmlFile = new File(url);
        //se crea una instancia del contructor de documentos
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        //y se crea el constructor de documentos:
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        
        //se le pasa el archivo xml cargado en memoria:
        Document doc = dBuilder.parse(xmlFile);
        
        //los elementos se acomodan como nodos, los cuales se pueden acceder como elementos de texto
        doc.getDocumentElement().normalize();
        
        //se accede al titulo de esta lista de elementos:
        System.out.println("Elemento Raiz: " + doc.getDocumentElement().getNodeName());
        
        //y se crea una lista utilizando el tag name que los agrupa:
        NodeList lista = doc.getElementsByTagName("pointCoordinates");
        System.out.println("--------------");
        System.out.println("");
        
        //se iteran los elementos de esta lista:
        for (int i = 0; i < lista.getLength(); i++) {
            
            //se crea un nodo individual con el item iterado:
            Node nNode = lista.item(i);
            
            //si encuentra un nodo elemento:
            if(nNode.getNodeType() == Node.ELEMENT_NODE){
                //se toma el elemento de este nodo:
                Element e = (Element) nNode;
                
                //y se imprimen en pantalla con los metodos:
                System.out.println("Latitude: " + e.getElementsByTagName("latitude").item(0).getTextContent());
                System.out.println("Longitude: " + e.getElementsByTagName("longitude").item(0).getTextContent());
                
                //adicional a esto, para acceder a un elemento dentro de un tag especifico:
                //e.getAttribute("ejemplo");
            }
            
        }
    }
}
