
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cameraId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="jpegPicBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="personType" type="{http://tempuri.org/}PersonType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "cameraId",
    "time",
    "jpegPicBytes",
    "personType"
})
@XmlRootElement(name = "UpFacePicReco")
public class UpFacePicReco {

    protected String token;
    protected int cameraId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    protected byte[] jpegPicBytes;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PersonType personType;

    /**
     * 获取token属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置token属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * 获取cameraId属性的值。
     * 
     */
    public int getCameraId() {
        return cameraId;
    }

    /**
     * 设置cameraId属性的值。
     * 
     */
    public void setCameraId(int value) {
        this.cameraId = value;
    }

    /**
     * 获取time属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * 设置time属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * 获取jpegPicBytes属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getJpegPicBytes() {
        return jpegPicBytes;
    }

    /**
     * 设置jpegPicBytes属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setJpegPicBytes(byte[] value) {
        this.jpegPicBytes = value;
    }

    /**
     * 获取personType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getPersonType() {
        return personType;
    }

    /**
     * 设置personType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setPersonType(PersonType value) {
        this.personType = value;
    }

}
