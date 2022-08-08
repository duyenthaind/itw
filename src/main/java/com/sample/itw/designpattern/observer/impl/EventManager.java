package com.sample.itw.designpattern.observer.impl;

import com.sample.itw.designpattern.observer.EventContext;
import com.sample.itw.designpattern.observer.EventListener;
import com.sample.itw.designpattern.observer.EventPublisher;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author duyenthaind
 */
public class EventManager implements EventPublisher {

    private final List<EventListener> eventListeners = new CopyOnWriteArrayList<>();

    @Override
    public void subscribe(EventListener listener) {
        synchronized (eventListeners) {
            if (!eventListeners.contains(listener)) {
                eventListeners.add(listener);
            }
        }

    }

    @Override
    public void unsubscribe(EventListener listener) {
        eventListeners.remove(listener);
    }

    @Override
    public void notifyChange(EventContext eventContext) {
        eventListeners.forEach(val -> val.onReceiveEventUpdate(eventContext));
    }
}
