package com.coffee.biz;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coffee.dao.BoardMapper;
import com.coffee.dao.ProductMapper;
import com.coffee.dto.Product;
@Service
public class ProductService implements ProductBiz {

	private ProductMapper productDAO;

    @Override
    public List<Product> getAllProducts() {
        return productDAO.getProductList();
    }

    @Override
    public Product getProductById(int pno) {
        return productDAO.getProduct(pno);
    }

    @Override
    public void insProduct(Product product) {
    	productDAO.insProduct(product);
    }

    @Override
    public void updProduct(Product product) {
    	productDAO.updProduct(product);
    }

    @Override
    public void delProduct(int pno) {
    	productDAO.delProduct(pno);
    }

}
