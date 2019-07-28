package com.hillnet;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {


    EventBus eventBus = new EventBus();

    EventListener listener = new EventListener();



    @Test
    public void givenStringEvent_whenEventHandled_thenSuccess() {
        eventBus.register(listener);
        eventBus.post("String Event");
        eventBus.post("String Event 1");
        eventBus.post("String Event 2");
        assertEquals(3, listener.getEventsHandled());
    }
}
