package com.xuwenping123.event.dispatcher.core.channel;

import com.xuwenping123.event.dispatcher.core.event.Event;

import java.util.List;

public interface Channel {

    void put(List<? extends Event> events);

    List<? extends Event> take();
}
