
package services;

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
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSAdmin", targetNamespace = "http://WS/", wsdlLocation = "http://localhost:8080/Threadther/WSAdmin?WSDL")
public class WSAdmin_Service
    extends Service
{

    private final static URL WSADMIN_WSDL_LOCATION;
    private final static WebServiceException WSADMIN_EXCEPTION;
    private final static QName WSADMIN_QNAME = new QName("http://WS/", "WSAdmin");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Threadther/WSAdmin?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSADMIN_WSDL_LOCATION = url;
        WSADMIN_EXCEPTION = e;
    }

    public WSAdmin_Service() {
        super(__getWsdlLocation(), WSADMIN_QNAME);
    }

    public WSAdmin_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSADMIN_QNAME, features);
    }

    public WSAdmin_Service(URL wsdlLocation) {
        super(wsdlLocation, WSADMIN_QNAME);
    }

    public WSAdmin_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSADMIN_QNAME, features);
    }

    public WSAdmin_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSAdmin_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSAdmin
     */
    @WebEndpoint(name = "WSAdminPort")
    public WSAdmin getWSAdminPort() {
        return super.getPort(new QName("http://WS/", "WSAdminPort"), WSAdmin.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSAdmin
     */
    @WebEndpoint(name = "WSAdminPort")
    public WSAdmin getWSAdminPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://WS/", "WSAdminPort"), WSAdmin.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSADMIN_EXCEPTION!= null) {
            throw WSADMIN_EXCEPTION;
        }
        return WSADMIN_WSDL_LOCATION;
    }

}
