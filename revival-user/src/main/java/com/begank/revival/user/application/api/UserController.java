package com.begank.revival.user.application.api;

import com.begank.common.web.Response;
import com.begank.revival.user.application.api.request.AddUserRequest;
import com.begank.revival.user.application.api.response.UserDetailResponse;
import com.begank.revival.user.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :
 * @Description :
 * @Author : begank
 * @Date: 2021-12-27 22:08
 */
@RestController
public class UserController {

    /**
     * 用户服务
     */
    @Autowired
    private UserService userService;

    /**
     * 根据主键查询用户
     */
    @RequestMapping("/{$id}")
    public UserDetailResponse get(String id){
        return userService.getById(id);
    }

    /**
     * 新增用户
     */
    @PostMapping("/add")
    public Response addUser(@RequestBody AddUserRequest request){
        userService.addUser(request);
        return Response.success();
    }

}
