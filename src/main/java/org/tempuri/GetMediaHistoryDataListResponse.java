
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
 *         &lt;element name="GetMediaHistoryDataListResult" type="{http://tempuri.org/}ArrayOfMediaEventRecordInfo" minOccurs="0"/>
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
    "getMediaHistoryDataListResult"
})
@XmlRootElement(name = "GetMediaHistoryDataListResponse")
public class GetMediaHistoryDataListResponse {

    @XmlElement(name = "GetMediaHistoryDataListResult")
    protected ArrayOfMediaEventRecordInfo getMediaHistoryDataListResult;

    /**
     * ��ȡgetMediaHistoryDataListResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMediaEventRecordInfo }
     *     
     */
    public ArrayOfMediaEventRecordInfo getGetMediaHistoryDataListResult() {
        return getMediaHistoryDataListResult;
    }

    /**
     * ����getMediaHistoryDataListResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMediaEventRecordInfo }
     *     
     */
    public void setGetMediaHistoryDataListResult(ArrayOfMediaEventRecordInfo value) {
        this.getMediaHistoryDataListResult = value;
    }

}
