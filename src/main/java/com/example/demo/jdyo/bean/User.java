package com.example.demo.jdyo.bean;

import lombok.Data;

/**
 * @Description:
 * @Author:tangdianyan
 * @Date:Created in 16:50 2021/1/27
 * @Modified By:
 */
@Data
public class User {
    private int id;
    private String name;
    private String password;
    private String role;
    private String permission;
}
