package com.coffee.test;

import javax.annotation.Resource;

import com.coffee.dao.StoreDAO;
import com.coffee.dao.StoreDAOImpl;

public class TestResource {
	
	@Resource(name="testDAO")
	private StoreDAO sampleDAO;
	
	public TestResource() {
		this.sampleDAO = new StoreDAOImpl();
	}
}