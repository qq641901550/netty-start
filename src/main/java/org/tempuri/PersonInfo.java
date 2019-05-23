
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PersonInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡpersonId���Ե�ֵ��
     * 
     */
    public long getPersonId() {
        return personId;
    }

    /**
     * ����personId���Ե�ֵ��
     * 
     */
    public void setPersonId(long value) {
        this.personId = value;
    }

    /**
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡsex���Ե�ֵ��
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
     * ����sex���Ե�ֵ��
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
     * ��ȡidentityCardNo���Ե�ֵ��
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
     * ����identityCardNo���Ե�ֵ��
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
     * ��ȡdept���Ե�ֵ��
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
     * ����dept���Ե�ֵ��
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
     * ��ȡtelephone���Ե�ֵ��
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
     * ����telephone���Ե�ֵ��
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
     * ��ȡremark���Ե�ֵ��
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
     * ����remark���Ե�ֵ��
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
     * ��ȡfaceList���Ե�ֵ��
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
     * ����faceList���Ե�ֵ��
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
     * ��ȡenableCameraList���Ե�ֵ��
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
     * ����enableCameraList���Ե�ֵ��
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
