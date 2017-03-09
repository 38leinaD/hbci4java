
package org.kapott.hbci.sepa.jaxb.pain_002_003_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OthrIdentificationCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OthrIdentificationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOTPROVIDED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OthrIdentificationCode", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.002.003.03")
@XmlEnum
public enum OthrIdentificationCode {

    NOTPROVIDED;

    public String value() {
        return name();
    }

    public static OthrIdentificationCode fromValue(String v) {
        return valueOf(v);
    }

}
