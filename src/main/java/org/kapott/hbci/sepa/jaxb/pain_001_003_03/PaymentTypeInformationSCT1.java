
package org.kapott.hbci.sepa.jaxb.pain_001_003_03;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PaymentTypeInformationSCT1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformationSCT1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.003.03}Priority2Code" minOccurs="0"/>
 *         &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.003.03}ServiceLevelSEPA"/>
 *         &lt;element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:pain.001.003.03}CategoryPurposeSEPA" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformationSCT1", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.003.03", propOrder = {
    "instrPrty",
    "svcLvl",
    "ctgyPurp"
})
public class PaymentTypeInformationSCT1 {

    @XmlElement(name = "InstrPrty", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.003.03")
    @XmlSchemaType(name = "string")
    protected Priority2Code instrPrty;
    @XmlElement(name = "SvcLvl", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.003.03", required = true)
    protected ServiceLevelSEPA svcLvl;
    @XmlElement(name = "CtgyPurp", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.003.03")
    protected CategoryPurposeSEPA ctgyPurp;

    /**
     * Ruft den Wert der instrPrty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Legt den Wert der instrPrty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
    }

    /**
     * Ruft den Wert der svcLvl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevelSEPA }
     *     
     */
    public ServiceLevelSEPA getSvcLvl() {
        return svcLvl;
    }

    /**
     * Legt den Wert der svcLvl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevelSEPA }
     *     
     */
    public void setSvcLvl(ServiceLevelSEPA value) {
        this.svcLvl = value;
    }

    /**
     * Ruft den Wert der ctgyPurp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CategoryPurposeSEPA }
     *     
     */
    public CategoryPurposeSEPA getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Legt den Wert der ctgyPurp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryPurposeSEPA }
     *     
     */
    public void setCtgyPurp(CategoryPurposeSEPA value) {
        this.ctgyPurp = value;
    }

}
