///*
// * Created by maomao at Xi'an Jiaotong University
// * Copyright (c) 19-4-18 下午11:11;
// */
//
//package com.nowcoder.async.handle;
//
//import com.nowcoder.async.EventHandler;
//import com.nowcoder.async.EventModel;
//import com.nowcoder.async.EventType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailSender;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Component
//public class LoginExceptionHandler implements EventHandler {
//    @Autowired
//    MailSender mailSender;
//
//    @Override
//    public void doHandle(EventModel model) {
//        // xxxx判断发现这个用户登陆异常
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("username", model.getExt("username"));
//
//    }
//
//    @Override
//    public List<EventType> getSupportEventTypes() {
//        return Arrays.asList(EventType.LOGIN);
//    }
//}
