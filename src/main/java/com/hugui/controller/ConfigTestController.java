package com.hugui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @date : 2017年9月4日
 * @author : hugui
 * @description : TODO
 **/

@RefreshScope
@RestController
public class ConfigTestController {

	@Value("${from}")
	private String from;
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/from")
	public String from(){
		return this.from + " and " + env.getProperty("from", "undefined");
	}
	
}
