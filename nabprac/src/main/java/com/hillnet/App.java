package com.hillnet;

import com.google.common.eventbus.EventBus;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        EventBus eventBus = new EventBus();

        EventListener listener = new EventListener();
        eventBus.register(listener);
    }
}
