package com.qkj.qkjmanager.dao;

import java.util.List;
import java.util.Map;

import org.iweb.sys.AbstractDAO;

public class reportDao extends AbstractDAO{
	public List list(Map<String, Object> map) {
		//setCountMapid("basics_getCheckCounts");
		return super.list("qkjmanager_getVarticsReport", map);
	}
}