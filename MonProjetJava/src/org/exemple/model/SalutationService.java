
package org.exemple.model;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SalutationService", targetNamespace = "http://model.exemple.org/", wsdlLocation = "http://10.138.2.19:8080/J2EE/ws/salut?wsdl")
public class SalutationService
    extends Service
{

    private final static URL SALUTATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException SALUTATIONSERVICE_EXCEPTION;
    private final static QName SALUTATIONSERVICE_QNAME = new QName("http://model.exemple.org/", "SalutationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.138.2.19:8080/J2EE/ws/salut?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SALUTATIONSERVICE_WSDL_LOCATION = url;
        SALUTATIONSERVICE_EXCEPTION = e;
    }

    public SalutationService() {
        super(__getWsdlLocation(), SALUTATIONSERVICE_QNAME);
    }

    public SalutationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SALUTATIONSERVICE_QNAME, features);
    }

    public SalutationService(URL wsdlLocation) {
        super(wsdlLocation, SALUTATIONSERVICE_QNAME);
    }

    public SalutationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SALUTATIONSERVICE_QNAME, features);
    }

    public SalutationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SalutationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Salutation
     */
    @WebEndpoint(name = "SalutationPort")
    public Salutation getSalutationPort() {
        return super.getPort(new QName("http://model.exemple.org/", "SalutationPort"), Salutation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Salutation
     */
    @WebEndpoint(name = "SalutationPort")
    public Salutation getSalutationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://model.exemple.org/", "SalutationPort"), Salutation.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SALUTATIONSERVICE_EXCEPTION!= null) {
            throw SALUTATIONSERVICE_EXCEPTION;
        }
        return SALUTATIONSERVICE_WSDL_LOCATION;
    }

}