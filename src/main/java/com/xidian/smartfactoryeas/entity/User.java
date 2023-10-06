package com.xidian.smartfactoryeas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private int userid;
    private String username;
    private String password;
    private String phonenum;
    private LocalDateTime lastlogin;
    private LocalDateTime createddate;

}
