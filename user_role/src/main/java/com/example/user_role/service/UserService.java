package com.example.user_role.service;

import com.example.user_role.domain.User;
import com.example.user_role.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepository userRepository;
    Scanner sc = new Scanner(System.in);
    @Override
    public boolean findOneUserByUsernameAndPassword(String username, String password) {
        if (userRepository.findOneUserByUsernameAndPassword(username, password) != null){
            return true;
        }
        return false;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public void updateUserSetPasswordForUsername() {
        System.out.print("Nhap ten user can doi mk: ");
        String username = sc.nextLine();
        System.out.print("Nhap mk moi : ");
        String password = sc.nextLine();
        userRepository.updateUserSetPasswordForUsername(password,username);
        System.out.println("Cap nhat thanh cong !");
    }
}
