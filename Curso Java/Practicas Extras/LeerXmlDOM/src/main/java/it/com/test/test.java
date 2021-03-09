package it.com.test;

import it.com.SAXParser.ParserXML;
import it.com.DOMParser.ParserXml;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class test {

    public static void main(String[] args) {
        String url = "C:\\Users\\guina\\Desktop\\prueba\\test.xml";
        ParserXML p = new ParserXML();
//        ParserXml o = new ParserXml();
//        try {
//            o.Parser(url);
//        } catch (ParserConfigurationException ex) {
//            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SAXException ex) {
//            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            p.Parser(url);
        } catch (SAXException ex) {
            ex.printStackTrace();
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

/*
aqui se muestran dos maneras de parsear un xml, si bien ambas son validas, todo depende
de la nececidad, de ser necesario ambas pueden crear objetos java
*/
