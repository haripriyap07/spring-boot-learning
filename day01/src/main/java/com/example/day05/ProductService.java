package com.example.day05;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public List<Product> getProducts(){
        return products;
    }

    public String addProduct(Product product){
        products.add(product);
        return "Product added";
    }
}