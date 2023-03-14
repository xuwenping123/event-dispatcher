package com.xuwenping123.event.dispatcher.core.source;

import com.xuwenping123.event.dispatcher.core.processor.Processor;

public interface Source {

    void setProcessor(Processor processor);
}
