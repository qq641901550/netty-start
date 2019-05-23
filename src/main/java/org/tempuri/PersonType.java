
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PersonType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PersonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Vip"/>
 *     &lt;enumeration value="Alarm"/>
 *     &lt;enumeration value="Vistor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonType")
@XmlEnum
public enum PersonType {

    @XmlEnumValue("Vip")
    VIP("Vip"),
    @XmlEnumValue("Alarm")
    ALARM("Alarm"),
    @XmlEnumValue("Vistor")
    VISTOR("Vistor");
    private final String value;

    PersonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonType fromValue(String v) {
        for (PersonType c: PersonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
