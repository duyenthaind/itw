package com.sample.itw.designpattern.observer;

/**
 * @author duyenthaind
 */
public interface EventPublisher {
    void subscribe(EventListener listener);

    void unsubscribe(EventListener listener);

    void notifyChange(EventContext eventContext);
}
