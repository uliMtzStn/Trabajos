
package servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicio package. 
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

    private final static QName _CentFar_QNAME = new QName("http://Servicio/", "Cent_Far");
    private final static QName _CentFarResponse_QNAME = new QName("http://Servicio/", "Cent_FarResponse");
    private final static QName _FarCent_QNAME = new QName("http://Servicio/", "Far_Cent");
    private final static QName _FarCentResponse_QNAME = new QName("http://Servicio/", "Far_CentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CentFar }
     * 
     */
    public CentFar createCentFar() {
        return new CentFar();
    }

    /**
     * Create an instance of {@link CentFarResponse }
     * 
     */
    public CentFarResponse createCentFarResponse() {
        return new CentFarResponse();
    }

    /**
     * Create an instance of {@link FarCent }
     * 
     */
    public FarCent createFarCent() {
        return new FarCent();
    }

    /**
     * Create an instance of {@link FarCentResponse }
     * 
     */
    public FarCentResponse createFarCentResponse() {
        return new FarCentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentFar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "Cent_Far")
    public JAXBElement<CentFar> createCentFar(CentFar value) {
        return new JAXBElement<CentFar>(_CentFar_QNAME, CentFar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentFarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "Cent_FarResponse")
    public JAXBElement<CentFarResponse> createCentFarResponse(CentFarResponse value) {
        return new JAXBElement<CentFarResponse>(_CentFarResponse_QNAME, CentFarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarCent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "Far_Cent")
    public JAXBElement<FarCent> createFarCent(FarCent value) {
        return new JAXBElement<FarCent>(_FarCent_QNAME, FarCent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarCentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Servicio/", name = "Far_CentResponse")
    public JAXBElement<FarCentResponse> createFarCentResponse(FarCentResponse value) {
        return new JAXBElement<FarCentResponse>(_FarCentResponse_QNAME, FarCentResponse.class, null, value);
    }

}
