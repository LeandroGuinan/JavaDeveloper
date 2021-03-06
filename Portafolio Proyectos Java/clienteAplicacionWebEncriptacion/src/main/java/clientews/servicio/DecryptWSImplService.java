
package clientews.servicio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DecryptWSImplService", targetNamespace = "http://servicio.en.com.it/", wsdlLocation = "http://localhost:8080/DecryptWSImplService/DecryptWSImpl?wsdl")
public class DecryptWSImplService
    extends Service
{

    private final static URL DECRYPTWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DECRYPTWSIMPLSERVICE_EXCEPTION;
    private final static QName DECRYPTWSIMPLSERVICE_QNAME = new QName("http://servicio.en.com.it/", "DecryptWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/DecryptWSImplService/DecryptWSImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DECRYPTWSIMPLSERVICE_WSDL_LOCATION = url;
        DECRYPTWSIMPLSERVICE_EXCEPTION = e;
    }

    public DecryptWSImplService() {
        super(__getWsdlLocation(), DECRYPTWSIMPLSERVICE_QNAME);
    }

    public DecryptWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DECRYPTWSIMPLSERVICE_QNAME, features);
    }

    public DecryptWSImplService(URL wsdlLocation) {
        super(wsdlLocation, DECRYPTWSIMPLSERVICE_QNAME);
    }

    public DecryptWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DECRYPTWSIMPLSERVICE_QNAME, features);
    }

    public DecryptWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DecryptWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DecryptWS
     */
    @WebEndpoint(name = "DecryptWSImplPort")
    public DecryptWS getDecryptWSImplPort() {
        return super.getPort(new QName("http://servicio.en.com.it/", "DecryptWSImplPort"), DecryptWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DecryptWS
     */
    @WebEndpoint(name = "DecryptWSImplPort")
    public DecryptWS getDecryptWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.en.com.it/", "DecryptWSImplPort"), DecryptWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DECRYPTWSIMPLSERVICE_EXCEPTION!= null) {
            throw DECRYPTWSIMPLSERVICE_EXCEPTION;
        }
        return DECRYPTWSIMPLSERVICE_WSDL_LOCATION;
    }

}
