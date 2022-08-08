package com.sample.itw.designpattern.observer.impl;

import com.sample.itw.designpattern.observer.EventContext;
import com.sample.itw.designpattern.observer.EventListener;

import java.util.Date;

/**
 * @author duyenthaind
 */
public class LoggingListener implements EventListener {
    @Override
    public void onReceiveEventUpdate(EventContext context) {
        System.out.println("[Logging-Subscriber]" + new Date()
                + " get event === \n" + String.format("%s - %s", context.getEventType(), context.getMessage()));
    }
}
