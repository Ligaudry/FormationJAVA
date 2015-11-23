
package org.exemple.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.exemple.model package. 
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

    private final static QName _GetAllUser_QNAME = new QName("http://model.exemple.org/", "getAllUser");
    private final static QName _BonjourResponse_QNAME = new QName("http://model.exemple.org/", "bonjourResponse");
    private final static QName _GetAllUserResponse_QNAME = new QName("http://model.exemple.org/", "getAllUserResponse");
    private final static QName _Bonjour_QNAME = new QName("http://model.exemple.org/", "bonjour");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.exemple.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllUser }
     * 
     */
    public GetAllUser createGetAllUser() {
        return new GetAllUser();
    }

    /**
     * Create an instance of {@link BonjourResponse }
     * 
     */
    public BonjourResponse createBonjourResponse() {
        return new BonjourResponse();
    }

    /**
     * Create an instance of {@link GetAllUserResponse }
     * 
     */
    public GetAllUserResponse createGetAllUserResponse() {
        return new GetAllUserResponse();
    }

    /**
     * Create an instance of {@link Bonjour }
     * 
     */
    public Bonjour createBonjour() {
        return new Bonjour();
    }

    /**
     * Create an instance of {@link Utilisateur }
     * 
     */
    public Utilisateur createUtilisateur() {
        return new Utilisateur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.exemple.org/", name = "getAllUser")
    public JAXBElement<GetAllUser> createGetAllUser(GetAllUser value) {
        return new JAXBElement<GetAllUser>(_GetAllUser_QNAME, GetAllUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BonjourResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.exemple.org/", name = "bonjourResponse")
    public JAXBElement<BonjourResponse> createBonjourResponse(BonjourResponse value) {
        return new JAXBElement<BonjourResponse>(_BonjourResponse_QNAME, BonjourResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.exemple.org/", name = "getAllUserResponse")
    public JAXBElement<GetAllUserResponse> createGetAllUserResponse(GetAllUserResponse value) {
        return new JAXBElement<GetAllUserResponse>(_GetAllUserResponse_QNAME, GetAllUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bonjour }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.exemple.org/", name = "bonjour")
    public JAXBElement<Bonjour> createBonjour(Bonjour value) {
        return new JAXBElement<Bonjour>(_Bonjour_QNAME, Bonjour.class, null, value);
    }

}
