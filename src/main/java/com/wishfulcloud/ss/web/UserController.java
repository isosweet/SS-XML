package com.wishfulcloud.ss.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class UserController {
	
	
	@RequestMapping(value = "/getUser")
	public @ResponseBody User getUser(){
		
		User user = new User();
		user.setId("11111");
		user.setUserName("test...");
		
		return user;
	}
}
