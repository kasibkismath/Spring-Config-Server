package com.kasibkismath.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MainController {

	@Autowired
	private Environment env;

	@Value("${message:Hello Default}")
	private String message;

	@RequestMapping("/getMessage")
	public String getMessage() {
		return this.message;
	}
}
