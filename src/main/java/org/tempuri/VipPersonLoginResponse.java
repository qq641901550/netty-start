
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
     * 获取vipPersonLoginResult属性的值。
     * 
     */
    public long getVipPersonLoginResult() {
        return vipPersonLoginResult;
    }

    /**
     * 设置vipPersonLoginResult属性的值。
     * 
     */
    public void setVipPersonLoginResult(long value) {
        this.vipPersonLoginResult = value;
    }

}
