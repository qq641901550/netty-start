
package org.datacontract.schemas._2004._07.ivps;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AlarmType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="AlarmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Blacklist"/>
 *     &lt;enumeration value="IllegalWorkers"/>
 *     &lt;enumeration value="FaceDetectAlarm"/>
 *     &lt;enumeration value="WhiteList"/>
 *     &lt;enumeration value="VehicleDetectAlarm"/>
 *     &lt;enumeration value="VehicleBlacklist"/>
 *     &lt;enumeration value="FaceMultiplePassAlarm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlarmType", namespace = "http://schemas.datacontract.org/2004/07/Ivps.Common")
@XmlEnum
public enum AlarmType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Blacklist")
    BLACKLIST("Blacklist"),
    @XmlEnumValue("IllegalWorkers")
    ILLEGAL_WORKERS("IllegalWorkers"),
    @XmlEnumValue("FaceDetectAlarm")
    FACE_DETECT_ALARM("FaceDetectAlarm"),
    @XmlEnumValue("WhiteList")
    WHITE_LIST("WhiteList"),
    @XmlEnumValue("VehicleDetectAlarm")
    VEHICLE_DETECT_ALARM("VehicleDetectAlarm"),
    @XmlEnumValue("VehicleBlacklist")
    VEHICLE_BLACKLIST("VehicleBlacklist"),
    @XmlEnumValue("FaceMultiplePassAlarm")
    FACE_MULTIPLE_PASS_ALARM("FaceMultiplePassAlarm");
    private final String value;

    AlarmType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlarmType fromValue(String v) {
        for (AlarmType c: AlarmType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
