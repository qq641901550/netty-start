
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="GetDoorActionCodeResult" type="{http://tempuri.org/}OpenDoorMode"/>
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
    "getDoorActionCodeResult"
})
@XmlRootElement(name = "GetDoorActionCodeResponse")
public class GetDoorActionCodeResponse {

    @XmlElement(name = "GetDoorActionCodeResult", required = true)
    @XmlSchemaType(name = "string")
    protected OpenDoorMode getDoorActionCodeResult;

    /**
     * 获取getDoorActionCodeResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OpenDoorMode }
     *     
     */
    public OpenDoorMode getGetDoorActionCodeResult() {
        return getDoorActionCodeResult;
    }

    /**
     * 设置getDoorActionCodeResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OpenDoorMode }
     *     
     */
    public void setGetDoorActionCodeResult(OpenDoorMode value) {
        this.getDoorActionCodeResult = value;
    }

}
