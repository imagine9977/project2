package com.coffee.biz;

import java.util.List;

import com.coffee.dto.Product;


public interface ProductBiz {
	List<Product> getAllProducts();
    Product getProductById(int id);
    void insProduct(Product product);
    void updProduct(Product product);
    void delProduct(int id);
}
