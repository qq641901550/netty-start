
package org.datacontract.schemas._2004._07.ivps_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.ivps.AlarmType;


/**
 * <p>AlarmInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AlarmInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlarmType" type="{http://schemas.datacontract.org/2004/07/Ivps.Common}AlarmType" minOccurs="0"/>
 *         &lt;element name="CameraId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CameraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonScoreList" type="{http://schemas.datacontract.org/2004/07/Ivps.WS.Models}ArrayOfPersonScoreInfo" minOccurs="0"/>
 *         &lt;element name="TakeFacePicFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmInfo", propOrder = {
    "alarmType",
    "cameraId",
    "cameraName",
    "keyId",
    "personScoreList",
    "takeFacePicFileName",
    "text",
    "time"
})
public class AlarmInfo {

    @XmlElement(name = "AlarmType")
    @XmlSchemaType(name = "string")
    protected AlarmType alarmType;
    @XmlElement(name = "CameraId")
    protected Integer cameraId;
    @XmlElementRef(name = "CameraName", namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cameraName;
    @XmlElementRef(name = "KeyId", namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyId;
    @XmlElementRef(name = "PersonScoreList", namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPersonScoreInfo> personScoreList;
    @XmlElementRef(name = "TakeFacePicFileName", namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> takeFacePicFileName;
    @XmlElementRef(name = "Text", namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;

    /**
     * ��ȡalarmType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AlarmType }
     *     
     */
    public AlarmType getAlarmType() {
        return alarmType;
    }

    /**
     * ����alarmType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmType }
     *     
     */
    public void setAlarmType(AlarmType value) {
        this.alarmType = value;
    }

    /**
     * ��ȡcameraId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCameraId() {
        return cameraId;
    }

    /**
     * ����cameraId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCameraId(Integer value) {
        this.cameraId = value;
    }

    /**
     * ��ȡcameraName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCameraName() {
        return cameraName;
    }

    /**
     * ����cameraName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCameraName(JAXBElement<String> value) {
        this.cameraName = value;
    }

    /**
     * ��ȡkeyId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyId() {
        return keyId;
    }

    /**
     * ����keyId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyId(JAXBElement<String> value) {
        this.keyId = value;
    }

    /**
     * ��ȡpersonScoreList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPersonScoreInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPersonScoreInfo> getPersonScoreList() {
        return personScoreList;
    }

    /**
     * ����personScoreList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPersonScoreInfo }{@code >}
     *     
     */
    public void setPersonScoreList(JAXBElement<ArrayOfPersonScoreInfo> value) {
        this.personScoreList = value;
    }

    /**
     * ��ȡtakeFacePicFileName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTakeFacePicFileName() {
        return takeFacePicFileName;
    }

    /**
     * ����takeFacePicFileName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTakeFacePicFileName(JAXBElement<String> value) {
        this.takeFacePicFileName = value;
    }

    /**
     * ��ȡtext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * ����text���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
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

}
