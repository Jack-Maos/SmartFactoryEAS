package com.xidian.smartfactoryeas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xidian.smartfactoryeas.entity.User;
import com.xidian.smartfactoryeas.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/regist")
    @ResponseBody
    public User regist(@RequestBody User user){
        return userService.userRegist(user);
    }

    @PostMapping("/delete")
    @ResponseBody
    public User delete(@RequestBody User user){
        return userService.userDelete(user);
    }

    @PostMapping("/query")
    @ResponseBody
    public User query(@RequestBody User user){
        return userService.userQuery(user);
    }

//    @PostMapping("/login")
//    @ResponseBody
//    public User login(@RequestBody User user){
//        return userService.userLogin(user);
//    }

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<?> login(@RequestBody User user) {
        User loggedInUser = userService.userLogin(user);
        if (loggedInUser != null) {
            // 登录成功，创建包含用户信息和状态码1的JSON响应
            JSONObject response = new JSONObject();
            response.put("user", loggedInUser);
            response.put("status", 1);
            return ResponseEntity.ok(response);
        } else {
            // 登录失败，创建包含状态码0的JSON响应
            JSONObject response = new JSONObject();
            response.put("status", 0);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }

    @PostMapping("/update")
    @ResponseBody
    public User update(@RequestBody String json){
        JSONObject jsonObject = JSON.parseObject(json);
        User user = jsonObject.getObject("user", User.class);
        String newpassword = jsonObject.getString("newpassword");
        return userService.userUpdate(user, newpassword);
    }

}
