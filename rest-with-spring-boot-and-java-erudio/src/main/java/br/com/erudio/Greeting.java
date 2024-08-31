package br.com.erudio;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/greeting") 	
public class Greeting {
	private final long id;
	private final String content;
	public Greeting(long id, String content) {
		this.content = content;
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
		
	
}
