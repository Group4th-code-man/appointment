package com.luf.ssm.beans;

public class Product {
    private Integer id;
    private String pname;
    private String brand;
    private double price;
    private short stock;

//    public Product() {}
//
//    public Product(Integer id, String pname, String brand, double price, short stock) {
//        this.id = id;
//        this.pname = pname;
//        this.brand = brand;
//        this.price = price;
//        this.stock = stock;
//    }

    /* Alt+insert 快捷键 */
    public Integer getId() {
        return id;
    }


    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public short getStock() {
        return stock;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPname(String pName) {
        this.pname = pName;
    }

    public String getPname() {
        return pname;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(short stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
