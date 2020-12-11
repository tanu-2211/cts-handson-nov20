package com.example.springbootunitintegrationtesting;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String defaultMessage() {
		return "Welcome user";
	}
}
