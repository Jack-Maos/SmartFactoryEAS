package com.xidian.smartfactoryeas.service;

import com.xidian.smartfactoryeas.entity.User;

public interface UserService {

    public User userRegist(User user);

    public User userDelete(User user);

    public User userQuery(User user);

    public User userLogin(User user);

    public User userUpdate(User user, String newpassword);

}
