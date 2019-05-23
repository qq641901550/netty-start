
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>VisitorInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VisitorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Job" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CreatePersonID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VisitorPersonID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExtXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaceJpegBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="CameraIds" type="{http://tempuri.org/}ArrayOfInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisitorInfo", propOrder = {
    "name",
    "idc",
    "job",
    "sex",
    "telephone",
    "beginTime",
    "endTime",
    "createPersonID",
    "visitorPersonID",
    "remark",
    "extXml",
    "faceJpegBytes",
    "cameraIds"
})
public class VisitorInfo {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IDC")
    protected String idc;
    @XmlElement(name = "Job")
    protected String job;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "Telephone")
    protected String telephone;
    @XmlElement(name = "BeginTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginTime;
    @XmlElement(name = "EndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "CreatePersonID")
    protected long createPersonID;
    @XmlElement(name = "VisitorPersonID")
    protected long visitorPersonID;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "ExtXml")
    protected String extXml;
    @XmlElement(name = "FaceJpegBytes")
    protected byte[] faceJpegBytes;
    @XmlElement(name = "CameraIds")
    protected ArrayOfInt cameraIds;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取idc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDC() {
        return idc;
    }

    /**
     * 设置idc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDC(String value) {
        this.idc = value;
    }

    /**
     * 获取job属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJob() {
        return job;
    }

    /**
     * 设置job属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJob(String value) {
        this.job = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * 获取telephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置telephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * 获取beginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginTime() {
        return beginTime;
    }

    /**
     * 设置beginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginTime(XMLGregorianCalendar value) {
        this.beginTime = value;
    }

    /**
     * 获取endTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * 获取createPersonID属性的值。
     * 
     */
    public long getCreatePersonID() {
        return createPersonID;
    }

    /**
     * 设置createPersonID属性的值。
     * 
     */
    public void setCreatePersonID(long value) {
        this.createPersonID = value;
    }

    /**
     * 获取visitorPersonID属性的值。
     * 
     */
    public long getVisitorPersonID() {
        return visitorPersonID;
    }

    /**
     * 设置visitorPersonID属性的值。
     * 
     */
    public void setVisitorPersonID(long value) {
        this.visitorPersonID = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * 获取extXml属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtXml() {
        return extXml;
    }

    /**
     * 设置extXml属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtXml(String value) {
        this.extXml = value;
    }

    /**
     * 获取faceJpegBytes属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFaceJpegBytes() {
        return faceJpegBytes;
    }

    /**
     * 设置faceJpegBytes属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFaceJpegBytes(byte[] value) {
        this.faceJpegBytes = value;
    }

    /**
     * 获取cameraIds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInt }
     *     
     */
    public ArrayOfInt getCameraIds() {
        return cameraIds;
    }

    /**
     * 设置cameraIds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInt }
     *     
     */
    public void setCameraIds(ArrayOfInt value) {
        this.cameraIds = value;
    }

}
