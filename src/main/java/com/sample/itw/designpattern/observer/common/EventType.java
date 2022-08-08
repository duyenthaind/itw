package com.sample.itw.designpattern.observer.common;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author duyenthai
 */
public enum EventType {
    SAVE,
    UPDATE,
    DELETE,
    ;

    public static EventType randomEventType() {
        int pickedIndex = ThreadLocalRandom.current().nextInt(values().length);
        return values()[pickedIndex];
    }
}
