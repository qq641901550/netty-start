
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
 *         &lt;element name="GetPersonFirstFacePicBytesResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "getPersonFirstFacePicBytesResult"
})
@XmlRootElement(name = "GetPersonFirstFacePicBytesResponse")
public class GetPersonFirstFacePicBytesResponse {

    @XmlElement(name = "GetPersonFirstFacePicBytesResult")
    protected byte[] getPersonFirstFacePicBytesResult;

    /**
     * ��ȡgetPersonFirstFacePicBytesResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetPersonFirstFacePicBytesResult() {
        return getPersonFirstFacePicBytesResult;
    }

    /**
     * ����getPersonFirstFacePicBytesResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetPersonFirstFacePicBytesResult(byte[] value) {
        this.getPersonFirstFacePicBytesResult = value;
    }

}
