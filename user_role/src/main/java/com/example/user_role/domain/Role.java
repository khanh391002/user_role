package com.example.user_role.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "role_id")
    private int roleId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "role", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<UserRole> userRoleList = new ArrayList<>();

    public Role() {
    }

    public Role(String roleName, int roleId) {
        this.roleName = roleName;
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
