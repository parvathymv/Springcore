package com.annotation;

import org.springframework.beans.factory.annotation.Value;

public class HelloWorld {
	@Value("Hello World")
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
