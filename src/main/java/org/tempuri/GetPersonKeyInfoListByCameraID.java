
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
 *         &lt;element name="cameraId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "cameraId"
})
@XmlRootElement(name = "GetPersonKeyInfoListByCameraID")
public class GetPersonKeyInfoListByCameraID {

    protected int cameraId;

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

}
