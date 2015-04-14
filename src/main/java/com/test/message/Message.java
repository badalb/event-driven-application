package com.test.message;

public interface Message {
	public Class<? extends Message> getType();
}