//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.12 at 01:54:48 PM IST 
//


package com.getusroi.policy.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="policyDefinedFact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="factDescription">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="factAttribute" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="factMapping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" type="{}policyResponseType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policyDefinedFact",
    "factMapping"
})
public class PolicyResponse
    implements Serializable
{

    protected PolicyDefinedFact policyDefinedFact;
    protected String factMapping;
    @XmlAttribute(name = "type")
    protected PolicyResponseType type;

    /**
     * Gets the value of the policyDefinedFact property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyDefinedFact }
     *     
     */
    public PolicyDefinedFact getPolicyDefinedFact() {
        return policyDefinedFact;
    }

    /**
     * Sets the value of the policyDefinedFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyDefinedFact }
     *     
     */
    public void setPolicyDefinedFact(PolicyDefinedFact value) {
        this.policyDefinedFact = value;
    }

    /**
     * Gets the value of the factMapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactMapping() {
        return factMapping;
    }

    /**
     * Sets the value of the factMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactMapping(String value) {
        this.factMapping = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyResponseType }
     *     
     */
    public PolicyResponseType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyResponseType }
     *     
     */
    public void setType(PolicyResponseType value) {
        this.type = value;
    }

}
