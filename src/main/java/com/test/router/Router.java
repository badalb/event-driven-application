package com.test.router;

import com.test.channel.Channel;
import com.test.message.Message;

public interface Router<E extends Message> {
	public void registerChannel(Class<? extends E> contentType,
			Channel<? extends E> channel);

	public abstract void dispatch(E content);
}
