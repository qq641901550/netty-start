
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
 *         &lt;element name="VipPersonLoginResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "vipPersonLoginResult"
})
@XmlRootElement(name = "VipPersonLoginResponse")
public class VipPersonLoginResponse {

    @XmlElement(name = "VipPersonLoginResult")
    protected long vipPersonLoginResult;

    /**
     * ��ȡvipPersonLoginResult���Ե�ֵ��
     * 
     */
    public long getVipPersonLoginResult() {
        return vipPersonLoginResult;
    }

    /**
     * ����vipPersonLoginResult���Ե�ֵ��
     * 
     */
    public void setVipPersonLoginResult(long value) {
        this.vipPersonLoginResult = value;
    }

}
