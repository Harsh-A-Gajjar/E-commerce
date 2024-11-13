package com.project.E_commerce.services.Impl;



import com.project.E_commerce.model.Product;
import com.project.E_commerce.repository.ProductRepository;
import com.project.E_commerce.services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SellerServicesIMPL implements SellerServices {

    private ProductRepository productRepository;
    @Autowired
    public SellerServicesIMPL(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProductById(long productId, Double productPrice) {

        return null;
    }

    @Override
    public void deleteProductById(long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();

    }
}
