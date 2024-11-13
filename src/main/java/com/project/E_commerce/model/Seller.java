package com.project.E_commerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Seller {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long sellerId;
    private String sellerName;
    private String sellingProduct;

    public Seller(long sellerId, String sellerName, String sellingProduct) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.sellingProduct = sellingProduct;
    }

    public Seller() {
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellingProduct() {
        return sellingProduct;
    }

    public void setSellingProduct(String sellingProduct) {
        this.sellingProduct = sellingProduct;
    }
}
