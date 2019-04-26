/*
 * Created by maomao at Xi'an Jiaotong University
 * Copyright (c) 19-4-18 下午10:11;
 */

package com.nowcoder.async;

public enum  EventType {
    LIKE(0),
    COMMENT(1),
    LOGIN(2),
    MAIL(3),
    FOLLOW(4),
    UNFOLLOW(5);

    private int value;
    EventType(int value){this.value = value;}
    public int getValue(){return value;}
}
