package com.coffee.test;

import javax.inject.Inject;

import com.coffee.dao.StoreDAO;
import com.coffee.dao.StoreDAOImpl;

public class TestInject {

	@Inject
	private StoreDAO sampleDAO; 
	
	public TestInject() {
		this.sampleDAO = new StoreDAOImpl();
	}
}