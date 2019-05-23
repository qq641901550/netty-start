
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtoken���Ե�ֵ��
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
     * ����token���Ե�ֵ��
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
     * ��ȡcameraId���Ե�ֵ��
     * 
     */
    public int getCameraId() {
        return cameraId;
    }

    /**
     * ����cameraId���Ե�ֵ��
     * 
     */
    public void setCameraId(int value) {
        this.cameraId = value;
    }

    /**
     * ��ȡtime���Ե�ֵ��
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
     * ����time���Ե�ֵ��
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
     * ��ȡjpegPicBytes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getJpegPicBytes() {
        return jpegPicBytes;
    }

    /**
     * ����jpegPicBytes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setJpegPicBytes(byte[] value) {
        this.jpegPicBytes = value;
    }

    /**
     * ��ȡpersonType���Ե�ֵ��
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
     * ����personType���Ե�ֵ��
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
