package com.luf.ssm.handler;

import com.luf.ssm.beans.Product;
import com.luf.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
public class ProductHandler {

    @Autowired
    private ProductService productService;

    /**
     * 显示所有商品信息
     */
    @RequestMapping(value="/products", method= RequestMethod.GET)
    public String listAllProducts(Map<String, Object> map) {
        List<Product> products = productService.getAllProducts();
        map.put("products", products);

        return "displayAll";
    }

    @RequestMapping(value="/deleteP")
    public String deleteProduct() {
        productService.deleteProduct(104);

        return "success";
    }
}
