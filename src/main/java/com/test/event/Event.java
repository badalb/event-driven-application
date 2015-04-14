package com.test.event;

import com.test.message.Message;

public class Event implements Message {
    @Override
    public Class<? extends Message> getType() {
        return getClass();
    }
}
