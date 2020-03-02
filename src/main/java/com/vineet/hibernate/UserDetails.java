package com.vineet.hibernate;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {   // @Entity will treat as entity and need to persist this class members.

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    private String userName;

}
