package it.com.SAXParser;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.*;
import org.xml.sax.SAXException;

public class ParserXML {
    
    //se crea un metodo que recide el url del archivo:
    public void Parser(String url) throws SAXException, ParserConfigurationException, IOException{
        //se instancia el saxParserFactory:
        SAXParserFactory saxPF = SAXParserFactory.newInstance();
        
        //y se crea el saxParser:
        SAXParser sp = saxPF.newSAXParser();
        
        //se crea una instancia del handler que creamos:
        SAXHandler sh = new SAXHandler();
        
        //y parseamos el archivo recibido y añadimos el objeto parser:
        sp.parse(new File(url),sh);
        
        //tomalos la lista de objetos:
        List<Direccion> lista = sh.getDirecciones();
        
        // e iteramos:
        for(Direccion d: lista){
            System.out.println(d);
        }
    }
}
