package com.xuwenping123.event.dispatcher.core.processor;

import com.xuwenping123.event.dispatcher.core.channel.Channel;

import java.util.List;

public interface ChannelProcessor extends Processor {

    void setChannels(List<Channel> channels);

}
