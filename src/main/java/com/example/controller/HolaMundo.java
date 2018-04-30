package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {

	@RequestMapping("/hola")
	String hola() {
		return "Hola Deyviz";
	}

}
