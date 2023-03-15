package com.xuwenping123.event.dispatcher.core.source;

import com.xuwenping123.event.dispatcher.core.Configuration;
import com.xuwenping123.event.dispatcher.core.component.Component;
import com.xuwenping123.event.dispatcher.core.event.Event;
import com.xuwenping123.event.dispatcher.core.processor.Processor;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ScheduledPolledSource implements PolledSource {

    private Configuration configuration;

    private Processor processor;

    private Component.LifeState lifeState;

    private ScheduledExecutorService scheduledExecutorService;

    public ScheduledPolledSource(ScheduledExecutorService scheduledExecutorService) {
        this.scheduledExecutorService = scheduledExecutorService;
        this.lifeState = Component.LifeState.IDLE;
    }

    @Override
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public void setConfiguration(Configuration config) {
        this.configuration = config;
    }

    @Override
    public void start() {
        this.lifeState = Component.LifeState.ALIVE;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.schedule(
                    () -> {
                        boolean status;
                        List<? extends Event> events = null;
                        while (lifeState == Component.LifeState.ALIVE) {
                            status = true;
                            try {
                                events = poll();
                                processor.process(events);
                            } catch (Throwable throwable) {
                                status = false;
                                if (throwable instanceof Error) {
                                    throw throwable;
                                }
                            } finally {
                                submit(status, events);
                            }
                        }
                    },
                    configuration.getPolledSourceConfig().getScheduledPolledFrequency(),
                    TimeUnit.MILLISECONDS
            );
        }
    }

    @Override
    public void stop() {
        this.lifeState = Component.LifeState.DEAD;
        if (scheduledExecutorService != null
                && !scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdown();
        }
    }


}
