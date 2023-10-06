package com.xidian.smartfactoryeas.dao;

import com.xidian.smartfactoryeas.entity.User;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;

public interface UserDao {

    public int insertUser(@Param("user") User user, @Param("createddate") LocalDateTime createddate);//注册用户

    public int deleteUser(User user);//删除用户

    public User queryUser(User user);//查询用户

    public int loginUser(@Param("user") User user, @Param("logindate") LocalDateTime logindate);//登录用户

    public int updateUser(@Param("user") User user, @Param("newpassword") String newpassword);//修改密码
}
