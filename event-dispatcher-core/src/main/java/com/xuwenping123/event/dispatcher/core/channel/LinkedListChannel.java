package com.xuwenping123.event.dispatcher.core.channel;

import com.xuwenping123.event.dispatcher.core.Configuration;
import com.xuwenping123.event.dispatcher.core.event.Event;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListChannel implements Channel {

    private Configuration configuration;

    private LifeState lifeState;

    private LinkedList<? extends Event> container;

    public LinkedListChannel() {
        lifeState = LifeState.IDLE;
    }

    @Override
    public void put(List<? extends Event> events) {

    }

    @Override
    public List<? extends Event> take() {
        return null;
    }

    @Override
    public void setConfiguration(Configuration config) {
        this.configuration = config;
    }

    @Override
    public String getComponentName() {
        return null;
    }

    @Override
    public void start() {
        container = new LinkedList<>();
        lifeState = LifeState.ALIVE;
    }

    @Override
    public void stop() {
        lifeState = LifeState.DEAD;
        container.clear();
    }

    @Override
    public LifeState lifeState() {
        return lifeState;
    }
}
