package com.begank.common.web;

import com.begank.common.enums.ResponseEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName :
 * @Description :
 * @Author : begank
 * @Date: 2021-12-26 21:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response<T> {

    private String code;

    private String msg;

    private T data;

    /**
     * 默认请求成功的返回对象
     */
    public static final Response DEFAULT_SUCCESS_RESPONSE =
            new Response(ResponseEnum.SUCCESS.getCode(),ResponseEnum.SUCCESS.getMsg());

    /**
     * 默认请求失败的返回对象
     */
    public static final Response DEFAULT_FAIL_RESPONSE =
            new Response(ResponseEnum.FAIL.getCode(),ResponseEnum.FAIL.getMsg());

    /**
     * 构造
     * @param code
     * @param msg
     */
    public Response(String code,String msg){
        this.code = code;
        this.msg = msg ;
    }

    /**
     * 请求成功
     */
    public static Response success(){
        return DEFAULT_SUCCESS_RESPONSE;
    }

    /**
     * 请求成功
     */
    public static <T> Response<T> success(T data){
        Response response = new Response(ResponseEnum.SUCCESS.getCode(),ResponseEnum.SUCCESS.getMsg());
        response.setData(data);
        return response;
    }

    /**
     * 请求失败
     * @return
     */
    public static Response fail(){
        return DEFAULT_FAIL_RESPONSE;
    }
}
