package com.begank.common.enums;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName :
 * @Description :
 * @Author : begank
 * @Date: 2021-12-26 21:46
 */
@Getter
public enum ResponseEnum {

    SUCCESS("000000","SUCCESS"),

    FAIL("999999","system busy"),

    ;

    private String code;

    private String msg;

    ResponseEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
