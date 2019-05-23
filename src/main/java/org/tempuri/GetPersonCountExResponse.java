
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
 *         &lt;element name="GetPersonCountExResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getPersonCountExResult"
})
@XmlRootElement(name = "GetPersonCountExResponse")
public class GetPersonCountExResponse {

    @XmlElement(name = "GetPersonCountExResult")
    protected int getPersonCountExResult;

    /**
     * 获取getPersonCountExResult属性的值。
     * 
     */
    public int getGetPersonCountExResult() {
        return getPersonCountExResult;
    }

    /**
     * 设置getPersonCountExResult属性的值。
     * 
     */
    public void setGetPersonCountExResult(int value) {
        this.getPersonCountExResult = value;
    }

}
