
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
 *         &lt;element name="GetGlobalPersonLastUpdateFlagResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getGlobalPersonLastUpdateFlagResult"
})
@XmlRootElement(name = "GetGlobalPersonLastUpdateFlagResponse")
public class GetGlobalPersonLastUpdateFlagResponse {

    @XmlElement(name = "GetGlobalPersonLastUpdateFlagResult")
    protected String getGlobalPersonLastUpdateFlagResult;

    /**
     * ��ȡgetGlobalPersonLastUpdateFlagResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetGlobalPersonLastUpdateFlagResult() {
        return getGlobalPersonLastUpdateFlagResult;
    }

    /**
     * ����getGlobalPersonLastUpdateFlagResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetGlobalPersonLastUpdateFlagResult(String value) {
        this.getGlobalPersonLastUpdateFlagResult = value;
    }

}
