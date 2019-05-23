
package org.datacontract.schemas._2004._07.ivps;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DrvierType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="DrvierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WebCam"/>
 *     &lt;enumeration value="RTSP"/>
 *     &lt;enumeration value="GNVR"/>
 *     &lt;enumeration value="Hik"/>
 *     &lt;enumeration value="Dahua"/>
 *     &lt;enumeration value="TST"/>
 *     &lt;enumeration value="JF"/>
 *     &lt;enumeration value="HX"/>
 *     &lt;enumeration value="YD"/>
 *     &lt;enumeration value="File"/>
 *     &lt;enumeration value="HKCapture"/>
 *     &lt;enumeration value="VRT"/>
 *     &lt;enumeration value="GenericLiveUrl"/>
 *     &lt;enumeration value="GenericVideoFile"/>
 *     &lt;enumeration value="MutiFiles"/>
 *     &lt;enumeration value="LBD_WebCam"/>
 *     &lt;enumeration value="IRV"/>
 *     &lt;enumeration value="VZ"/>
 *     &lt;enumeration value="AforgeWebCam"/>
 *     &lt;enumeration value="FFMPEG"/>
 *     &lt;enumeration value="DahuaFaceIPC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DrvierType", namespace = "http://schemas.datacontract.org/2004/07/Ivps.Common")
@XmlEnum
public enum DrvierType {

    @XmlEnumValue("WebCam")
    WEB_CAM("WebCam"),
    RTSP("RTSP"),
    GNVR("GNVR"),
    @XmlEnumValue("Hik")
    HIK("Hik"),
    @XmlEnumValue("Dahua")
    DAHUA("Dahua"),
    TST("TST"),
    JF("JF"),
    HX("HX"),
    YD("YD"),
    @XmlEnumValue("File")
    FILE("File"),
    @XmlEnumValue("HKCapture")
    HK_CAPTURE("HKCapture"),
    VRT("VRT"),
    @XmlEnumValue("GenericLiveUrl")
    GENERIC_LIVE_URL("GenericLiveUrl"),
    @XmlEnumValue("GenericVideoFile")
    GENERIC_VIDEO_FILE("GenericVideoFile"),
    @XmlEnumValue("MutiFiles")
    MUTI_FILES("MutiFiles"),
    @XmlEnumValue("LBD_WebCam")
    LBD_WEB_CAM("LBD_WebCam"),
    IRV("IRV"),
    VZ("VZ"),
    @XmlEnumValue("AforgeWebCam")
    AFORGE_WEB_CAM("AforgeWebCam"),
    FFMPEG("FFMPEG"),
    @XmlEnumValue("DahuaFaceIPC")
    DAHUA_FACE_IPC("DahuaFaceIPC");
    private final String value;

    DrvierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DrvierType fromValue(String v) {
        for (DrvierType c: DrvierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
