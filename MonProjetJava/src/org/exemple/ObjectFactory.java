
package org.exemple;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.exemple package. 
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

    private final static QName _SalutResponse_QNAME = new QName("http://exemple.org/", "salutResponse");
    private final static QName _Salut_QNAME = new QName("http://exemple.org/", "salut");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.exemple
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SalutResponse }
     * 
     */
    public SalutResponse createSalutResponse() {
        return new SalutResponse();
    }

    /**
     * Create an instance of {@link Salut }
     * 
     */
    public Salut createSalut() {
        return new Salut();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exemple.org/", name = "salutResponse")
    public JAXBElement<SalutResponse> createSalutResponse(SalutResponse value) {
        return new JAXBElement<SalutResponse>(_SalutResponse_QNAME, SalutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Salut }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://exemple.org/", name = "salut")
    public JAXBElement<Salut> createSalut(Salut value) {
        return new JAXBElement<Salut>(_Salut_QNAME, Salut.class, null, value);
    }

}
