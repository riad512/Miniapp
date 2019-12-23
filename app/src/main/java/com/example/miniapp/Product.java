package com.example.miniapp;

public class Product {
    private int product_id;
    private String product_name;
    private String product_cateqory;
    private String product_descriptionl;
    private int product_price;

    public Product() {

    }

    public Product(int product_id, String product_name, String product_cateqory, String product_descriptionl, int product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cateqory = product_cateqory;
        this.product_descriptionl = product_descriptionl;
        this.product_price = product_price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_cateqory() {
        return product_cateqory;
    }

    public void setProduct_cateqory(String product_cateqory) {
        this.product_cateqory = product_cateqory;
    }

    public String getProduct_descriptionl() {
        return product_descriptionl;
    }

    public void setProduct_descriptionl(String product_descriptionl) {
        this.product_descriptionl = product_descriptionl;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_cateqory='" + product_cateqory + '\'' +
                ", product_descriptionl='" + product_descriptionl + '\'' +
                ", product_price=" + product_price +
                '}';
    }
}
