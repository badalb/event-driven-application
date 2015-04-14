package com.test.main;

import com.test.dispatcher.EventDispatcher;
import com.test.event.Event;
import com.test.handler.Handler;

public class EventRunner {
    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();
        dispatcher.registerChannel(Event.class, new Handler());
        dispatcher.dispatch(new Event());
    }
}