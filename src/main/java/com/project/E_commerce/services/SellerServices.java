package com.project.E_commerce.services;

import com.project.E_commerce.model.Product;

import java.util.List;

public interface SellerServices {
    Product addProduct(Product product);

    Product updateProductById(long productId, Double productPrice);

    void deleteProductById(long productId);

    List<Product> getAllProducts();


}
