
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="SearchPersonResult" type="{http://tempuri.org/}ArrayOfSearchReturnPersonInfo" minOccurs="0"/>
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
    "searchPersonResult"
})
@XmlRootElement(name = "SearchPersonResponse")
public class SearchPersonResponse {

    @XmlElement(name = "SearchPersonResult")
    protected ArrayOfSearchReturnPersonInfo searchPersonResult;

    /**
     * 获取searchPersonResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchReturnPersonInfo }
     *     
     */
    public ArrayOfSearchReturnPersonInfo getSearchPersonResult() {
        return searchPersonResult;
    }

    /**
     * 设置searchPersonResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchReturnPersonInfo }
     *     
     */
    public void setSearchPersonResult(ArrayOfSearchReturnPersonInfo value) {
        this.searchPersonResult = value;
    }

}
