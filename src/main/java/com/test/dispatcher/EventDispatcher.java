package com.test.dispatcher;

import java.util.HashMap;
import java.util.Map;

import com.test.channel.Channel;
import com.test.event.Event;
import com.test.handler.Handler;
import com.test.router.Router;

public class EventDispatcher implements Router<Event> {
	
    private Map<Class<? extends Event>, Handler> handlers;

    public EventDispatcher() {
        handlers = new HashMap<Class<? extends Event>, Handler>();
    }

    @Override
    public void registerChannel(Class<? extends Event> contentType,
            Channel<? extends Event> channel) {
        handlers.put(contentType, (Handler)channel);
    }

    @Override
    public void dispatch(Event content) {
        handlers.get(content.getClass()).dispatch(content);
    }
}
