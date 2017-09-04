package com.hugui.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hugui.dto.User;
import com.hugui.service.HelloService;

/**
@date : 2017年8月30日
@author : hugui
@description : TODO
**/

@RestController
public class RefactorHelloController implements HelloService{

	public String hello(@RequestParam("name") String name){
		return "hello " + name;
	}

	public String hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age){
		return "hello " + new User(name, age).toString();
	}

	public String hello(@RequestBody User user){
		return "hello " +  user.toString();
	}

}

