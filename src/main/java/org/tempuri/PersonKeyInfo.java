
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PersonKeyInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonKeyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaceDbEntityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonKeyInfo", propOrder = {
    "codeID",
    "personID",
    "name",
    "sex",
    "idc",
    "updateFlag",
    "faceDbEntityId"
})
public class PersonKeyInfo {

    @XmlElement(name = "CodeID")
    protected String codeID;
    @XmlElement(name = "PersonID")
    protected long personID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "IDC")
    protected String idc;
    @XmlElement(name = "UpdateFlag")
    protected String updateFlag;
    @XmlElement(name = "FaceDbEntityId")
    protected long faceDbEntityId;

    /**
     * 获取codeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeID() {
        return codeID;
    }

    /**
     * 设置codeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeID(String value) {
        this.codeID = value;
    }

    /**
     * 获取personID属性的值。
     * 
     */
    public long getPersonID() {
        return personID;
    }

    /**
     * 设置personID属性的值。
     * 
     */
    public void setPersonID(long value) {
        this.personID = value;
    }

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
     * 获取updateFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateFlag() {
        return updateFlag;
    }

    /**
     * 设置updateFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateFlag(String value) {
        this.updateFlag = value;
    }

    /**
     * 获取faceDbEntityId属性的值。
     * 
     */
    public long getFaceDbEntityId() {
        return faceDbEntityId;
    }

    /**
     * 设置faceDbEntityId属性的值。
     * 
     */
    public void setFaceDbEntityId(long value) {
        this.faceDbEntityId = value;
    }

}
