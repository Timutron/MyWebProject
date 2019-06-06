package com.example.demo.service;

import com.example.demo.entity.User;

public interface IUserService {

    void save(User user);

    User findByLogin(String login);
}
