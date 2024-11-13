package com.project.E_commerce.controllers;
import com.project.E_commerce.model.Product;
import com.project.E_commerce.services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/seller")
public class SellerController {

    private SellerServices sellerService;
    @Autowired
    public SellerController(SellerServices sellerService){
        this.sellerService = sellerService;
    }

    // manage Products
    @PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return new ResponseEntity<>(sellerService.addProduct(product), HttpStatus.CREATED);
    }

    @PutMapping("/product/{productId}/price")
    public Product updateProductById(@PathVariable long productId , @RequestParam Double productPrice){
       return sellerService.updateProductById(productId,productPrice);
    }
    @DeleteMapping("/product/{productId}")
    public void deleteProduct(@RequestBody long productId){
        sellerService.deleteProductById(productId);
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return sellerService.getAllProducts();
    }

}
