package com.coffee.dao;

import java.util.List;

import com.coffee.dto.Product;

public interface ProductMapper {
	public int getTotalCount();
	public List<Product> getProductList();
	public Product getProduct(int pno);
	public void insProduct(Product product);
	public void updProduct(Product product);
	public void delProduct(int pno);
}
