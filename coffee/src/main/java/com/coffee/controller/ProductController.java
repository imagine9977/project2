package com.coffee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coffee.biz.ProductBiz;
import com.coffee.dto.Product;

@Controller
@RequestMapping("/product/")
public class ProductController {

	@Autowired
    private ProductBiz productBiz;

    // List all products
    @GetMapping("list.do")
    public String listProducts(Model model) {
        List<Product> products = productBiz.getAllProducts();
        model.addAttribute("products", products);
        return "product/list";
    }

    // Show product details
    @GetMapping("/{id}")
    public String getProduct(@PathVariable("id") int id, Model model) {
        Product product = productBiz.getProductById(id);
        model.addAttribute("product", product);
        return "product/detail";
    }

    // Show form to create a new product
    @GetMapping("/new")
    public String insProduct(Model model) {
        model.addAttribute("product", new Product());
        return "product/form";
    }

    // Handle form submission to create a new product
    @PostMapping
    public String insProductPro(@ModelAttribute Product product) {
        productBiz.insProduct(product);
        return "redirect:/products";
    }

    // Show form to edit an existing product
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable("id") int id, Model model) {
        Product product = productBiz.getProductById(id);
        model.addAttribute("product", product);
        return "product/form";
    }

    // Handle form submission to update an existing product
    @PostMapping("/{id}")
    public String showEditFormPro(@PathVariable("id") int id, @ModelAttribute Product product) {
        product.setPno(id);
        productBiz.updProduct(product);
        return "redirect:/products";
    }

    // Delete a product
    @GetMapping("/{id}/delete")
    public String deleteProduct(@PathVariable("id") int id) {
        productBiz.delProduct(id);
        return "redirect:/products";
    }
}