
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
 *         &lt;element name="RemoveVisitorPersonInfoResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "removeVisitorPersonInfoResult"
})
@XmlRootElement(name = "RemoveVisitorPersonInfoResponse")
public class RemoveVisitorPersonInfoResponse {

    @XmlElement(name = "RemoveVisitorPersonInfoResult")
    protected boolean removeVisitorPersonInfoResult;

    /**
     * ��ȡremoveVisitorPersonInfoResult���Ե�ֵ��
     * 
     */
    public boolean isRemoveVisitorPersonInfoResult() {
        return removeVisitorPersonInfoResult;
    }

    /**
     * ����removeVisitorPersonInfoResult���Ե�ֵ��
     * 
     */
    public void setRemoveVisitorPersonInfoResult(boolean value) {
        this.removeVisitorPersonInfoResult = value;
    }

}
