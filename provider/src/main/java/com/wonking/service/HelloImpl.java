package com.wonking.service;

import com.wonking.interfaces.Hello;
import org.springframework.stereotype.Service;

/**
 * Created by kewangk on 2017/8/28.
 */
@Service("service")
public class HelloImpl implements Hello {
    @Override
    public String sayHello(String name) {
        return "Hello,"+name;
    }
}
