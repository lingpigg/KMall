package com.linglett.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class User {
    public User(String userId,String password ) {
        this.password = password;
        this.userId = userId;
    }

    private String userId;
    private String username;
    private String password;
    private String sex;
    private String email;
    private String phone;
    private String headImg;
    private String createTime;
    private int role;
    private Date description;
    private String token;

    public User() {

    }
}

