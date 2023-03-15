package com.xuwenping123.event.dispatcher.core;

public class Configuration {

    private PolledSourceConfig polledSourceConfig;

    public PolledSourceConfig getPolledSourceConfig() {
        return polledSourceConfig;
    }

    public void setPolledSourceConfig(PolledSourceConfig polledSourceConfig) {
        this.polledSourceConfig = polledSourceConfig;
    }

    public class PolledSourceConfig {

        private Long scheduledPolledFrequency = 1000L;

        public Long getScheduledPolledFrequency() {
            return scheduledPolledFrequency;
        }

        public void setScheduledPolledFrequency(Long scheduledPolledFrequency) {
            this.scheduledPolledFrequency = scheduledPolledFrequency;
        }
    }

    public class ChannelConfig {

        private Long LinkedListChannel
    }
}
