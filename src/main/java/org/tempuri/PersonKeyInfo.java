
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PersonKeyInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcodeID���Ե�ֵ��
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
     * ����codeID���Ե�ֵ��
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
     * ��ȡidc���Ե�ֵ��
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
     * ����idc���Ե�ֵ��
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
     * ��ȡupdateFlag���Ե�ֵ��
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
     * ����updateFlag���Ե�ֵ��
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
     * ��ȡfaceDbEntityId���Ե�ֵ��
     * 
     */
    public long getFaceDbEntityId() {
        return faceDbEntityId;
    }

    /**
     * ����faceDbEntityId���Ե�ֵ��
     * 
     */
    public void setFaceDbEntityId(long value) {
        this.faceDbEntityId = value;
    }

}
