package com.wonking.service;

import org.springframework.stereotype.Service;

/**
 * Created by kewangk on 2017/8/29.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Override
    public String login(String name, String password) {
        if("wonking".equals(name) && "zdd520".equals(password)){
            return "success";
        }
        return "fail";
    }

    @Override
    public String logout(String name) {
        return name+" welcome to come next";
    }
}
