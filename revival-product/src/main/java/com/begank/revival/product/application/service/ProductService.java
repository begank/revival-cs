package com.begank.revival.product.application.service;

import com.begank.revival.product.application.api.response.ProductDetailResponse;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;

/**
 * @ClassName :
 * @Description :
 * @Author : begank
 * @Date: 2021-12-27 21:52
 */
@Service
@Log
public class ProductService {

    /**
     * 根据主键查询产品详情
     */
    public ProductDetailResponse getById(String id) {
        ProductDetailResponse response = new ProductDetailResponse();
        response.setName("天猫精灵");
        return response;
    }
}
