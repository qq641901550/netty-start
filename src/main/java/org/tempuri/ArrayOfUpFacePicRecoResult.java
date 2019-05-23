
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfUpFacePicRecoResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUpFacePicRecoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpFacePicRecoResult" type="{http://tempuri.org/}UpFacePicRecoResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUpFacePicRecoResult", propOrder = {
    "upFacePicRecoResult"
})
public class ArrayOfUpFacePicRecoResult {

    @XmlElement(name = "UpFacePicRecoResult", nillable = true)
    protected List<UpFacePicRecoResult> upFacePicRecoResult;

    /**
     * Gets the value of the upFacePicRecoResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upFacePicRecoResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpFacePicRecoResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpFacePicRecoResult }
     * 
     * 
     */
    public List<UpFacePicRecoResult> getUpFacePicRecoResult() {
        if (upFacePicRecoResult == null) {
            upFacePicRecoResult = new ArrayList<UpFacePicRecoResult>();
        }
        return this.upFacePicRecoResult;
    }

}
