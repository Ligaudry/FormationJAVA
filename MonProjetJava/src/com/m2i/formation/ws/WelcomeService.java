
package com.m2i.formation.ws;

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
@WebServiceClient(name = "WelcomeService", targetNamespace = "http://ws.formation.m2i.com/", wsdlLocation = "http://10.138.2.24:8080/FormationJEE/ws/salut?wsdl")
public class WelcomeService
    extends Service
{

    private final static URL WELCOMESERVICE_WSDL_LOCATION;
    private final static WebServiceException WELCOMESERVICE_EXCEPTION;
    private final static QName WELCOMESERVICE_QNAME = new QName("http://ws.formation.m2i.com/", "WelcomeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.138.2.24:8080/FormationJEE/ws/salut?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WELCOMESERVICE_WSDL_LOCATION = url;
        WELCOMESERVICE_EXCEPTION = e;
    }

    public WelcomeService() {
        super(__getWsdlLocation(), WELCOMESERVICE_QNAME);
    }

    public WelcomeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WELCOMESERVICE_QNAME, features);
    }

    public WelcomeService(URL wsdlLocation) {
        super(wsdlLocation, WELCOMESERVICE_QNAME);
    }

    public WelcomeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WELCOMESERVICE_QNAME, features);
    }

    public WelcomeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WelcomeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Welcome
     */
    @WebEndpoint(name = "WelcomePort")
    public Welcome getWelcomePort() {
        return super.getPort(new QName("http://ws.formation.m2i.com/", "WelcomePort"), Welcome.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Welcome
     */
    @WebEndpoint(name = "WelcomePort")
    public Welcome getWelcomePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.formation.m2i.com/", "WelcomePort"), Welcome.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WELCOMESERVICE_EXCEPTION!= null) {
            throw WELCOMESERVICE_EXCEPTION;
        }
        return WELCOMESERVICE_WSDL_LOCATION;
    }

}
