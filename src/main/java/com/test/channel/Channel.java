package com.test.channel;

import com.test.message.Message;

public interface Channel<E extends Message> {
	public void dispatch(E message);
}
