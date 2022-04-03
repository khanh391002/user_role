package com.example.user_role;

import com.example.user_role.domain.User;
import com.example.user_role.repository.IUserRepository;
import com.example.user_role.service.IUserService;
import com.example.user_role.service.UserRoleService;
import com.example.user_role.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class UserRoleApplication implements CommandLineRunner {
	@Autowired
	UserService userService;
	@Autowired
	UserRoleService userRoleService;

	public static void main(String[] args) {
		SpringApplication.run(UserRoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap username: ");
		String username = sc.nextLine();
		System.out.print("Nhap password: ");
		String password = sc.nextLine();
		if (userService.findOneUserByUsernameAndPassword(username,password)){
//			if (userRoleService.checkLoginRoleByUsername(username)){
//				System.out.println("Dang nhap thanh cong la Admin!");
//			}
//			else if (!userRoleService.checkLoginRoleByUsername(username)){
//				System.out.println("Dang nhap thanh cong la User!");
//			}
			System.out.println("hi");
			List<User> userList = userService.findAll();
			userList.forEach(user -> {
				System.out.println(user.toString());
			});
			userService.updateUserSetPasswordForUsername();
		}
		else {
			System.out.println("Dang nhap that bai !");
		}
	}
}
