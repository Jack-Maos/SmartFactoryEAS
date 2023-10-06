package com.xidian.smartfactoryeas.service.Impl;

import com.xidian.smartfactoryeas.dao.UserDao;
import com.xidian.smartfactoryeas.entity.User;
import com.xidian.smartfactoryeas.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDAO;

    @Override
    public User userRegist(User user){
        LocalDateTime createddate = LocalDateTime.now();
        int i = userDAO.insertUser(user, createddate);
        if(i>0){
            return userDAO.queryUser(user);
        }else{
            return null;
        }
    }

    @Override
    public User userDelete(User user){
        int i = userDAO.deleteUser(user);
        if(i>0){
            return user;
        }else{
            return null;
        }
    }

    @Override
    public User userQuery(User user) {
        return userDAO.queryUser(user);
    }

    @Override
    public User userLogin(User user){
        LocalDateTime logindate = LocalDateTime.now();
        int i = userDAO.loginUser(user, logindate);
        if(i>0){
            return userDAO.queryUser(user);
        }else{
            return null;
        }
    }

    @Override
    public User userUpdate(User user, String newpassword){
        int i = userDAO.updateUser(user, newpassword);
        if(i>0){
            return userDAO.queryUser(user);
        }else{
            return null;
        }
    }

}
