
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
 *         &lt;element name="GetMediaHistoryDataListExResult" type="{http://tempuri.org/}ArrayOfMediaEventRecordInfo" minOccurs="0"/>
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
    "getMediaHistoryDataListExResult"
})
@XmlRootElement(name = "GetMediaHistoryDataListExResponse")
public class GetMediaHistoryDataListExResponse {

    @XmlElement(name = "GetMediaHistoryDataListExResult")
    protected ArrayOfMediaEventRecordInfo getMediaHistoryDataListExResult;

    /**
     * ��ȡgetMediaHistoryDataListExResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMediaEventRecordInfo }
     *     
     */
    public ArrayOfMediaEventRecordInfo getGetMediaHistoryDataListExResult() {
        return getMediaHistoryDataListExResult;
    }

    /**
     * ����getMediaHistoryDataListExResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMediaEventRecordInfo }
     *     
     */
    public void setGetMediaHistoryDataListExResult(ArrayOfMediaEventRecordInfo value) {
        this.getMediaHistoryDataListExResult = value;
    }

}
