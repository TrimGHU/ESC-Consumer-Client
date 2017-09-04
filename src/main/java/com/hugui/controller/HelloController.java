package com.hugui.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hugui.dto.User;


/**
 * 
 * @author hugui
 * @description HELLO 控制器
 * 2017年8月3日
 */


@RestController
public class HelloController {
	
	@Value("${spring.application.name}")
	private String applicationName;

	@RequestMapping("/hello")
	public String index(){
		return "hello spring boot " + applicationName;
	}
	
	@RequestMapping(value="/hello1" , method = RequestMethod.GET)
	public String index(@RequestParam String name){
		return "hello " + name;
	}
	
	@RequestMapping(value="/hello2" , method = RequestMethod.GET)
	public String index(@RequestHeader String name, @RequestHeader Integer age){
		return new User(name, age).toString();
	}
	
	@RequestMapping(value="/hello3" , method = RequestMethod.POST)
	public String index(@RequestBody User user){
		return user.toString();
	}
}
