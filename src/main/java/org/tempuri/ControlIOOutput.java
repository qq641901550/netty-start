
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
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CameraId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cameraId",
    "state"
})
@XmlRootElement(name = "ControlIO_Output")
public class ControlIOOutput {

    protected String token;
    @XmlElement(name = "CameraId")
    protected int cameraId;
    protected int state;

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
     * ��ȡcameraId���Ե�ֵ��
     * 
     */
    public int getCameraId() {
        return cameraId;
    }

    /**
     * ����cameraId���Ե�ֵ��
     * 
     */
    public void setCameraId(int value) {
        this.cameraId = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     */
    public int getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     */
    public void setState(int value) {
        this.state = value;
    }

}
