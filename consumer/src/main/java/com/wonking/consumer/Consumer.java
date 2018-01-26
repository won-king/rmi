package com.wonking.consumer;

import com.wonking.interfaces.Hello;
import com.wonking.service.LoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by kewangk on 2017/8/28.
 */
public class Consumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer started,press any key to exit...");
        Hello service=context.getBean(Hello.class);
        System.out.println(service.sayHello("wonking"));
        System.out.println("login service started");
        LoginService loginService= (LoginService) context.getBean("loginService");
        System.out.println(loginService.login("wonking","zdd520"));
        System.out.println(loginService.logout("wangke"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
