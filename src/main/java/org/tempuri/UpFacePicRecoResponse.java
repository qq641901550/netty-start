
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
 *         &lt;element name="UpFacePicRecoResult" type="{http://tempuri.org/}ArrayOfUpFacePicRecoResult" minOccurs="0"/>
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
    "upFacePicRecoResult"
})
@XmlRootElement(name = "UpFacePicRecoResponse")
public class UpFacePicRecoResponse {

    @XmlElement(name = "UpFacePicRecoResult")
    protected ArrayOfUpFacePicRecoResult upFacePicRecoResult;

    /**
     * ��ȡupFacePicRecoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpFacePicRecoResult }
     *     
     */
    public ArrayOfUpFacePicRecoResult getUpFacePicRecoResult() {
        return upFacePicRecoResult;
    }

    /**
     * ����upFacePicRecoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpFacePicRecoResult }
     *     
     */
    public void setUpFacePicRecoResult(ArrayOfUpFacePicRecoResult value) {
        this.upFacePicRecoResult = value;
    }

}
