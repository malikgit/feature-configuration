//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.20 at 05:50:39 PM IST 
//


package com.getusroi.featuremetainfo.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://getusroi.com/internal/FeatureMetaInfoSupporting}EventResources" minOccurs="0"/>
 *         &lt;element ref="{http://getusroi.com/internal/FeatureMetaInfoSupporting}PermaStoreConfigurations" minOccurs="0"/>
 *         &lt;element ref="{http://getusroi.com/internal/FeatureMetaInfoSupporting}DynaStoreConfigurations" minOccurs="0"/>
 *         &lt;element ref="{http://getusroi.com/internal/FeatureMetaInfoSupporting}PolicyConfigurations" minOccurs="0"/>
 *         &lt;element name="FeatureImplementations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FeatureImplementation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FeatureDataContexts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataContexts" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="vendorName" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="vendorVersion" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "eventResources",
    "permaStoreConfigurations",
    "dynaStoreConfigurations",
    "policyConfigurations",
    "featureImplementations",
    "featureDataContexts"
})
public class Feature
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Name", namespace = "", required = true)
    protected String name;
    @XmlElement(name = "EventResources")
    protected EventResources eventResources;
    @XmlElement(name = "PermaStoreConfigurations")
    protected PermaStoreConfigurations permaStoreConfigurations;
    @XmlElement(name = "DynaStoreConfigurations")
    protected DynaStoreConfigurations dynaStoreConfigurations;
    @XmlElement(name = "PolicyConfigurations")
    protected PolicyConfigurations policyConfigurations;
    @XmlElement(name = "FeatureImplementations", namespace = "")
    protected FeatureImplementations featureImplementations;
    @XmlElement(name = "FeatureDataContexts", namespace = "")
    protected FeatureDataContexts featureDataContexts;
    @XmlAttribute(name = "vendorName", required = true)
    protected String vendorName;
    @XmlAttribute(name = "vendorVersion", required = true)
    protected String vendorVersion;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the eventResources property.
     * 
     * @return
     *     possible object is
     *     {@link EventResources }
     *     
     */
    public EventResources getEventResources() {
        return eventResources;
    }

    /**
     * Sets the value of the eventResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventResources }
     *     
     */
    public void setEventResources(EventResources value) {
        this.eventResources = value;
    }

    /**
     * Gets the value of the permaStoreConfigurations property.
     * 
     * @return
     *     possible object is
     *     {@link PermaStoreConfigurations }
     *     
     */
    public PermaStoreConfigurations getPermaStoreConfigurations() {
        return permaStoreConfigurations;
    }

    /**
     * Sets the value of the permaStoreConfigurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermaStoreConfigurations }
     *     
     */
    public void setPermaStoreConfigurations(PermaStoreConfigurations value) {
        this.permaStoreConfigurations = value;
    }

    /**
     * Gets the value of the dynaStoreConfigurations property.
     * 
     * @return
     *     possible object is
     *     {@link DynaStoreConfigurations }
     *     
     */
    public DynaStoreConfigurations getDynaStoreConfigurations() {
        return dynaStoreConfigurations;
    }

    /**
     * Sets the value of the dynaStoreConfigurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynaStoreConfigurations }
     *     
     */
    public void setDynaStoreConfigurations(DynaStoreConfigurations value) {
        this.dynaStoreConfigurations = value;
    }

    /**
     * Gets the value of the policyConfigurations property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyConfigurations }
     *     
     */
    public PolicyConfigurations getPolicyConfigurations() {
        return policyConfigurations;
    }

    /**
     * Sets the value of the policyConfigurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyConfigurations }
     *     
     */
    public void setPolicyConfigurations(PolicyConfigurations value) {
        this.policyConfigurations = value;
    }

    /**
     * Gets the value of the featureImplementations property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureImplementations }
     *     
     */
    public FeatureImplementations getFeatureImplementations() {
        return featureImplementations;
    }

    /**
     * Sets the value of the featureImplementations property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureImplementations }
     *     
     */
    public void setFeatureImplementations(FeatureImplementations value) {
        this.featureImplementations = value;
    }

    /**
     * Gets the value of the featureDataContexts property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureDataContexts }
     *     
     */
    public FeatureDataContexts getFeatureDataContexts() {
        return featureDataContexts;
    }

    /**
     * Sets the value of the featureDataContexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureDataContexts }
     *     
     */
    public void setFeatureDataContexts(FeatureDataContexts value) {
        this.featureDataContexts = value;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * Gets the value of the vendorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorVersion() {
        return vendorVersion;
    }

    /**
     * Sets the value of the vendorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorVersion(String value) {
        this.vendorVersion = value;
    }

}
