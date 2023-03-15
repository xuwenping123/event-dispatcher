package com.xuwenping123.event.dispatcher.core.source;

import com.xuwenping123.event.dispatcher.core.processor.Processor;

import java.util.concurrent.ThreadPoolExecutor;

public abstract class ThreadPolledSource implements PolledSource {

    private Processor processor;

    private ThreadPoolExecutor threadPoolExecutor;

    public ThreadPolledSource(ThreadPoolExecutor executor) {
        this.threadPoolExecutor = executor;
    }

    @Override
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }



}
