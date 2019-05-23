
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
 *         &lt;element name="AddPersonInfoResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "addPersonInfoResult"
})
@XmlRootElement(name = "AddPersonInfoResponse")
public class AddPersonInfoResponse {

    @XmlElement(name = "AddPersonInfoResult")
    protected long addPersonInfoResult;

    /**
     * 获取addPersonInfoResult属性的值。
     * 
     */
    public long getAddPersonInfoResult() {
        return addPersonInfoResult;
    }

    /**
     * 设置addPersonInfoResult属性的值。
     * 
     */
    public void setAddPersonInfoResult(long value) {
        this.addPersonInfoResult = value;
    }

}
