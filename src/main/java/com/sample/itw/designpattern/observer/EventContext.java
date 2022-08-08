package com.sample.itw.designpattern.observer;

import com.sample.itw.designpattern.observer.common.EventType;

/**
 * @author duyenthaind
 */
public class EventContext {
    private final EventType eventType;
    private final String message;

    private EventContext(Builder builder) {
        this.eventType = builder.eventType;
        this.message = builder.message;
    }

    public EventType getEventType() {
        return eventType;
    }

    public String getMessage() {
        return message;
    }

    public static class Builder {
        private EventType eventType;
        private String message;

        public Builder withEventType(EventType eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public EventContext build() {
            return new EventContext(this);
        }
    }

}
