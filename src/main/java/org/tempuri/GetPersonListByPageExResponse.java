
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
     * ��ȡgetPersonListByPageExResult���Ե�ֵ��
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
     * ����getPersonListByPageExResult���Ե�ֵ��
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
