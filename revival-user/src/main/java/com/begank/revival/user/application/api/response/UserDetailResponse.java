package com.begank.revival.user.application.api.response;

import lombok.Data;

/**
 * @ClassName :
 * @Description :
 * @Author : begank
 * @Date: 2021-12-27 22:10
 */
@Data
public class UserDetailResponse {

    private String userId;

    private String userName;

    private Integer age;

    private String mobile;

}
