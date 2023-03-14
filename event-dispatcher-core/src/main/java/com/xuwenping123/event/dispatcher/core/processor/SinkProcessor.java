package com.xuwenping123.event.dispatcher.core.processor;

import com.xuwenping123.event.dispatcher.core.sink.Sink;

import java.util.List;

public interface SinkProcessor extends Processor {

    void setSinks(List<Sink> sinks);
}
