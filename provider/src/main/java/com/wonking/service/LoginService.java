package com.wonking.service;

/**
 * Created by kewangk on 2017/8/29.
 */
public interface LoginService {
    String login(String name,String password);
    String logout(String name);
}
