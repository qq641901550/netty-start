
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
 *         &lt;element name="AddPersonInfoExResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "addPersonInfoExResult"
})
@XmlRootElement(name = "AddPersonInfoExResponse")
public class AddPersonInfoExResponse {

    @XmlElement(name = "AddPersonInfoExResult")
    protected long addPersonInfoExResult;

    /**
     * 获取addPersonInfoExResult属性的值。
     * 
     */
    public long getAddPersonInfoExResult() {
        return addPersonInfoExResult;
    }

    /**
     * 设置addPersonInfoExResult属性的值。
     * 
     */
    public void setAddPersonInfoExResult(long value) {
        this.addPersonInfoExResult = value;
    }

}
