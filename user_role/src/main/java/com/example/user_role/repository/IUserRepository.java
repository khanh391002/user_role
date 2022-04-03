package com.example.user_role.repository;

import com.example.user_role.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    @Query("SELECT u FROM User u WHERE u.userName =:username AND u.password =:password")
    User findOneUserByUsernameAndPassword(@Param("username") String username , @Param("password") String password);

    @Modifying(clearAutomatically = true)//trong ngoặc là xoá bối cảnh tồn tại
    @Transactional
//    @Modifying
    @Query("update User u set u.password = :password where u.userName = :username")
    void updateUserSetPasswordForUsername(@Param("password") String password,
                                   @Param("username") String username);
}
