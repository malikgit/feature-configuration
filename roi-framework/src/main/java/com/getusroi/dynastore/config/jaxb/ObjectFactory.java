//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 12:39:14 PM IST 
//

package com.getusroi.dynastore.config.jaxb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.getusroi.dynastore.jaxb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.getusroi.dynastore.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DynastoreConfigurations }
     * 
     */
    public DynastoreConfigurations createDynastoreConfigurations() {
        return new DynastoreConfigurations();
    }

    /**
     * Create an instance of {@link DynastoreConfiguration }
     * 
     */
    public DynastoreConfiguration createDynastoreConfiguration() {
        return new DynastoreConfiguration();
    }

    /**
     * Create an instance of {@link DynastoreName }
     * 
     */
    public DynastoreName createDynastoreName() {
        return new DynastoreName();
    }

    /**
     * Create an instance of {@link DynastoreInitializer }
     * 
     */
    public DynastoreInitializer createDynastoreInitializer() {
        return new DynastoreInitializer();
    }

    /**
     * Create an instance of {@link AccessScope }
     * 
     */
    public AccessScope createAccessScope() {
        return new AccessScope();
    }

    /**
     * Create an instance of {@link PublishEvent }
     * 
     */
    public PublishEvent createPublishEvent() {
        return new PublishEvent();
    }

    /**
     * Create an instance of {@link CustomBuilder }
     * 
     */
    public CustomBuilder createCustomBuilder() {
        return new CustomBuilder();
    }

    /**
     * Create an instance of {@link SQLBuilder }
     * 
     */
    public SQLBuilder createSQLBuilder() {
        return new SQLBuilder();
    }

    /**
     * Create an instance of {@link InlineBuilder }
     * 
     */
    public InlineBuilder createInlineBuilder() {
        return new InlineBuilder();
    }

    /**
     * Create an instance of {@link SQLQuery }
     * 
     */
    public SQLQuery createSQLQuery() {
        return new SQLQuery();
    }

}
