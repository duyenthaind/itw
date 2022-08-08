package com.sample.itw.designpattern.observer.impl;

import com.sample.itw.designpattern.observer.EventContext;
import com.sample.itw.designpattern.observer.EventListener;
import com.sample.itw.designpattern.observer.common.EventType;

/**
 * @author duyenthaind
 */
public class AlertListener implements EventListener {
    @Override
    public void onReceiveEventUpdate(EventContext context) {
        if (context.getEventType() == EventType.DELETE) {
            System.out.println("[Alert-Subscriber]Get alert, this is danger ===>!!!!!! " + context.getMessage());
        }
    }
}
