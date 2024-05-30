package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Product;
import com.coffee.dto.ProductVO;

public interface ProductMapper {
	int getTotalCount();
	List<ProductVO> getProductList();
	List<ProductVO> getProductCateList(String cate);
	ProductVO getProduct(int pno);
	void insProduct(Product product);
	void upProduct(Product product);
	void delProduct(int pno);
}
