
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
 *         &lt;element name="AddRecoFailureRecordToDbResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addRecoFailureRecordToDbResult"
})
@XmlRootElement(name = "AddRecoFailureRecordToDbResponse")
public class AddRecoFailureRecordToDbResponse {

    @XmlElement(name = "AddRecoFailureRecordToDbResult")
    protected boolean addRecoFailureRecordToDbResult;

    /**
     * ��ȡaddRecoFailureRecordToDbResult���Ե�ֵ��
     * 
     */
    public boolean isAddRecoFailureRecordToDbResult() {
        return addRecoFailureRecordToDbResult;
    }

    /**
     * ����addRecoFailureRecordToDbResult���Ե�ֵ��
     * 
     */
    public void setAddRecoFailureRecordToDbResult(boolean value) {
        this.addRecoFailureRecordToDbResult = value;
    }

}
