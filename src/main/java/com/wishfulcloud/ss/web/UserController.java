package com.wishfulcloud.ss.web;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.wishfulcloud.ss.entity.User;

/**   
 * @Title: 
 * @Description: 
 * @author wangxuezheng
 * @date 2017年3月16日 上午10:13:27
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public @ResponseBody String saveUser(@ModelAttribute("user") User user){
		
		System.out.println(JSON.toJSONString(user));
		
		return "success";
	}
	
	
	@RequestMapping(value = "/getUser")
	public @ResponseBody User getUser(){
		
		User user = new User();
		user.setId("11111");
		user.setUserName("test...");
		
		return user;
	}
	
	
	
	
}
