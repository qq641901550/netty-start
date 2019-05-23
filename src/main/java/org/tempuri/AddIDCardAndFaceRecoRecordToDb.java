
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
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="cardInfo" type="{http://tempuri.org/}IDCardInfo" minOccurs="0"/>
 *         &lt;element name="takeFaceBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dateTime",
    "cardInfo",
    "takeFaceBytes",
    "score"
})
@XmlRootElement(name = "AddIDCardAndFaceRecoRecordToDb")
public class AddIDCardAndFaceRecoRecordToDb {

    protected String token;
    protected int cameraId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    protected IDCardInfo cardInfo;
    protected byte[] takeFaceBytes;
    protected int score;

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
     * ��ȡdateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * ����dateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * ��ȡcardInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link IDCardInfo }
     *     
     */
    public IDCardInfo getCardInfo() {
        return cardInfo;
    }

    /**
     * ����cardInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link IDCardInfo }
     *     
     */
    public void setCardInfo(IDCardInfo value) {
        this.cardInfo = value;
    }

    /**
     * ��ȡtakeFaceBytes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTakeFaceBytes() {
        return takeFaceBytes;
    }

    /**
     * ����takeFaceBytes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTakeFaceBytes(byte[] value) {
        this.takeFaceBytes = value;
    }

    /**
     * ��ȡscore���Ե�ֵ��
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * ����score���Ե�ֵ��
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

}
