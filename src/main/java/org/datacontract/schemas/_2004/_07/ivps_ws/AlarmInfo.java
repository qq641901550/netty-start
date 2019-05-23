
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
 * <p>AlarmInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取alarmType属性的值。
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
     * 设置alarmType属性的值。
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
     * 获取cameraId属性的值。
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
     * 设置cameraId属性的值。
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
     * 获取cameraName属性的值。
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
     * 设置cameraName属性的值。
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
     * 获取keyId属性的值。
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
     * 设置keyId属性的值。
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
     * 获取personScoreList属性的值。
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
     * 设置personScoreList属性的值。
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
     * 获取takeFacePicFileName属性的值。
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
     * 设置takeFacePicFileName属性的值。
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
     * 获取text属性的值。
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
     * 设置text属性的值。
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

}
