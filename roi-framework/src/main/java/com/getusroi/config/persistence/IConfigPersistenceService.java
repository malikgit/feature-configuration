package com.getusroi.config.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IConfigPersistenceService {
	public ConfigurationTreeNode getConfigPolicyNodeTree()throws ConfigPersistenceException ;
	public String getConfigPolicyNodeTreeAsJson()throws ConfigPersistenceException ;
	public int insertConfigNode(ConfigNode node)throws ConfigPersistenceException ;
	public List<ConfigNode> getChildNodes(Integer parentNodeId)throws ConfigPersistenceException ;
	public ConfigNode getNodeById(Integer nodeId)throws ConfigPersistenceException ;
	public boolean deleteNodeByNodeId(Integer nodeId)throws ConfigPersistenceException ;
	
	public int getNodeIdByNodeNameAndByType(String nodeName, String type,int parentNodeId) throws ConfigPersistenceException;

	
	public int getNodeIdByNodeNameAndByTypeNotWithGivenNodeId(String nodeName,String type, int parentNodeId, int updatingNodeId)throws ConfigPersistenceException;
	//TenantTreeService Related
	public  ConfigurationTreeNode getConfigTreeNodeForFeatureGroup(String tenantName,String siteName,String featureGroup) throws ConfigPersistenceException;
	public ConfigurationTreeNode getConfigTreeNodeForTenantById(Integer tenantId) throws ConfigPersistenceException;
	
	/** Based on Tenant,Site,FeatureGroup,Feature finds the applicable NodeId
	 * to Tag any Configuration <BR>
	 * Note :- 1.) Does not support tagging PermaStore above Feature Group.<br>
	 * 2.) Does not support Tagging of Configuration to Vendor with in a Feature.
	 */
	public Integer getApplicableNodeId(String tenantId, String siteId, String featureGroup, String featureName,String vendorName,String version)throws InvalidNodeTreeException, ConfigPersistenceException;
	public Integer getApplicableNodeId(String tenantId, String siteId)throws InvalidNodeTreeException, ConfigPersistenceException;

	//ConfigPolicy Data /NodeData
	public List<ConfigNodeData> getConfigNodeDataByNodeId(Integer nodeId) throws ConfigPersistenceException;
	public int insertConfigNodeData(ConfigNodeData nodeData)throws ConfigPersistenceException;
	public ConfigNodeData getConfigNodeDatabyNameAndNodeId(Integer nodeId,String configName,String configType) throws ConfigPersistenceException;
	public int getNodeIDByNameAndType(String nodename,String nodeType) throws ConfigPersistenceException;
	public boolean updateConfigdataInConfigNodeData(String xmlString,Integer nodeId,String configName,String configType) throws ConfigPersistenceException;
	public boolean deleteConfigNodeData(Integer configNodeDataId)throws ConfigPersistenceException;
	public int deleteConfigNodeDataByNodeId(Integer nodeId) throws ConfigPersistenceException;
	public void enableConfigNodeData(boolean setEnable,Integer nodeDataId) throws ConfigPersistenceException;
	
	public int deleteConfigNodeDataByNodeIdAndConfigName(String configName,
			int nodeId) throws ConfigPersistenceException;
	
	public List<ConfigNodeData> getConfigNodeDataByNodeIdAndByType(
			Integer nodeId, String type) throws ConfigPersistenceException ;
	public int updateConfigNodeData(ConfigNodeData nodeData)
			throws ConfigPersistenceException;
	
	/**
	 * 	Featuremaster DB  Oprations 
	 */
	public int getFeatureMasterIdByFeatureAndFeaturegroup(String featureName,String featureGroup,int siteId) throws ConfigPersistenceException;

	
	
}
