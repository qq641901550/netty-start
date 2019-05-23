
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
 *         &lt;element name="GetPersonKeyInfoListByCameraIDResult" type="{http://tempuri.org/}ArrayOfPersonKeyInfo" minOccurs="0"/>
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
    "getPersonKeyInfoListByCameraIDResult"
})
@XmlRootElement(name = "GetPersonKeyInfoListByCameraIDResponse")
public class GetPersonKeyInfoListByCameraIDResponse {

    @XmlElement(name = "GetPersonKeyInfoListByCameraIDResult")
    protected ArrayOfPersonKeyInfo getPersonKeyInfoListByCameraIDResult;

    /**
     * 获取getPersonKeyInfoListByCameraIDResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonKeyInfo }
     *     
     */
    public ArrayOfPersonKeyInfo getGetPersonKeyInfoListByCameraIDResult() {
        return getPersonKeyInfoListByCameraIDResult;
    }

    /**
     * 设置getPersonKeyInfoListByCameraIDResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonKeyInfo }
     *     
     */
    public void setGetPersonKeyInfoListByCameraIDResult(ArrayOfPersonKeyInfo value) {
        this.getPersonKeyInfoListByCameraIDResult = value;
    }

}
