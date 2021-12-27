package com.begank.revival.user.application.service;

import com.begank.revival.user.application.api.request.AddUserRequest;
import com.begank.revival.user.application.api.response.UserDetailResponse;
import org.springframework.stereotype.Service;

/**
 * @ClassName :
 * @Description :
 * @Author : begank
 * @Date: 2021-12-27 22:09
 */
@Service
public class UserService {

    /**
     * 根据id查询用户详情
     */
    public UserDetailResponse getById(String id) {
        UserDetailResponse response = new UserDetailResponse();
        response.setUserName("路飞");
        response.setAge(17);
        return response;
    }

    public void addUser(AddUserRequest request) {

    }
}
