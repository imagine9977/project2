package com.coffee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.dto.Inventory;

@Repository
public class InventoryDAO implements InventoryMapper {

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<Inventory> getInventoryList() {
		return sqlSession.selectList("Inventory.getInventoryList");
	}

	@Override
	public Inventory getInventory(int bno) {
		return sqlSession.selectOne("Inventory.getInventory", bno);
	}

	

	@Override
	public void insInventory(Inventory inventory) {
		sqlSession.insert("Inventory.insInventory", inventory);
	}

	@Override
	public void upInventory(Inventory inventory) {
		sqlSession.update("Inventory.upInventory", inventory);
	}

	@Override
	public void delInventory(int bno) {
		sqlSession.delete("Inventory.delInventory", bno);		
	}


	
	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("Inventory.getTotalCount");

	}

	@Override
	public void vcntCount(int bno) {
		sqlSession.update("Inventory.vcntCount", bno);
		
	}
}