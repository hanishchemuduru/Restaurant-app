package com.ordermyfood.usermanagementservice.controller;


import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.ordermyfood.usermanagementservice.model.UserPersonalDetails;
import com.ordermyfood.usermanagementservice.service.UserManagementServiceImpl;


@RestController
@RequestMapping("/usermanagementservice")

public class UserManagementController {
	
	@Autowired
	 UserManagementServiceImpl userManagementServiceImpl;
	
	@Autowired
	RestTemplate restTemplate;
	
		@PostMapping("/insertUsers")
		@HystrixCommand(fallbackMethod = "defaultsMe", commandProperties = {
				@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
				})
//		@HystrixCommand(fallbackMethod="defaultsMe")
		public UserPersonalDetails insertUserPersonalDetails(@RequestBody UserPersonalDetails userPersonalDetails) {
				
				String url = "http://localhost:3333/search/SearchFor";
				UserPersonalDetails emp =restTemplate.getForObject(url, UserPersonalDetails.class); 
				return emp;
			
//				return userManagementServiceImpl.insertUserPersonalDetails(userPersonalDetails);
			}
		
		@GetMapping("/getusers/{userid}")
		public Optional<UserPersonalDetails> getUserPersonalDetailsById(@PathVariable("userid") int userid) {
			return userManagementServiceImpl.getUserPersonalDetailsById(userid);
		}
		
		@PostMapping("/updatepassword/{userid}/{newpassword}/{oldpassword}")
		public Integer updatePassword(@PathVariable("userid") int userid,@PathVariable("newpassword") String newpassword,
				@PathVariable("oldpassword") String oldpassword){
			return userManagementServiceImpl.updatePassword(userid, newpassword, oldpassword);
		}
		
	
	    public UserPersonalDetails defaultsMe(UserPersonalDetails userPersonalDetails) {
		  return userManagementServiceImpl.insertUserPersonalDetails(userPersonalDetails);
	    }
	 
}
