package it.com.SAXParser;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

//para simplificar el codigo se debe extender de la clase:
public class SAXHandler extends DefaultHandler {
    
    //se crea una lista de elementos de direccion:
    private List<Direccion> direcciones = null;
    
    //se crea un objeto direccion:
    private Direccion dir = null;
    
    //y se crea constructor de string:
    private static StringBuilder data = null;
    
    //se genera un get de la lista:
    public List<Direccion> getDirecciones() {
        return direcciones;
    }
    
    //se crean las bandera para eventualmente reconocer los elementos:
    boolean bLatitude = false;
    boolean bLongitude = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        //al iniciar se crea el objeto string builder:
        data = new StringBuilder();
        
        //en este caso si la lista no esta instanciada:
        if (direcciones == null) {
            direcciones = new ArrayList<Direccion>();
            //y se crea un nuevo objeto de la entidad
            dir = new Direccion();
            
            /*
            en este punto se puede agregar un id dentro de un tag o algun otro valor si lo hubiese,
            se toma la variable: attributes, y se llama por el nombre del valor, ej:
            attributes.getValue("id");
            
            y se le agrega al objeto:
            dir.setId(attributes.getValue("id"));
            */
        }
        
        //en este momento se se hace un reconocimiento de los elementos, si este elemento existe:
        if (qName.equalsIgnoreCase("latitude")) {
            //entonces se convierte en verdadero:
            bLatitude = true;
        }
        
        // lo mismo para estos elementos:
        if (qName.equalsIgnoreCase("longitude")) {
            bLongitude = true;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        //si esta reconocido como verdadero entonces:
        if (bLatitude) {
            //se toman los datos y se agregan al objeto direccion:
            dir.setLatitude(data.toString());
            //y se reinicia para una proxima llamada:
            bLatitude = false;
            //lo mismo para los demas elementos:
        } else if (bLongitude) {
            dir.setLongitude(data.toString());
            bLongitude = false;
        }
        
        //en este caso como se completo el ciclo, se toma el nombre del conjunto:
        if (qName.equalsIgnoreCase("pointCoordinates")) {
            //se agrega el objeto direccion creado:
            direcciones.add(dir);
            // y se limpia para un proximo elemento:
            dir = new Direccion();
        }
    }
    
    //en este metodo se generan los caracteres validos para el reconocimimento:
    @Override
    public void characters(char ch[], int start, int length) throws SAXException {
        data.append(ch, start, length);
    }

}
