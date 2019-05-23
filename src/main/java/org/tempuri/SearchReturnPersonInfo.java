
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SearchReturnPersonInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取score属性的值。
     * 
     */
    public int getScore() {
        return score;
    }

    /**
     * 设置score属性的值。
     * 
     */
    public void setScore(int value) {
        this.score = value;
    }

}
