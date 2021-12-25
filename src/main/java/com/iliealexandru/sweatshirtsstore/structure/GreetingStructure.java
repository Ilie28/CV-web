package com.iliealexandru.sweatshirtsstore.structure;

public class GreetingStructure {
	
	private final long id;
	private final String content;
	
	public GreetingStructure(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}
}

