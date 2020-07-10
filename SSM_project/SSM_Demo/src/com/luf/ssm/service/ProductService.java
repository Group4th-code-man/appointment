package com.luf.ssm.service;

import com.luf.ssm.beans.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();

    public void deleteProduct(Integer id);
}
