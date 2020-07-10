package com.luf.ssm.mapper;

import com.luf.ssm.beans.Product;

import java.util.List;

public interface ProductMapper {

    public List<Product> selectAllProducts();

    public void deleteProduct(Integer id);
}
