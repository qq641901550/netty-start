
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
 *         &lt;element name="SearchPersonExResult" type="{http://tempuri.org/}ArrayOfSearchReturnPersonInfo" minOccurs="0"/>
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
    "searchPersonExResult"
})
@XmlRootElement(name = "SearchPersonExResponse")
public class SearchPersonExResponse {

    @XmlElement(name = "SearchPersonExResult")
    protected ArrayOfSearchReturnPersonInfo searchPersonExResult;

    /**
     * ��ȡsearchPersonExResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchReturnPersonInfo }
     *     
     */
    public ArrayOfSearchReturnPersonInfo getSearchPersonExResult() {
        return searchPersonExResult;
    }

    /**
     * ����searchPersonExResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchReturnPersonInfo }
     *     
     */
    public void setSearchPersonExResult(ArrayOfSearchReturnPersonInfo value) {
        this.searchPersonExResult = value;
    }

}
