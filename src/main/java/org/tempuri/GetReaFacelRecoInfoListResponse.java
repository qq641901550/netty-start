
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ivps_ws.ArrayOfReaFacelRecoInfo;


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
 *         &lt;element name="GetReaFacelRecoInfoListResult" type="{http://schemas.datacontract.org/2004/07/Ivps.WS.Models}ArrayOfReaFacelRecoInfo" minOccurs="0"/>
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
    "getReaFacelRecoInfoListResult"
})
@XmlRootElement(name = "GetReaFacelRecoInfoListResponse")
public class GetReaFacelRecoInfoListResponse {

    @XmlElementRef(name = "GetReaFacelRecoInfoListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReaFacelRecoInfo> getReaFacelRecoInfoListResult;

    /**
     * ��ȡgetReaFacelRecoInfoListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReaFacelRecoInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReaFacelRecoInfo> getGetReaFacelRecoInfoListResult() {
        return getReaFacelRecoInfoListResult;
    }

    /**
     * ����getReaFacelRecoInfoListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReaFacelRecoInfo }{@code >}
     *     
     */
    public void setGetReaFacelRecoInfoListResult(JAXBElement<ArrayOfReaFacelRecoInfo> value) {
        this.getReaFacelRecoInfoListResult = value;
    }

}
