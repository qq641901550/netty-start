
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
 *         &lt;element name="GetPersonListByPageResult" type="{http://tempuri.org/}ArrayOfPersonInfo" minOccurs="0"/>
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
    "getPersonListByPageResult"
})
@XmlRootElement(name = "GetPersonListByPageResponse")
public class GetPersonListByPageResponse {

    @XmlElement(name = "GetPersonListByPageResult")
    protected ArrayOfPersonInfo getPersonListByPageResult;

    /**
     * ��ȡgetPersonListByPageResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonInfo }
     *     
     */
    public ArrayOfPersonInfo getGetPersonListByPageResult() {
        return getPersonListByPageResult;
    }

    /**
     * ����getPersonListByPageResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonInfo }
     *     
     */
    public void setGetPersonListByPageResult(ArrayOfPersonInfo value) {
        this.getPersonListByPageResult = value;
    }

}
