package com.springrest.springRestQsn_1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController{
	@RequestMapping("/")
     public String display() {
		return "HELLO WORLD";
	}
}
