package com.begank.revival.user.application.api.request;

import lombok.Data;

/**
 * @ClassName :
 * @Description :
 * @Author : begank
 * @Date: 2021-12-27 22:19
 */
@Data
public class AddUserRequest {

    private String userName;

    private Integer age;

    private String mobile;
}
