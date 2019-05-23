
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
 *         &lt;element name="UpFacePicRecoResult" type="{http://tempuri.org/}ArrayOfUpFacePicRecoResult" minOccurs="0"/>
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
    "upFacePicRecoResult"
})
@XmlRootElement(name = "UpFacePicRecoResponse")
public class UpFacePicRecoResponse {

    @XmlElement(name = "UpFacePicRecoResult")
    protected ArrayOfUpFacePicRecoResult upFacePicRecoResult;

    /**
     * 获取upFacePicRecoResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUpFacePicRecoResult }
     *     
     */
    public ArrayOfUpFacePicRecoResult getUpFacePicRecoResult() {
        return upFacePicRecoResult;
    }

    /**
     * 设置upFacePicRecoResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUpFacePicRecoResult }
     *     
     */
    public void setUpFacePicRecoResult(ArrayOfUpFacePicRecoResult value) {
        this.upFacePicRecoResult = value;
    }

}
