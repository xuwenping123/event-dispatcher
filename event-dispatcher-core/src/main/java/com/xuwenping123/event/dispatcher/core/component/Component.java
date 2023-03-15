package com.xuwenping123.event.dispatcher.core.component;

import com.xuwenping123.event.dispatcher.core.Configuration;

public interface Component {

    void setConfiguration(Configuration config);

    String getComponentName();

    void start();

    void stop();

    LifeState lifeState();

    enum LifeState {

        ALIVE,

        DEAD,

        IDLE,
    }

}
