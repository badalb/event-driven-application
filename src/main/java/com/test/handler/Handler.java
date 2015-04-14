package com.test.handler;

import com.test.channel.Channel;
import com.test.event.Event;

public class Handler implements Channel<Event> {
    @Override
    public void dispatch(Event message) {
        System.out.println(message.getClass());
    }
}