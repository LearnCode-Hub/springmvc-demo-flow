package com.learncode.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/topic")
public class TopicController {

	@RequestMapping("/spring-mvc")
	public String welcome() {
		return "topic";
	}
}
