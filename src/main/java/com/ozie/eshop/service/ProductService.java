package com.ozie.eshop.service;

import com.ozie.eshop.model.Product;
import com.ozie.eshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {
       return productRepository.findAll();
    }
}
