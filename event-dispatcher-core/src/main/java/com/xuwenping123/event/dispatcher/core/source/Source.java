package com.xuwenping123.event.dispatcher.core.source;

import com.xuwenping123.event.dispatcher.core.Configuration;
import com.xuwenping123.event.dispatcher.core.component.Component;
import com.xuwenping123.event.dispatcher.core.processor.Processor;

public interface Source extends Component {

    void setProcessor(Processor processor);

    void setConfiguration(Configuration config);

    void start();

    void stop();
}
