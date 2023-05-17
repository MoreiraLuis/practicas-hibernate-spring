package com.holamundo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controladorHolaMundo {
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hola Mundo desde Spring Boot";
	}
}