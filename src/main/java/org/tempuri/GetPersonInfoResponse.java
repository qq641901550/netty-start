
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
 *         &lt;element name="GetPersonInfoResult" type="{http://tempuri.org/}PersonInfo" minOccurs="0"/>
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
    "getPersonInfoResult"
})
@XmlRootElement(name = "GetPersonInfoResponse")
public class GetPersonInfoResponse {

    @XmlElement(name = "GetPersonInfoResult")
    protected PersonInfo getPersonInfoResult;

    /**
     * 获取getPersonInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonInfo }
     *     
     */
    public PersonInfo getGetPersonInfoResult() {
        return getPersonInfoResult;
    }

    /**
     * 设置getPersonInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfo }
     *     
     */
    public void setGetPersonInfoResult(PersonInfo value) {
        this.getPersonInfoResult = value;
    }

}
