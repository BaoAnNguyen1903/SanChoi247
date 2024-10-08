package com.example.SanChoi247.model.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class User {
    // uid int auto_increment primary key,
    // name varchar(64),
    // dob date,
    // gender char,
    // phone varchar(16),
    // email varchar(50),
    // username varchar(64),
    // password varchar(128),
    // avatar text,
    // role char
    private int uid;
    private String name;
    private Date dob;
    private char gender;
    private String phone;
    private String email;
    private String username;
    private String password;
    private String avatar;
    private char role;

    public User(String name, Date dob, char gender, String phone, String email, String username, String password,
            char role) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User orElseThrow(Object userNotFound) {
        return null;
    }

    public boolean isVerified() {
        return role != UserRole.UNVERIFIED_USER.getValue() && role != UserRole.UNVERIFIED_CHUSAN.getValue();
    }

    public UserRole getUserRole() {
        return UserRole.fromValue(role);
    }

    @Getter
    public enum UserRole {

        ADMIN('A'),

        ChuSan('C'),
        UNVERIFIED_CHUSAN('c'),
        BANNED_CHUSAN('p'),

        USER('U'),
        UNVERIFIED_USER('u'),
        BANNED_USER('b');

        private final char value;

        UserRole(char value) {
            this.value = value;
        }

        public static UserRole fromValue(char value) {
            for (UserRole role : UserRole.values()) {
                if (role.getValue() == value) {
                    return role;
                }
            }
            return null;
        }
    }
}
