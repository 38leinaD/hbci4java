
package org.kapott.hbci.sepa.jaxb.pain_008_002_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PaymentIdentification1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentIdentification1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrId" type="{urn:swift:xsd:$pain.008.002.01}RestrictedIdentification1" minOccurs="0"/>
 *         &lt;element name="EndToEndId" type="{urn:swift:xsd:$pain.008.002.01}RestrictedIdentification2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentIdentification1", namespace = "urn:swift:xsd:$pain.008.002.01", propOrder = {
    "instrId",
    "endToEndId"
})
public class PaymentIdentification1 {

    @XmlElement(name = "InstrId", namespace = "urn:swift:xsd:$pain.008.002.01")
    protected String instrId;
    @XmlElement(name = "EndToEndId", namespace = "urn:swift:xsd:$pain.008.002.01", required = true)
    protected String endToEndId;

    /**
     * Ruft den Wert der instrId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Legt den Wert der instrId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Ruft den Wert der endToEndId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Legt den Wert der endToEndId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

}
