//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.4-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.16 at 04:02:45 PM PST 
//


package cytoscape.generated2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for capstyle.type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="capstyle.type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="butt"/>
 *     &lt;enumeration value="projecting"/>
 *     &lt;enumeration value="round"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum CapstyleType {

    @XmlEnumValue("butt")
    BUTT("butt"),
    @XmlEnumValue("projecting")
    PROJECTING("projecting"),
    @XmlEnumValue("round")
    ROUND("round");
    private final String value;

    CapstyleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CapstyleType fromValue(String v) {
        for (CapstyleType c: CapstyleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
