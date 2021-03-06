package com.cos.reflect.controller;

import com.cos.reflect.anno.RequestMapping;
import com.cos.reflect.controller.dto.JoinDto;
import com.cos.reflect.controller.dto.LoginDto;
import com.cos.reflect.model.User;

public class UserController {
	
	@RequestMapping(value = "/user/join")
	public String join(JoinDto dto) {
		System.out.println("join()함수 호출 됨");
		System.out.println(dto);
		return "/";
	}
	
	@RequestMapping(value = "/user/login")
	public String login(LoginDto dto) {
		System.out.println("login()함수 호출 됨");
		System.out.println(dto);
		return "/";
	}
	
	@RequestMapping(value = "/user/list")
	public String list(User user) {
		System.out.println("list()함수 호출 됨");
		System.out.println(user);
		return "/";
	}
	
	@RequestMapping(value = "/user")
	public String user() {
		System.out.println("user()함수 호출 됨");
		return "/";
	}
	
	@RequestMapping(value = "/hello")
	public String hello() {
		System.out.println("hello()함수 호출 됨");
		return "/";
	}
}
