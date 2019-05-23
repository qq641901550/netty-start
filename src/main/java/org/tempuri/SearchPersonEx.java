
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faceFeatrueBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="topNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "faceFeatrueBytes",
    "topNum"
})
@XmlRootElement(name = "SearchPersonEx")
public class SearchPersonEx {

    protected String token;
    protected byte[] faceFeatrueBytes;
    protected int topNum;

    /**
     * 获取token属性的值。
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
     * 设置token属性的值。
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
     * 获取faceFeatrueBytes属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFaceFeatrueBytes() {
        return faceFeatrueBytes;
    }

    /**
     * 设置faceFeatrueBytes属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFaceFeatrueBytes(byte[] value) {
        this.faceFeatrueBytes = value;
    }

    /**
     * 获取topNum属性的值。
     * 
     */
    public int getTopNum() {
        return topNum;
    }

    /**
     * 设置topNum属性的值。
     * 
     */
    public void setTopNum(int value) {
        this.topNum = value;
    }

}
