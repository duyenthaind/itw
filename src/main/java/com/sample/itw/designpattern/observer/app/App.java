package com.sample.itw.designpattern.observer.app;

import com.sample.itw.designpattern.observer.EventContext;
import com.sample.itw.designpattern.observer.EventListener;
import com.sample.itw.designpattern.observer.common.EventType;
import com.sample.itw.designpattern.observer.impl.AlertListener;
import com.sample.itw.designpattern.observer.impl.EventManager;
import com.sample.itw.designpattern.observer.impl.LoggingListener;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author duyenthai
 */
public class App {
    private EventManager eventManager;
    private final Map<String, EventListener> eventListeners = new HashMap<>();

    public void init() {
        eventManager = new EventManager();
        EventListener alertListener = new AlertListener();
        EventListener loggingListener = new LoggingListener();
        eventManager.subscribe(alertListener);
        eventManager.subscribe(loggingListener);
        eventListeners.put("alert", alertListener);
        eventListeners.put("logging", loggingListener);
    }

    public void triggerAnEvent() {
        EventContext eventContext = new EventContext.Builder()
                .withEventType(EventType.randomEventType())
                .withMessage(UUID.randomUUID() + "-MESSAGE")
                .build();
        eventManager.notifyChange(eventContext);
    }

    public void stop() {
        eventListeners.values().forEach(val -> eventManager.unsubscribe(val));
        System.out.println("Stop done!!!");
    }

    public void start() {
        init();
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < TimeUnit.MINUTES.toMillis(5)) {
            triggerAnEvent();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception ex) {
                System.err.println("Exception " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
