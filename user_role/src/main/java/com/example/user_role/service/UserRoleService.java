package com.example.user_role.service;

import com.example.user_role.repository.IUserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService implements IUserRoleService{
    @Autowired
    IUserRoleRepository userRoleRepository;
//    @Override
//    public boolean checkLoginRoleByUsername(String username) {
//        if(userRoleRepository.checkLoginRoleByUsername(username).getRole().getRoleName().equals("admin")){
//            return true;
//        }
//        else if (userRoleRepository.checkLoginRoleByUsername(username).getRole().getRoleName().equals("user"))
//            return false;
//        return false;
//    }
}
