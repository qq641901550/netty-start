
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
 *         &lt;element name="SearchPersonExResult" type="{http://tempuri.org/}ArrayOfSearchReturnPersonInfo" minOccurs="0"/>
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
    "searchPersonExResult"
})
@XmlRootElement(name = "SearchPersonExResponse")
public class SearchPersonExResponse {

    @XmlElement(name = "SearchPersonExResult")
    protected ArrayOfSearchReturnPersonInfo searchPersonExResult;

    /**
     * 获取searchPersonExResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchReturnPersonInfo }
     *     
     */
    public ArrayOfSearchReturnPersonInfo getSearchPersonExResult() {
        return searchPersonExResult;
    }

    /**
     * 设置searchPersonExResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchReturnPersonInfo }
     *     
     */
    public void setSearchPersonExResult(ArrayOfSearchReturnPersonInfo value) {
        this.searchPersonExResult = value;
    }

}
