package com.ordermyfood.usermanagementservice.service;



import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.ordermyfood.usermanagementservice.model.UserPersonalDetails;

public interface UserManagementService {
	
	public UserPersonalDetails insertUserPersonalDetails(UserPersonalDetails userPersonalDetails);
	public Optional<UserPersonalDetails> getUserPersonalDetailsById(int userid);
	public Integer updatePassword(int userid,String newpassword,String oldpassword);

}
