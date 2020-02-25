package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {

    List<User> queryAll();

    User queryById(String id);

    User queryByIds(String id);
}
