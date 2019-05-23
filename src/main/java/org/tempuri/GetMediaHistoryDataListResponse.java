
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取getMediaHistoryDataListResult属性的值。
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
     * 设置getMediaHistoryDataListResult属性的值。
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
