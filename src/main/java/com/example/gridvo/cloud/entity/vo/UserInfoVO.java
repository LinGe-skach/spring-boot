package com.example.gridvo.cloud.entity.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfoVO implements Serializable {
    private Long id;
    private String username;
    private String password;
}
