
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
 *         &lt;element name="GetPersonCountExResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getPersonCountExResult"
})
@XmlRootElement(name = "GetPersonCountExResponse")
public class GetPersonCountExResponse {

    @XmlElement(name = "GetPersonCountExResult")
    protected int getPersonCountExResult;

    /**
     * ��ȡgetPersonCountExResult���Ե�ֵ��
     * 
     */
    public int getGetPersonCountExResult() {
        return getPersonCountExResult;
    }

    /**
     * ����getPersonCountExResult���Ե�ֵ��
     * 
     */
    public void setGetPersonCountExResult(int value) {
        this.getPersonCountExResult = value;
    }

}
