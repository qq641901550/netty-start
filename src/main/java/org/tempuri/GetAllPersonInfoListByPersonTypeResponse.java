
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
 *         &lt;element name="GetAllPersonInfoListByPersonTypeResult" type="{http://tempuri.org/}ArrayOfPersonInfo" minOccurs="0"/>
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
    "getAllPersonInfoListByPersonTypeResult"
})
@XmlRootElement(name = "GetAllPersonInfoListByPersonTypeResponse")
public class GetAllPersonInfoListByPersonTypeResponse {

    @XmlElement(name = "GetAllPersonInfoListByPersonTypeResult")
    protected ArrayOfPersonInfo getAllPersonInfoListByPersonTypeResult;

    /**
     * ��ȡgetAllPersonInfoListByPersonTypeResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonInfo }
     *     
     */
    public ArrayOfPersonInfo getGetAllPersonInfoListByPersonTypeResult() {
        return getAllPersonInfoListByPersonTypeResult;
    }

    /**
     * ����getAllPersonInfoListByPersonTypeResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonInfo }
     *     
     */
    public void setGetAllPersonInfoListByPersonTypeResult(ArrayOfPersonInfo value) {
        this.getAllPersonInfoListByPersonTypeResult = value;
    }

}
