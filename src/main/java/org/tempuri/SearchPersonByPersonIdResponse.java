
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
 *         &lt;element name="SearchPersonByPersonIdResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "searchPersonByPersonIdResult"
})
@XmlRootElement(name = "SearchPersonByPersonIdResponse")
public class SearchPersonByPersonIdResponse {

    @XmlElement(name = "SearchPersonByPersonIdResult")
    protected int searchPersonByPersonIdResult;

    /**
     * ��ȡsearchPersonByPersonIdResult���Ե�ֵ��
     * 
     */
    public int getSearchPersonByPersonIdResult() {
        return searchPersonByPersonIdResult;
    }

    /**
     * ����searchPersonByPersonIdResult���Ե�ֵ��
     * 
     */
    public void setSearchPersonByPersonIdResult(int value) {
        this.searchPersonByPersonIdResult = value;
    }

}
