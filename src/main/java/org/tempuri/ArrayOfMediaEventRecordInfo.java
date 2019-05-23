
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfMediaEventRecordInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMediaEventRecordInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaEventRecordInfo" type="{http://tempuri.org/}MediaEventRecordInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMediaEventRecordInfo", propOrder = {
    "mediaEventRecordInfo"
})
public class ArrayOfMediaEventRecordInfo {

    @XmlElement(name = "MediaEventRecordInfo", nillable = true)
    protected List<MediaEventRecordInfo> mediaEventRecordInfo;

    /**
     * Gets the value of the mediaEventRecordInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaEventRecordInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaEventRecordInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaEventRecordInfo }
     * 
     * 
     */
    public List<MediaEventRecordInfo> getMediaEventRecordInfo() {
        if (mediaEventRecordInfo == null) {
            mediaEventRecordInfo = new ArrayList<MediaEventRecordInfo>();
        }
        return this.mediaEventRecordInfo;
    }

}
