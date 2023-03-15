package com.xuwenping123.event.dispatcher.core.source;

import com.xuwenping123.event.dispatcher.core.annotations.Nullable;
import com.xuwenping123.event.dispatcher.core.event.Event;

import java.util.List;

public interface PolledSource extends Source {

    List<? extends Event> poll();

    void submit(boolean status, @Nullable List<? extends Event> events);
}

