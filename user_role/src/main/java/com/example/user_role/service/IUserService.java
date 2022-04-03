package com.example.user_role.service;

public interface IUserService {
    boolean findOneUserByUsernameAndPassword(String username, String password);
    void updateUserSetPasswordForUsername();
}
