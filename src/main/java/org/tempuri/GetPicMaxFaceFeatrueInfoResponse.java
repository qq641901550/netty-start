
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
 *         &lt;element name="GetPicMaxFaceFeatrueInfoResult" type="{http://tempuri.org/}FaceInfo" minOccurs="0"/>
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
    "getPicMaxFaceFeatrueInfoResult"
})
@XmlRootElement(name = "GetPicMaxFaceFeatrueInfoResponse")
public class GetPicMaxFaceFeatrueInfoResponse {

    @XmlElement(name = "GetPicMaxFaceFeatrueInfoResult")
    protected FaceInfo getPicMaxFaceFeatrueInfoResult;

    /**
     * ��ȡgetPicMaxFaceFeatrueInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FaceInfo }
     *     
     */
    public FaceInfo getGetPicMaxFaceFeatrueInfoResult() {
        return getPicMaxFaceFeatrueInfoResult;
    }

    /**
     * ����getPicMaxFaceFeatrueInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FaceInfo }
     *     
     */
    public void setGetPicMaxFaceFeatrueInfoResult(FaceInfo value) {
        this.getPicMaxFaceFeatrueInfoResult = value;
    }

}
