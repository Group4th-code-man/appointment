package com.luf.ssm.service;

import com.luf.ssm.beans.Product;
import com.luf.ssm.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    public List<Product> getAllProducts() {

        return productMapper.selectAllProducts();
    }

    public void deleteProduct(Integer id) {
        productMapper.deleteProduct(id);
    }
}
