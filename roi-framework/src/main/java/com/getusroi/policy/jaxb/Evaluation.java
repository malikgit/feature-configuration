//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.12 at 01:54:48 PM IST 
//


package com.getusroi.policy.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="expression" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="expValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="evaluateExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="evalDialect" use="required" type="{}eval" />
 *       &lt;attribute name="salience" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "expression",
    "evaluateExp"
})
public class Evaluation
    implements Serializable
{

    @XmlElement(required = true)
    protected List<Expression> expression;
    @XmlElement(required = true)
    protected String evaluateExp;
    @XmlAttribute(name = "evalDialect", required = true)
    protected Eval evalDialect;
    @XmlAttribute(name = "salience", required = true)
    protected int salience;

    /**
     * Gets the value of the expression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Expression }
     * 
     * 
     */
    public List<Expression> getExpression() {
        if (expression == null) {
            expression = new ArrayList<Expression>();
        }
        return this.expression;
    }

    /**
     * Gets the value of the evaluateExp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluateExp() {
        return evaluateExp;
    }

    /**
     * Sets the value of the evaluateExp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluateExp(String value) {
        this.evaluateExp = value;
    }

    /**
     * Gets the value of the evalDialect property.
     * 
     * @return
     *     possible object is
     *     {@link Eval }
     *     
     */
    public Eval getEvalDialect() {
        return evalDialect;
    }

    /**
     * Sets the value of the evalDialect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eval }
     *     
     */
    public void setEvalDialect(Eval value) {
        this.evalDialect = value;
    }

    /**
     * Gets the value of the salience property.
     * 
     */
    public int getSalience() {
        return salience;
    }

    /**
     * Sets the value of the salience property.
     * 
     */
    public void setSalience(int value) {
        this.salience = value;
    }

}
