package com.coffee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.coffee.dto.Sales;

public class SalesDAO implements SalesMapper {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Sales> getSalesList() {
		return sqlSession.selectList("Sales.getSalesList");
	}

	@Override
	public Sales getSales(int sno) {
		return sqlSession.selectOne("Sales.getSales", sno);
	}

	@Override
	public void insSales(Sales sales) {
		sqlSession.insert("Sales.insSales", sales);
	}

	@Override
	public void upSales(Sales sales) {
		sqlSession.update("Sales.upSales", sales);
	}

	@Override
	public void delSales(int sno) {
		sqlSession.delete("Sales.delSales", sno);
	}

	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("Sales.getTotalCount");

	}

	@Override
	public void vcntCount(int sno) {
		sqlSession.update("Sales.vcntCount", sno);

	}
}