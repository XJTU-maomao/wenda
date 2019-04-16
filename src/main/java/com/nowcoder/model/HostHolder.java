/*
 * Created by maomao at Xi'an Jiaotong University
 * Copyright (c) 19-4-15 下午3:11;
 */

package com.nowcoder.model;

import org.springframework.stereotype.Component;

@Component
public class HostHolder {
    private static ThreadLocal<User> users = new ThreadLocal<>();

    public User getUser(){
        return users.get();
    }

    public void setUser(User user){
        users.set(user);
    }

    public void clear(){
        users.remove();
    }
}
