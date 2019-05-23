
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>PersonCameraData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonCameraData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CameraId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VisitorBeginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="VisitorEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonCameraData", propOrder = {
    "personId",
    "cameraId",
    "visitorBeginTime",
    "visitorEndTime"
})
public class PersonCameraData {

    @XmlElement(name = "PersonId")
    protected long personId;
    @XmlElement(name = "CameraId")
    protected int cameraId;
    @XmlElement(name = "VisitorBeginTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar visitorBeginTime;
    @XmlElement(name = "VisitorEndTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar visitorEndTime;

    /**
     * 获取personId属性的值。
     * 
     */
    public long getPersonId() {
        return personId;
    }

    /**
     * 设置personId属性的值。
     * 
     */
    public void setPersonId(long value) {
        this.personId = value;
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
     * 获取visitorBeginTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisitorBeginTime() {
        return visitorBeginTime;
    }

    /**
     * 设置visitorBeginTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisitorBeginTime(XMLGregorianCalendar value) {
        this.visitorBeginTime = value;
    }

    /**
     * 获取visitorEndTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisitorEndTime() {
        return visitorEndTime;
    }

    /**
     * 设置visitorEndTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisitorEndTime(XMLGregorianCalendar value) {
        this.visitorEndTime = value;
    }

}
