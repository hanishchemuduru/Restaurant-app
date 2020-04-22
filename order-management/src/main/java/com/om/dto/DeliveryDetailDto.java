package com.om.dto;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
@Getter
public class DeliveryDetailDto {

	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Calendar deliveryTime;
	private String restaurantName;
	private String restaurantLocation;
	private Integer restaurantPhoneNumber;
	
	
	
	public Calendar getDeliveryTime() {
		return deliveryTime;
	}



	public void setDeliveryTime(Calendar deliveryTime) {
		this.deliveryTime = deliveryTime;
	}




	public String getRestaurantName() {
		return restaurantName;
	}



	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}



	public String getRestaurantLocation() {
		return restaurantLocation;
	}



	public void setRestaurantLocation(String restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}



	public Integer getRestaurantPhoneNumber() {
		return restaurantPhoneNumber;
	}



	public void setRestaurantPhoneNumber(Integer restaurantPhoneNumber) {
		this.restaurantPhoneNumber = restaurantPhoneNumber;
	}

	


	public DeliveryDetailDto() {
		super();
		// TODO Auto-generated constructor stub
	}



	public DeliveryDetailDto(Calendar deliveryTime,String restaurantName,String restaurantLocation, Integer restaurantPhoneNumber) {
		super();
		this.deliveryTime = deliveryTime;
		this.restaurantName = restaurantName;
		this.restaurantLocation = restaurantLocation;
		this.restaurantPhoneNumber = restaurantPhoneNumber;
	}
	
	
	
	
	
}
