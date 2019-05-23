
package org.datacontract.schemas._2004._07.ivps;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ivps package. 
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

    private final static QName _DrvierType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.Common", "DrvierType");
    private final static QName _AlarmType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Ivps.Common", "AlarmType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ivps
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DrvierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.Common", name = "DrvierType")
    public JAXBElement<DrvierType> createDrvierType(DrvierType value) {
        return new JAXBElement<DrvierType>(_DrvierType_QNAME, DrvierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlarmType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Ivps.Common", name = "AlarmType")
    public JAXBElement<AlarmType> createAlarmType(AlarmType value) {
        return new JAXBElement<AlarmType>(_AlarmType_QNAME, AlarmType.class, null, value);
    }

}
