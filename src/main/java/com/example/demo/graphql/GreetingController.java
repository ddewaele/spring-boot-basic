package com.example.demo.graphql;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@Controller
public class GreetingController {

	@QueryMapping
	public String greeting() {
		return "Hello";
	}

}