package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {

    List<User> queryAll();

    User queryById(String id);
    //开发者1
    User queryByName(String id);
    //开发者2
    User queryByIds(String id);
}
