
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faceFeatrueBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="topNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "token",
    "faceFeatrueBytes",
    "topNum"
})
@XmlRootElement(name = "SearchPersonEx")
public class SearchPersonEx {

    protected String token;
    protected byte[] faceFeatrueBytes;
    protected int topNum;

    /**
     * ��ȡtoken���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * ����token���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * ��ȡfaceFeatrueBytes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFaceFeatrueBytes() {
        return faceFeatrueBytes;
    }

    /**
     * ����faceFeatrueBytes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFaceFeatrueBytes(byte[] value) {
        this.faceFeatrueBytes = value;
    }

    /**
     * ��ȡtopNum���Ե�ֵ��
     * 
     */
    public int getTopNum() {
        return topNum;
    }

    /**
     * ����topNum���Ե�ֵ��
     * 
     */
    public void setTopNum(int value) {
        this.topNum = value;
    }

}
