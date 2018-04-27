package com.clk.clkdemo.Service;

import com.clk.clkdemo.model.entitis.User;

public interface UserService {

    public User findUserByName(String name);

    public void saveUser(User user);
}
