
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ivps_ws.ArrayOfAlarmInfo;


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
 *         &lt;element name="GetRealAlarmListResult" type="{http://schemas.datacontract.org/2004/07/Ivps.WS.Models}ArrayOfAlarmInfo" minOccurs="0"/>
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
    "getRealAlarmListResult"
})
@XmlRootElement(name = "GetRealAlarmListResponse")
public class GetRealAlarmListResponse {

    @XmlElementRef(name = "GetRealAlarmListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAlarmInfo> getRealAlarmListResult;

    /**
     * ��ȡgetRealAlarmListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlarmInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAlarmInfo> getGetRealAlarmListResult() {
        return getRealAlarmListResult;
    }

    /**
     * ����getRealAlarmListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAlarmInfo }{@code >}
     *     
     */
    public void setGetRealAlarmListResult(JAXBElement<ArrayOfAlarmInfo> value) {
        this.getRealAlarmListResult = value;
    }

}
