
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
 *         &lt;element name="AddIDCardAndFaceRecoRecordToDbResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "addIDCardAndFaceRecoRecordToDbResult"
})
@XmlRootElement(name = "AddIDCardAndFaceRecoRecordToDbResponse")
public class AddIDCardAndFaceRecoRecordToDbResponse {

    @XmlElement(name = "AddIDCardAndFaceRecoRecordToDbResult")
    protected boolean addIDCardAndFaceRecoRecordToDbResult;

    /**
     * ��ȡaddIDCardAndFaceRecoRecordToDbResult���Ե�ֵ��
     * 
     */
    public boolean isAddIDCardAndFaceRecoRecordToDbResult() {
        return addIDCardAndFaceRecoRecordToDbResult;
    }

    /**
     * ����addIDCardAndFaceRecoRecordToDbResult���Ե�ֵ��
     * 
     */
    public void setAddIDCardAndFaceRecoRecordToDbResult(boolean value) {
        this.addIDCardAndFaceRecoRecordToDbResult = value;
    }

}