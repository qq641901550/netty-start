
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
 *         &lt;element name="GetVisitorInfoListByCreateVipPersonIDResult" type="{http://tempuri.org/}ArrayOfVisitorInfo" minOccurs="0"/>
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
    "getVisitorInfoListByCreateVipPersonIDResult"
})
@XmlRootElement(name = "GetVisitorInfoListByCreateVipPersonIDResponse")
public class GetVisitorInfoListByCreateVipPersonIDResponse {

    @XmlElement(name = "GetVisitorInfoListByCreateVipPersonIDResult")
    protected ArrayOfVisitorInfo getVisitorInfoListByCreateVipPersonIDResult;

    /**
     * ��ȡgetVisitorInfoListByCreateVipPersonIDResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVisitorInfo }
     *     
     */
    public ArrayOfVisitorInfo getGetVisitorInfoListByCreateVipPersonIDResult() {
        return getVisitorInfoListByCreateVipPersonIDResult;
    }

    /**
     * ����getVisitorInfoListByCreateVipPersonIDResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVisitorInfo }
     *     
     */
    public void setGetVisitorInfoListByCreateVipPersonIDResult(ArrayOfVisitorInfo value) {
        this.getVisitorInfoListByCreateVipPersonIDResult = value;
    }

}
