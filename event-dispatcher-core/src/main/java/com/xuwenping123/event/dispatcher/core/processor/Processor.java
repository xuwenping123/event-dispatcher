package com.xuwenping123.event.dispatcher.core.processor;

import com.xuwenping123.event.dispatcher.core.event.Event;

import java.util.List;

public interface Processor {

    void process(List<? extends Event> events);
}
