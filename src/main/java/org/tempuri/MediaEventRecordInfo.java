
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.Serializable;


/**
 * <p>MediaEventRecordInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MediaEventRecordInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TableName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CameraId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PersonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCertificateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonType" type="{http://tempuri.org/}PersonType"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EventTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TakeFacePicJpegFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArchivesFaceJpegFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventType" type="{http://tempuri.org/}EventType"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "MediaEventRecordInfo", propOrder = {
    "tableName",
    "autoID",
    "cameraId",
    "personID",
    "personName",
    "personCertificateID",
    "personType",
    "score",
    "eventTime",
    "takeFacePicJpegFile",
    "archivesFaceJpegFile",
    "eventType",
    "text",
    "xmlExtBody"
})
public class MediaEventRecordInfo{

    @XmlElement(name = "TableName")
    protected String tableName;
    @XmlElement(name = "AutoID")
    protected long autoID;
    @XmlElement(name = "CameraId")
    protected int cameraId;
    @XmlElement(name = "PersonID")
    protected long personID;
    @XmlElement(name = "PersonName")
    protected String personName;
    @XmlElement(name = "PersonCertificateID")
    protected String personCertificateID;
    @XmlElement(name = "PersonType", required = true)
    @XmlSchemaType(name = "string")
    protected PersonType personType;
    @XmlElement(name = "Score")
    protected int score;
    @XmlElement(name = "EventTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventTime;
    @XmlElement(name = "TakeFacePicJpegFile")
    protected String takeFacePicJpegFile;
    @XmlElement(name = "ArchivesFaceJpegFile")
    protected String archivesFaceJpegFile;
    @XmlElement(name = "EventType", required = true)
    @XmlSchemaType(name = "string")
    protected EventType eventType;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "XmlExtBody")
    protected String xmlExtBody;

    /**
     * ��ȡtableName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * ����tableName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * ��ȡautoID���Ե�ֵ��
     * 
     */
    public long getAutoID() {
        return autoID;
    }

    /**
     * ����autoID���Ե�ֵ��
     * 
     */
    public void setAutoID(long value) {
        this.autoID = value;
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
     * ��ȡpersonID���Ե�ֵ��
     * 
     */
    public long getPersonID() {
        return personID;
    }

    /**
     * ����personID���Ե�ֵ��
     * 
     */
    public void setPersonID(long value) {
        this.personID = value;
    }

    /**
     * ��ȡpersonName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * ����personName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * ��ȡpersonCertificateID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCertificateID() {
        return personCertificateID;
    }

    /**
     * ����personCertificateID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCertificateID(String value) {
        this.personCertificateID = value;
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

    /**
     * ��ȡeventTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * ����eventTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * ��ȡtakeFacePicJpegFile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakeFacePicJpegFile() {
        return takeFacePicJpegFile;
    }

    /**
     * ����takeFacePicJpegFile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakeFacePicJpegFile(String value) {
        this.takeFacePicJpegFile = value;
    }

    /**
     * ��ȡarchivesFaceJpegFile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivesFaceJpegFile() {
        return archivesFaceJpegFile;
    }

    /**
     * ����archivesFaceJpegFile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivesFaceJpegFile(String value) {
        this.archivesFaceJpegFile = value;
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
     * ��ȡtext���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * ����text���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * ��ȡxmlExtBody���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlExtBody() {
        return xmlExtBody;
    }

    /**
     * ����xmlExtBody���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlExtBody(String value) {
        this.xmlExtBody = value;
    }

}
