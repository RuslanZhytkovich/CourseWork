package com.example.coursework;


import com.example.coursework.User;

import java.util.List;

public interface UserRepository {

    List<User> gelAll();

    void deleteById(Integer id);

    void add(User user);

     void update(User user);
}