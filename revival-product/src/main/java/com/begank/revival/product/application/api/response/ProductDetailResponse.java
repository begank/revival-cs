package com.begank.revival.product.application.api.response;

import com.begank.common.web.BaseApiResponse;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName :
 * @Description :
 * @Author : begank
 * @Date: 2021-12-27 21:48
 */
@Data
public class ProductDetailResponse extends BaseApiResponse {

    private String id;

    private String name;

    private BigDecimal price;

    private String url;
}
