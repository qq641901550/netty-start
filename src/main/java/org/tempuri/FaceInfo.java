
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FaceInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FaceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacePicBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="FeatureBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaceInfo", propOrder = {
    "facePicBytes",
    "featureBytes"
})
public class FaceInfo {

    @XmlElement(name = "FacePicBytes")
    protected byte[] facePicBytes;
    @XmlElement(name = "FeatureBytes")
    protected byte[] featureBytes;

    /**
     * 获取facePicBytes属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFacePicBytes() {
        return facePicBytes;
    }

    /**
     * 设置facePicBytes属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFacePicBytes(byte[] value) {
        this.facePicBytes = value;
    }

    /**
     * 获取featureBytes属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFeatureBytes() {
        return featureBytes;
    }

    /**
     * 设置featureBytes属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFeatureBytes(byte[] value) {
        this.featureBytes = value;
    }

}
