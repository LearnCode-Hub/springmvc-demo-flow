package com.learncode.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping("/")
	public String welcome() {
		return "welcome-page";
	}
}
