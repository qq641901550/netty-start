
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
     * ��ȡgetVisitorInfoResult���Ե�ֵ��
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
     * ����getVisitorInfoResult���Ե�ֵ��
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
