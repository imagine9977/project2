package com.coffee.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.coffee.dao.StoreDAO;
import com.coffee.dao.StoreDAOImpl;

public class TestQualifier {

	@Autowired
	@Qualifier("testDAO")
	private StoreDAO sampleDAO;
	
	public TestQualifier() {
		this.sampleDAO = new StoreDAOImpl();
	}
}