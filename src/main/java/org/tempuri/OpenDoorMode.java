
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OpenDoorMode的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="OpenDoorMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="KeepOpenDoor"/>
 *     &lt;enumeration value="KeeyCloseDoor"/>
 *     &lt;enumeration value="FaceRecoOpenDoor"/>
 *     &lt;enumeration value="FaceDetectOpenDoor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpenDoorMode")
@XmlEnum
public enum OpenDoorMode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("KeepOpenDoor")
    KEEP_OPEN_DOOR("KeepOpenDoor"),
    @XmlEnumValue("KeeyCloseDoor")
    KEEY_CLOSE_DOOR("KeeyCloseDoor"),
    @XmlEnumValue("FaceRecoOpenDoor")
    FACE_RECO_OPEN_DOOR("FaceRecoOpenDoor"),
    @XmlEnumValue("FaceDetectOpenDoor")
    FACE_DETECT_OPEN_DOOR("FaceDetectOpenDoor");
    private final String value;

    OpenDoorMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenDoorMode fromValue(String v) {
        for (OpenDoorMode c: OpenDoorMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
