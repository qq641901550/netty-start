
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="jpegFrameBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="detectServerIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detectPort" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "jpegFrameBytes",
    "detectServerIp",
    "detectPort"
})
@XmlRootElement(name = "DetectObjects")
public class DetectObjects {

    protected byte[] jpegFrameBytes;
    protected String detectServerIp;
    protected int detectPort;

    /**
     * 获取jpegFrameBytes属性的值。
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getJpegFrameBytes() {
        return jpegFrameBytes;
    }

    /**
     * 设置jpegFrameBytes属性的值。
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setJpegFrameBytes(byte[] value) {
        this.jpegFrameBytes = value;
    }

    /**
     * 获取detectServerIp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectServerIp() {
        return detectServerIp;
    }

    /**
     * 设置detectServerIp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectServerIp(String value) {
        this.detectServerIp = value;
    }

    /**
     * 获取detectPort属性的值。
     * 
     */
    public int getDetectPort() {
        return detectPort;
    }

    /**
     * 设置detectPort属性的值。
     * 
     */
    public void setDetectPort(int value) {
        this.detectPort = value;
    }

}
