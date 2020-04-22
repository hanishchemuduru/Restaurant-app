package com.om.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class DeliveryBoyDetail {
	
	Integer int_id;
	String deliveryBoyName;
	Integer phoneNumber;
	
	
	public Integer getInt_id() {
		return int_id;
	}


	public void setInt_id(Integer int_id) {
		this.int_id = int_id;
	}


	public String getDeliveryBoyName() {
		return deliveryBoyName;
	}


	public void setDeliveryBoyName(String deliveryBoyName) {
		this.deliveryBoyName = deliveryBoyName;
	}


	public Integer getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

	public DeliveryBoyDetail() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DeliveryBoyDetail(Integer int_id, String deliveryBoyName, Integer phoneNumber) {
		super();
		this.int_id = int_id;
		this.deliveryBoyName = deliveryBoyName;
		this.phoneNumber = phoneNumber;
	}
	

	
	

}
