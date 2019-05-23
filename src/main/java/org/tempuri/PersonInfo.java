
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PersonInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentityCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dept" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonType" type="{http://tempuri.org/}PersonType"/>
 *         &lt;element name="FaceList" type="{http://tempuri.org/}ArrayOfFaceInfo" minOccurs="0"/>
 *         &lt;element name="EnableCameraList" type="{http://tempuri.org/}ArrayOfPersonCameraData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInfo", propOrder = {
    "personId",
    "name",
    "sex",
    "identityCardNo",
    "dept",
    "telephone",
    "remark",
    "personType",
    "faceList",
    "enableCameraList"
})
public class PersonInfo {

    @XmlElement(name = "PersonId")
    protected long personId;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "IdentityCardNo")
    protected String identityCardNo;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "Telephone")
    protected String telephone;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "PersonType", required = true)
    @XmlSchemaType(name = "string")
    protected PersonType personType;
    @XmlElement(name = "FaceList")
    protected ArrayOfFaceInfo faceList;
    @XmlElement(name = "EnableCameraList")
    protected ArrayOfPersonCameraData enableCameraList;

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
     * 获取identityCardNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityCardNo() {
        return identityCardNo;
    }

    /**
     * 设置identityCardNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityCardNo(String value) {
        this.identityCardNo = value;
    }

    /**
     * 获取dept属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * 设置dept属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
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
     * 获取personType属性的值。
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
     * 设置personType属性的值。
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
     * 获取faceList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFaceInfo }
     *     
     */
    public ArrayOfFaceInfo getFaceList() {
        return faceList;
    }

    /**
     * 设置faceList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFaceInfo }
     *     
     */
    public void setFaceList(ArrayOfFaceInfo value) {
        this.faceList = value;
    }

    /**
     * 获取enableCameraList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonCameraData }
     *     
     */
    public ArrayOfPersonCameraData getEnableCameraList() {
        return enableCameraList;
    }

    /**
     * 设置enableCameraList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonCameraData }
     *     
     */
    public void setEnableCameraList(ArrayOfPersonCameraData value) {
        this.enableCameraList = value;
    }

}
