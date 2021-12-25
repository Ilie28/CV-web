package com.iliealexandru.sweatshirtsstore.WebService;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iliealexandru.sweatshirtsstore.structure.GreetingStructure;

@RestController
public class GreetingController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/greeting")
	public GreetingStructure greeting(@RequestParam(value = "name", defaultValue = "dear customer") String name) {
		return new GreetingStructure(counter.incrementAndGet(), String.format(template, name));
	}
}