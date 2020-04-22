package com.ordermyfood.usermanagementservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ordermyfood.usermanagementservice.model.UserPersonalDetails;
import com.ordermyfood.usermanagementservice.repository.UserManagementRepository;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	@Autowired
	UserManagementRepository userManagementRepository;
	
	public UserPersonalDetails insertUserPersonalDetails(UserPersonalDetails userPersonalDetails) {
		
		System.out.println("'"+userPersonalDetails.getUserName()+"' personal details are stored successfully");
		return userManagementRepository.save(userPersonalDetails);
	}
	
	public Optional<UserPersonalDetails> getUserPersonalDetailsById(int userid) {
	
		System.out.println("'"+userid+"' - personal details");
		return userManagementRepository.findById(userid);
	}
	
	public Integer updatePassword(int userid,String newpassword,String oldpassword){
		
		String oldpwd=userManagementRepository.getOldPassword(userid);
		if(oldpwd.equals(oldpassword))
			return userManagementRepository.upadatePassword(userid, newpassword);
			
		else if (newpassword.equals(oldpassword))
			throw new RuntimeException("new password should be different from old password" );

		else
			throw new RuntimeException("old password is incorrect");
		
	}

}
