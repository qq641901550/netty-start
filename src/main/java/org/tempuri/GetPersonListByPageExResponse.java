
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
 *         &lt;element name="GetPersonListByPageExResult" type="{http://tempuri.org/}ArrayOfPersonInfo" minOccurs="0"/>
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
    "getPersonListByPageExResult"
})
@XmlRootElement(name = "GetPersonListByPageExResponse")
public class GetPersonListByPageExResponse {

    @XmlElement(name = "GetPersonListByPageExResult")
    protected ArrayOfPersonInfo getPersonListByPageExResult;

    /**
     * 获取getPersonListByPageExResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonInfo }
     *     
     */
    public ArrayOfPersonInfo getGetPersonListByPageExResult() {
        return getPersonListByPageExResult;
    }

    /**
     * 设置getPersonListByPageExResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonInfo }
     *     
     */
    public void setGetPersonListByPageExResult(ArrayOfPersonInfo value) {
        this.getPersonListByPageExResult = value;
    }

}
