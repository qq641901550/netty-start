
package org.datacontract.schemas._2004._07.ivps_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ReaFacelRecoInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ReaFacelRecoInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CameraId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="KeyAutoID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreList" type="{http://schemas.datacontract.org/2004/07/Ivps.WS.Models}ArrayOfRecoScoreInfo" minOccurs="0"/>
 *         &lt;element name="TakeFaceJpegBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
@XmlType(name = "ReaFacelRecoInfo", propOrder = {
    "cameraId",
    "keyAutoID",
    "scoreList",
    "takeFaceJpegBytes",
    "time"
})
public class ReaFacelRecoInfo {

    @XmlElement(name = "CameraId")
    protected Integer cameraId;
    @XmlElement(name = "KeyAutoID")
    protected Integer keyAutoID;
    @XmlElementRef(name = "ScoreList", namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRecoScoreInfo> scoreList;
    @XmlElementRef(name = "TakeFaceJpegBytes", namespace = "http://schemas.datacontract.org/2004/07/Ivps.WS.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> takeFaceJpegBytes;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;

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
     * 获取keyAutoID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKeyAutoID() {
        return keyAutoID;
    }

    /**
     * 设置keyAutoID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKeyAutoID(Integer value) {
        this.keyAutoID = value;
    }

    /**
     * 获取scoreList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRecoScoreInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRecoScoreInfo> getScoreList() {
        return scoreList;
    }

    /**
     * 设置scoreList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRecoScoreInfo }{@code >}
     *     
     */
    public void setScoreList(JAXBElement<ArrayOfRecoScoreInfo> value) {
        this.scoreList = value;
    }

    /**
     * 获取takeFaceJpegBytes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getTakeFaceJpegBytes() {
        return takeFaceJpegBytes;
    }

    /**
     * 设置takeFaceJpegBytes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setTakeFaceJpegBytes(JAXBElement<byte[]> value) {
        this.takeFaceJpegBytes = value;
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
