package com.ordermyfood.usermanagementservice.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ordermyfood.usermanagementservice.model.UserPersonalDetails;

@Repository
@Transactional
public interface UserManagementRepository extends JpaRepository<UserPersonalDetails, Integer> {
	
	@Modifying
	@Query(value = "Update UserPersonalDetails set Password=?2 where id=?1")
	public Integer upadatePassword(Integer userid, String newpassword);
	
	@Query(value = "Select password from UserPersonalDetails where id=?1")
	public String getOldPassword(Integer userid);
}
