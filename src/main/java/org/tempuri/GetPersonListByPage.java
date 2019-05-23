
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="personType" type="{http://tempuri.org/}PersonType"/>
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "personType",
    "keyword",
    "pageSize",
    "pageIndex"
})
@XmlRootElement(name = "GetPersonListByPage")
public class GetPersonListByPage {

    protected String token;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PersonType personType;
    protected String keyword;
    @XmlElement(name = "PageSize")
    protected int pageSize;
    @XmlElement(name = "PageIndex")
    protected int pageIndex;

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

    /**
     * ��ȡpageSize���Ե�ֵ��
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * ����pageSize���Ե�ֵ��
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * ��ȡpageIndex���Ե�ֵ��
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * ����pageIndex���Ե�ֵ��
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

}
