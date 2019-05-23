
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
 *         &lt;element name="GetVisitorInfoResult" type="{http://tempuri.org/}VisitorInfo" minOccurs="0"/>
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
    "getVisitorInfoResult"
})
@XmlRootElement(name = "GetVisitorInfoResponse")
public class GetVisitorInfoResponse {

    @XmlElement(name = "GetVisitorInfoResult")
    protected VisitorInfo getVisitorInfoResult;

    /**
     * 获取getVisitorInfoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VisitorInfo }
     *     
     */
    public VisitorInfo getGetVisitorInfoResult() {
        return getVisitorInfoResult;
    }

    /**
     * 设置getVisitorInfoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VisitorInfo }
     *     
     */
    public void setGetVisitorInfoResult(VisitorInfo value) {
        this.getVisitorInfoResult = value;
    }

}
