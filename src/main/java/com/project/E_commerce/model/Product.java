package com.project.E_commerce.model;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private String productDescription;
    private String productPrice;
    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    private Seller seller;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Seller getSeller(){
        return seller;
    }
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Product() {
    }

    public Product(Long productId, String name, String productDescription, String productPrice, Seller seller) {
        this.productId = productId;
        this.name = name;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.seller = seller;
    }

}