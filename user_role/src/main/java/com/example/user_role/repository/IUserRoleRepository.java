package com.example.user_role.repository;

import com.example.user_role.domain.User;
import com.example.user_role.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRoleRepository extends JpaRepository<UserRole, String> {
//    @Query("SELECT u FROM UserRole u WHERE u.userName =:username")
//    UserRole checkLoginRoleByUsername(@Param("username") String username);
}
