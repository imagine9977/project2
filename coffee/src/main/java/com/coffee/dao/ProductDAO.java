package com.coffee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.dto.Product;

@Repository
public class ProductDAO implements ProductMapper {

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<Product> getProductList() {
		return sqlSession.selectList("Product.getProductList");
	}

	@Override
	public Product getProduct(int pno) {
		return sqlSession.selectOne("Product.getProduct", pno);
	}

	

	@Override
	public void insProduct(Product product) {
		sqlSession.insert("Product.insProduct", product);
	}

	@Override
	public void upProduct(Product product) {
		sqlSession.update("Product.upProduct", product);
	}

	@Override
	public void delProduct(int pno) {
		sqlSession.delete("Product.delProduct", pno);		
	}


	
	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("Product.getTotalCount");

	}

	@Override
	public void vcntCount(int pno) {
		sqlSession.update("Product.vcntCount", pno);
		
	}
}