
package com.m2i.formation.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.m2i.formation.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMessStart_QNAME = new QName("http://ws.formation.m2i.com/", "getMessStart");
    private final static QName _GetMessStartResponse_QNAME = new QName("http://ws.formation.m2i.com/", "getMessStartResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.m2i.formation.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMessStartResponse }
     * 
     */
    public GetMessStartResponse createGetMessStartResponse() {
        return new GetMessStartResponse();
    }

    /**
     * Create an instance of {@link GetMessStart }
     * 
     */
    public GetMessStart createGetMessStart() {
        return new GetMessStart();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessStart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.formation.m2i.com/", name = "getMessStart")
    public JAXBElement<GetMessStart> createGetMessStart(GetMessStart value) {
        return new JAXBElement<GetMessStart>(_GetMessStart_QNAME, GetMessStart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessStartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.formation.m2i.com/", name = "getMessStartResponse")
    public JAXBElement<GetMessStartResponse> createGetMessStartResponse(GetMessStartResponse value) {
        return new JAXBElement<GetMessStartResponse>(_GetMessStartResponse_QNAME, GetMessStartResponse.class, null, value);
    }

}
