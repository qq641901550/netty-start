
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
 * <p>ReaFacelRecoInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡkeyAutoID���Ե�ֵ��
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
     * ����keyAutoID���Ե�ֵ��
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
     * ��ȡscoreList���Ե�ֵ��
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
     * ����scoreList���Ե�ֵ��
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
     * ��ȡtakeFaceJpegBytes���Ե�ֵ��
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
     * ����takeFaceJpegBytes���Ե�ֵ��
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
