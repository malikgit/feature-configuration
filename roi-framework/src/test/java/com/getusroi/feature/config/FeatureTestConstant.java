package com.getusroi.feature.config;

import com.getusroi.config.util.GenericTestConstant;

public class FeatureTestConstant extends GenericTestConstant{
	public static final String configfileToParse="featureService.xml";
	public static final String configfileToParse1="testfeature.xml";
	public static final String TEST_FEATURE_VENDOR="testParcelVendor";
	public static final String TEST_FEATURE_VERSION="1.0";
	public static final int TEST_VENDOR_NODEID=862;
	public static String TEST_FEATUREGROUP="label";
	public static String TEST_FEATURE="Parcel";
	public static int TEST_NODEID=241;
	public static int TEST_NODEID1=324;

	
	public static String  getFeature(){
		return TEST_FEATURE;
	}
	public static int  getConfigNodeId(){
		return TEST_NODEID;
	}
	public static int  getConfigNodeId1(){
		return TEST_NODEID1;
	}
	
}
