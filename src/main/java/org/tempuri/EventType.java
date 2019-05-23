
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EventType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="FaceTakePic"/>
 *     &lt;enumeration value="BlacklistPass"/>
 *     &lt;enumeration value="WriteListPass"/>
 *     &lt;enumeration value="VisitorPass"/>
 *     &lt;enumeration value="FaceAndIdentityCardPass"/>
 *     &lt;enumeration value="OnlyIdentityCardPass"/>
 *     &lt;enumeration value="FaceAndIDCardPass"/>
 *     &lt;enumeration value="OnlyIDCardPass"/>
 *     &lt;enumeration value="VehiclePass"/>
 *     &lt;enumeration value="FaceAndIdentityCardMultiplePass"/>
 *     &lt;enumeration value="IllegalPass"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventType")
@XmlEnum
public enum EventType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("FaceTakePic")
    FACE_TAKE_PIC("FaceTakePic"),
    @XmlEnumValue("BlacklistPass")
    BLACKLIST_PASS("BlacklistPass"),
    @XmlEnumValue("WriteListPass")
    WRITE_LIST_PASS("WriteListPass"),
    @XmlEnumValue("VisitorPass")
    VISITOR_PASS("VisitorPass"),
    @XmlEnumValue("FaceAndIdentityCardPass")
    FACE_AND_IDENTITY_CARD_PASS("FaceAndIdentityCardPass"),
    @XmlEnumValue("OnlyIdentityCardPass")
    ONLY_IDENTITY_CARD_PASS("OnlyIdentityCardPass"),
    @XmlEnumValue("FaceAndIDCardPass")
    FACE_AND_ID_CARD_PASS("FaceAndIDCardPass"),
    @XmlEnumValue("OnlyIDCardPass")
    ONLY_ID_CARD_PASS("OnlyIDCardPass"),
    @XmlEnumValue("VehiclePass")
    VEHICLE_PASS("VehiclePass"),
    @XmlEnumValue("FaceAndIdentityCardMultiplePass")
    FACE_AND_IDENTITY_CARD_MULTIPLE_PASS("FaceAndIdentityCardMultiplePass"),
    @XmlEnumValue("IllegalPass")
    ILLEGAL_PASS("IllegalPass");
    private final String value;

    EventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventType fromValue(String v) {
        for (EventType c: EventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
