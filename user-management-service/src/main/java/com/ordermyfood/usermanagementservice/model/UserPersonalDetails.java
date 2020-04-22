package com.ordermyfood.usermanagementservice.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
public class UserPersonalDetails implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="user_name",nullable=false)
    @NotEmpty()
	private String userName;
	@NotNull
	@Size(min=5,max=10)
	@Column(name="password")
	private String password;
	@Column(name="address_line1")
	private String addressLine1;
	@Column(name="address_line2")
	private String addressLine2;
	@Column(name="email_address",nullable=false, unique=true)
    @NotEmpty
    @Email(message="{errors.invalid_email}")
	private String emailAddress;
	@Column(name="mobile_number",nullable=false, unique=true)
	private Long mobileNumber;

	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
       name="user_role",
       joinColumns = {@JoinColumn(name="USER_ID", referencedColumnName="ID")},
       inverseJoinColumns = {@JoinColumn(name="ROLE_ID", referencedColumnName="ID")})
      
	private List<Roles> roles;	

	public UserPersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserPersonalDetails(Integer id, @NotEmpty String userName, @Size(min = 5, max = 10) String password,
			String addressLine1, String addressLine2,
			@NotEmpty @Email(message = "{errors.invalid_email}") String emailAddress, Long mobileNumber,
			List<Roles> roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
		this.roles = roles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}


	
}
