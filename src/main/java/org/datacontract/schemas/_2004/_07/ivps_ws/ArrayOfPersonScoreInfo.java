
package org.datacontract.schemas._2004._07.ivps_ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfPersonScoreInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPersonScoreInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonScoreInfo" type="{http://schemas.datacontract.org/2004/07/Ivps.WS.Models}PersonScoreInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPersonScoreInfo", propOrder = {
    "personScoreInfo"
})
public class ArrayOfPersonScoreInfo {

    @XmlElement(name = "PersonScoreInfo", nillable = true)
    protected List<PersonScoreInfo> personScoreInfo;

    /**
     * Gets the value of the personScoreInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personScoreInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonScoreInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonScoreInfo }
     * 
     * 
     */
    public List<PersonScoreInfo> getPersonScoreInfo() {
        if (personScoreInfo == null) {
            personScoreInfo = new ArrayList<PersonScoreInfo>();
        }
        return this.personScoreInfo;
    }

}
