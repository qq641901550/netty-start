
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchReturnPersonInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SearchReturnPersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdentityCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchReturnPersonInfo", propOrder = {
    "personId",
    "identityCardNo",
    "name",
    "score"
})
public class SearchReturnPersonInfo {

    @XmlElement(name = "PersonId")
    protected long personId;
    @XmlElement(name = "IdentityCardNo")
    protected String identityCardNo;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Score")
    protected int score;

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
