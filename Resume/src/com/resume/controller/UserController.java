package com.resume.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.resume.model.User_info;
import com.resume.service.UserService;

@Controller
public class UserController {
	
	/*
	 * spring自动扫描注入bean
	 */
	@Autowired
	public UserService userservice;
	
	//登录
	@RequestMapping("/login")
	//User_info user用于获取表单信息，这是其中一种方法，用实体类来接收
	public String login(User_info user,HttpSession session){
		String ret = "";
		System.out.println("user"+user.getName());
		//调用service的登录方法
		User_info loginuser = userservice.login(user.getName());
		//将登录者放入session，向后面的功能模块传递
		session.setAttribute("loginuser", loginuser.getUserid());
		//验证用户和密码
		if(user.getName() != null){
			if(loginuser.getName().equals(user.getName()) && loginuser.getPassword().equals(user.getPassword())){
				//返回的是xxx.jsp中的xxx字段
				ret = "basic";
			}else{
				ret = "error";
			}
		}
		return ret;	
	}
	
}
