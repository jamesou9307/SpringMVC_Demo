package com.james.springmvc.form;

public class ProductForm {

    private String productName;
    private String description;
    private String price;

    public ProductForm(String productName, String description, String price) {
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public ProductForm() {
    }

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
