/*
 * Created by maomao at Xi'an Jiaotong University
 * Copyright (c) 19-4-18 下午10:20;
 */

package com.nowcoder.async;

import java.util.List;

public interface EventHandler {
    void doHandle(EventModel model);

    List<EventType> getSupportEventTypes();
}
