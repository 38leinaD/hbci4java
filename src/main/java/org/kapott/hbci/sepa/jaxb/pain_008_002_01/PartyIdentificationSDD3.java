
package org.kapott.hbci.sepa.jaxb.pain_008_002_01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PartyIdentificationSDD3 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentificationSDD3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nm" type="{urn:swift:xsd:$pain.008.002.01}Max70Text"/>
 *         &lt;element name="PstlAdr" type="{urn:swift:xsd:$pain.008.002.01}PostalAddressSDD" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:swift:xsd:$pain.008.002.01}PartySDDChoice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationSDD3", namespace = "urn:swift:xsd:$pain.008.002.01", propOrder = {
    "nm",
    "pstlAdr",
    "id"
})
public class PartyIdentificationSDD3 {

    @XmlElement(name = "Nm", namespace = "urn:swift:xsd:$pain.008.002.01", required = true)
    protected String nm;
    @XmlElement(name = "PstlAdr", namespace = "urn:swift:xsd:$pain.008.002.01")
    protected PostalAddressSDD pstlAdr;
    @XmlElement(name = "Id", namespace = "urn:swift:xsd:$pain.008.002.01")
    protected PartySDDChoice id;

    /**
     * Ruft den Wert der nm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Legt den Wert der nm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Ruft den Wert der pstlAdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressSDD }
     *     
     */
    public PostalAddressSDD getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Legt den Wert der pstlAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressSDD }
     *     
     */
    public void setPstlAdr(PostalAddressSDD value) {
        this.pstlAdr = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PartySDDChoice }
     *     
     */
    public PartySDDChoice getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PartySDDChoice }
     *     
     */
    public void setId(PartySDDChoice value) {
        this.id = value;
    }

}
