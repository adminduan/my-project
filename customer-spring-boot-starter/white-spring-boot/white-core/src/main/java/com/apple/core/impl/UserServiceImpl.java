package com.apple.core.impl;

import com.apple.core.UserService;

/**
 * @author duanlsh
 * @description TODO
 * @date 2019/7/25
 */
public class UserServiceImpl implements UserService {

    public String getName(String name){
        return "hello," + name;
    }
}
