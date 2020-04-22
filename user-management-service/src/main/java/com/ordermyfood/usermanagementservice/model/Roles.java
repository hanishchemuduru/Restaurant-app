package com.ordermyfood.usermanagementservice.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Roles implements Serializable{
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    @Column(name="role_name",nullable = false, unique = true)
	    @NotEmpty
	    private String roleName;
	    
	    @ManyToMany(mappedBy = "roles")
	    private List<UserPersonalDetails> userPersonalDetails;

		public Roles() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Roles(Integer id, @NotEmpty String roleName, List<UserPersonalDetails> userPersonalDetails) {
			super();
			this.id = id;
			this.roleName = roleName;
			this.userPersonalDetails = userPersonalDetails;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public List<UserPersonalDetails> getUserPersonalDetails() {
			return userPersonalDetails;
		}

		public void setUserPersonalDetails(List<UserPersonalDetails> userPersonalDetails) {
			this.userPersonalDetails = userPersonalDetails;
		}
	    
	    

	

}
