
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
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isDescOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cameraId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="begin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="eventType" type="{http://tempuri.org/}EventType"/>
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "year",
    "month",
    "day",
    "isDescOrder",
    "cameraId",
    "begin",
    "end",
    "eventType",
    "keyword"
})
@XmlRootElement(name = "GetMediaHistoryDataCount")
public class GetMediaHistoryDataCount {

    protected String token;
    protected int year;
    protected int month;
    protected int day;
    protected boolean isDescOrder;
    protected int cameraId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar begin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EventType eventType;
    protected String keyword;

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
     * ��ȡyear���Ե�ֵ��
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * ����year���Ե�ֵ��
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * ��ȡmonth���Ե�ֵ��
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * ����month���Ե�ֵ��
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * ��ȡday���Ե�ֵ��
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * ����day���Ե�ֵ��
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * ��ȡisDescOrder���Ե�ֵ��
     * 
     */
    public boolean isIsDescOrder() {
        return isDescOrder;
    }

    /**
     * ����isDescOrder���Ե�ֵ��
     * 
     */
    public void setIsDescOrder(boolean value) {
        this.isDescOrder = value;
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
     * ��ȡbegin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBegin() {
        return begin;
    }

    /**
     * ����begin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBegin(XMLGregorianCalendar value) {
        this.begin = value;
    }

    /**
     * ��ȡend���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnd() {
        return end;
    }

    /**
     * ����end���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnd(XMLGregorianCalendar value) {
        this.end = value;
    }

    /**
     * ��ȡeventType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getEventType() {
        return eventType;
    }

    /**
     * ����eventType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setEventType(EventType value) {
        this.eventType = value;
    }

    /**
     * ��ȡkeyword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * ����keyword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

}
