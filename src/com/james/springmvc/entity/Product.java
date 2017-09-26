package com.james.springmvc.entity;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Product {

    private String productName;
    private String description;
    private float price;

    public Product(String productName, String description, float price) {
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public Product() {}

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
