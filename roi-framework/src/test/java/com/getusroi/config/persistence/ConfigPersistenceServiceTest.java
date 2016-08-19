package com.getusroi.config.persistence;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.getusroi.config.persistence.dao.ConfigNodeDataDAO;
import com.getusroi.config.persistence.impl.ConfigPersistenceServiceMySqlImpl;
import com.getusroi.config.persistence.impl.TenantConfigTreeServiceImpl;
import com.getusroi.permastore.config.PermaStoreConfigurationConstant;



public class ConfigPersistenceServiceTest {
	final Logger logger = LoggerFactory.getLogger(ConfigPersistenceServiceTest.class);
	private static final int queryNodeId=26;
	private static final String testConfigName="Test2";
	IConfigPersistenceService perService;
	
	@Before
	public void initializeTheDataGrid() throws ConfigPersistenceException{
		perService=new ConfigPersistenceServiceMySqlImpl();
		perService.getConfigPolicyNodeTree();
	}
	
	@Test
	public void TestInsertConfigNode() throws ConfigPersistenceException{
		ConfigNode node=new ConfigNode(); 
		node.setDescription("Test Node at Levek-1");
		node.setHasChildren(false);
		node.setLevel(1);
		node.setNodeName("Test-Tenant");
		node.setParentNodeId(0);
		node.setType(ConfigNode.NODETYPE_TENANT);
		node.setRoot(false);
		int nodeId=perService.insertConfigNode(node);
		Assert.assertNotEquals("Inserted Node should not have NodeId as 0", 0, nodeId);
		//Check Database first
		ConfigNode dbNode=perService.getNodeById(nodeId);
		Assert.assertNotNull("Node must exist in the Database and should not be Null", dbNode);
		Assert.assertEquals("NodeId must be same", nodeId, dbNode.getNodeId().intValue());
		//Check the DataGrid Cache
		ITenantConfigTreeService tenantTreeService=TenantConfigTreeServiceImpl.getTenantConfigTreeServiceImpl();
		ConfigurationTreeNode configNodeTree=tenantTreeService.getConfigTreeNodeForTenantById(nodeId);
		Assert.assertNotNull("Node must exist in the Cache and should not be null", configNodeTree);
	}
	@Test
	public void TestDeleteConfigNodeWithoutNodeData() throws ConfigPersistenceException{
		ConfigNode node=new ConfigNode(); 
		node.setDescription("Test Node at Levek-1");
		node.setHasChildren(false);
		node.setLevel(1);
		node.setNodeName("Test-Tenant");
		node.setParentNodeId(0);
		node.setType(ConfigNode.NODETYPE_TENANT);
		node.setRoot(false);
		int nodeId=perService.insertConfigNode(node);
		//Now lets delete the inserted Node
		
		boolean isDeleted=perService.deleteNodeByNodeId(nodeId);
		Assert.assertTrue("If deleted than Boolean must be True", isDeleted);
		//Check Database first
		ConfigNode dbNode=perService.getNodeById(nodeId);
		Assert.assertNull("Node must not exist in the Database as its deleted", dbNode);
				
		//Check the DataGrid Cache
		ITenantConfigTreeService tenantTreeService=TenantConfigTreeServiceImpl.getTenantConfigTreeServiceImpl();
		ConfigurationTreeNode configNodeTree=tenantTreeService.getConfigTreeNodeForTenantById(nodeId);
		Assert.assertNull("Node must not exist in the Cache as we have Deleted It", configNodeTree);
	}
	
	@Test
	public void TestDeleteConfigNodeWithNodeData() throws ConfigPersistenceException, SQLException, IOException{
		ConfigNode node=new ConfigNode(); 
		node.setDescription("Test Node at Levek-1");
		node.setHasChildren(false);
		node.setLevel(1);
		node.setNodeName("Test-Tenant");
		node.setParentNodeId(0);
		node.setType(ConfigNode.NODETYPE_TENANT);
		node.setRoot(false);
		int nodeId=perService.insertConfigNode(node);
		//Now insert Node Data
		ConfigNodeDataDAO configNodeDataDAO=new ConfigNodeDataDAO();
		ConfigNodeData nodeData=new ConfigNodeData();
		nodeData.setParentConfigNodeId(queryNodeId);
		nodeData.setConfigName(testConfigName);
		nodeData.setConfigType(PermaStoreConfigurationConstant.PERMASTORE_CONFIG_TYPE);
		nodeData.setEnabled(false);
		nodeData.setConfigLoadStatus("Sucess");
		nodeData.setConfigData("{Juniut:Test}");
	
		int nodeDataId=configNodeDataDAO.insertConfigNodeData(nodeData);
		Assert.assertTrue("confignodeData inserted but generated Id is 0 hence failure", nodeDataId>0);
		//Now lets delete the inserted Node
		//#TODO COMPLETE iT
		boolean isDeleted=perService.deleteNodeByNodeId(nodeId);
		Assert.assertTrue("If deleted than Boolean must be True", isDeleted);
		//Check Database first
		ConfigNode dbNode=perService.getNodeById(nodeId);
		Assert.assertNull("Node must not exist in the Database as its deleted", dbNode);
		//Check DataBase for NodeData also
		List<ConfigNodeData> nodeDataList=perService.getConfigNodeDataByNodeId(nodeId);
		Assert.assertTrue("NodeData must not exist in the Database as its deleted", nodeDataList==null || nodeDataList.isEmpty() );
		//Check the DataGrid Cache
		ITenantConfigTreeService tenantTreeService=TenantConfigTreeServiceImpl.getTenantConfigTreeServiceImpl();
		ConfigurationTreeNode configNodeTree=tenantTreeService.getConfigTreeNodeForTenantById(nodeId);
		Assert.assertNull("Node must not exist in the Cache as we have Deleted It", configNodeTree);
	}
	
}
