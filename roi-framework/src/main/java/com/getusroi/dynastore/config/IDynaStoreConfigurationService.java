package com.getusroi.dynastore.config;

import com.getusroi.config.ConfigurationContext;
import com.getusroi.config.RequestContext;
import com.getusroi.dynastore.config.jaxb.DynastoreConfiguration;

public interface IDynaStoreConfigurationService {
	
	public void addDynaStoreConfiguration(ConfigurationContext configurationContext,DynastoreConfiguration dynastoreConfiguration) throws DynaStoreConfigurationException;

	public DynastoreConfiguration getDynaStoreConfiguration(RequestContext dynaStoreConfigRequestContext,String dynaStoreConfigName,String version) throws DynaStoreConfigRequestContextException;
	public DynaStoreConfigurationUnit getDynaStoreConfigurationUnit(RequestContext dynaStoreConfigRequestContext,String dynaStoreConfigName,String version) throws DynaStoreConfigRequestContextException;
	public boolean changeStatusOfDynaStoreConfiguration(RequestContext dyConfigRequestContext,String dynStoreConfigName,String version,boolean isEnable)  throws DynaStoreConfigurationException;
	public boolean deleteDynaStoreConfiguration(RequestContext dyConfigRequestContext,String dynStoreConfigName,String version)  throws DynaStoreConfigurationException;

}
