
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
 *         &lt;element name="CheckPersonHasAuthorizationPolicyAuthResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "checkPersonHasAuthorizationPolicyAuthResult"
})
@XmlRootElement(name = "CheckPersonHasAuthorizationPolicyAuthResponse")
public class CheckPersonHasAuthorizationPolicyAuthResponse {

    @XmlElement(name = "CheckPersonHasAuthorizationPolicyAuthResult")
    protected boolean checkPersonHasAuthorizationPolicyAuthResult;

    /**
     * ��ȡcheckPersonHasAuthorizationPolicyAuthResult���Ե�ֵ��
     * 
     */
    public boolean isCheckPersonHasAuthorizationPolicyAuthResult() {
        return checkPersonHasAuthorizationPolicyAuthResult;
    }

    /**
     * ����checkPersonHasAuthorizationPolicyAuthResult���Ե�ֵ��
     * 
     */
    public void setCheckPersonHasAuthorizationPolicyAuthResult(boolean value) {
        this.checkPersonHasAuthorizationPolicyAuthResult = value;
    }

}
