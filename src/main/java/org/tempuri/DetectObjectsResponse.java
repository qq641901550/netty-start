
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
 *         &lt;element name="DetectObjectsResult" type="{http://tempuri.org/}ArrayOfObjectDetectInfo" minOccurs="0"/>
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
    "detectObjectsResult"
})
@XmlRootElement(name = "DetectObjectsResponse")
public class DetectObjectsResponse {

    @XmlElement(name = "DetectObjectsResult")
    protected ArrayOfObjectDetectInfo detectObjectsResult;

    /**
     * ��ȡdetectObjectsResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfObjectDetectInfo }
     *     
     */
    public ArrayOfObjectDetectInfo getDetectObjectsResult() {
        return detectObjectsResult;
    }

    /**
     * ����detectObjectsResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfObjectDetectInfo }
     *     
     */
    public void setDetectObjectsResult(ArrayOfObjectDetectInfo value) {
        this.detectObjectsResult = value;
    }

}
