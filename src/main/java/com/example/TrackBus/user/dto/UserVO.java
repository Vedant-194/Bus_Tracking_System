package com.example.TrackBus.user.dto;


import com.example.TrackBus.role.entity.Role;
import com.example.TrackBus.user.entity.User;

import java.util.Objects;

public class UserVO {

    User user;
    Role role;

    public UserVO(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    public UserVO() {
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserVO)) return false;
        UserVO userVO = (UserVO) o;
        return Objects.equals(user, userVO.user) &&
                Objects.equals(role, userVO.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, role);
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "user=" + user +
                ", role=" + role +
                '}';
    }
}
