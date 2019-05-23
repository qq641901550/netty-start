
package org.datacontract.schemas._2004._07.ivps_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ivps.DrvierType;


/**
 * <p>CameraInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CameraInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DrvierType" type="{http://schemas.datacontract.org/2004/07/Ivps.Common}DrvierType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XmlExtBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraInfo", propOrder = {
    "cameraID",
    "drvierType",
    "name",
    "xmlExtBody"
})
public class CameraInfo {

    @XmlElement(name = "CameraID")
    protected Integer cameraID;
    @XmlElement(name = "DrvierType")
    @XmlSchemaType(name = "string")
    protected DrvierType drvierType;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "XmlExtBody", namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmlExtBody;

    /**
     * 获取cameraID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCameraID() {
        return cameraID;
    }

    /**
     * 设置cameraID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCameraID(Integer value) {
        this.cameraID = value;
    }

    /**
     * 获取drvierType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DrvierType }
     *     
     */
    public DrvierType getDrvierType() {
        return drvierType;
    }

    /**
     * 设置drvierType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DrvierType }
     *     
     */
    public void setDrvierType(DrvierType value) {
        this.drvierType = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * 获取xmlExtBody属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXmlExtBody() {
        return xmlExtBody;
    }

    /**
     * 设置xmlExtBody属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXmlExtBody(JAXBElement<String> value) {
        this.xmlExtBody = value;
    }

}
