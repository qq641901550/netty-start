
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ivps_ws.ArrayOfCameraInfo;


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
 *         &lt;element name="GetCameraListResult" type="{http://schemas.datacontract.org/2004/07/Ivps.WS.Models}ArrayOfCameraInfo" minOccurs="0"/>
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
    "getCameraListResult"
})
@XmlRootElement(name = "GetCameraListResponse")
public class GetCameraListResponse {

    @XmlElementRef(name = "GetCameraListResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCameraInfo> getCameraListResult;

    /**
     * ��ȡgetCameraListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCameraInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCameraInfo> getGetCameraListResult() {
        return getCameraListResult;
    }

    /**
     * ����getCameraListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCameraInfo }{@code >}
     *     
     */
    public void setGetCameraListResult(JAXBElement<ArrayOfCameraInfo> value) {
        this.getCameraListResult = value;
    }

}
