package com.coffee.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.coffee.dao.StoreDAO;
import com.coffee.dao.StoreDAOImpl;

public class TestAutowired {
	
	@Autowired
	private StoreDAO sampleDAO;

	public TestAutowired() {
		this.sampleDAO = new StoreDAOImpl();
	}
}