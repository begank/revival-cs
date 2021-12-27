package com.begank.revival.product.application.api;

import com.begank.common.web.Response;
import com.begank.revival.product.application.api.response.ProductDetailResponse;
import com.begank.revival.product.application.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :
 * @Description :
 * @Author : begank
 * @Date: 2021-12-27 21:47
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/{$id}")
    public ProductDetailResponse get(String id){
        return productService.getById(id);
    }
}
