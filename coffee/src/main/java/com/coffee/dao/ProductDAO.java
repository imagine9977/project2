package com.coffee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffee.dto.Product;
import com.coffee.dto.ProductVO;

@Repository
public class ProductDAO implements ProductMapper {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int getTotalCount() {
		return sqlSession.selectOne("product.getTotalCount");
	}

	@Override
	public List<ProductVO> getProductList() {
		return sqlSession.selectList("product.getProductList");
	}

	@Override
	public List<ProductVO> getProductCateList(String cate) {
		return sqlSession.selectList("product.getProductCateList", cate);
	}

	@Override
	public ProductVO getProduct(int pno) {
		return sqlSession.selectOne("product.getProduct", pno);
	}

	@Override
	public void insProduct(Product product) {
		sqlSession.insert("product.insProduct", product);
	}

	@Override
	public void upProduct(Product product) {
		sqlSession.update("product.upProduct", product);		
	}

	@Override
	public void delProduct(int pno) {
		sqlSession.delete("product.delProduct", pno);		
	}
	

}