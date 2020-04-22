package com.om.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
public class MenuItemDto {
	
	private String itemName;
	private String restaurantName;
	private String type;
	private Double price;
	private Double tax;
	
	public Double getTax() {
		return tax;
	}


	public String getRestaurantName() {
		return restaurantName;
	}


	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}


	public void setTax(Double tax) {
		this.tax = tax;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}

	

	public MenuItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MenuItemDto(String itemName, String restaurantName, String type, Double price, Double tax) {
		super();
		this.itemName = itemName;
		this.restaurantName = restaurantName;
		this.type = type;
		this.price = price;
		this.tax = tax;
	}



	
}
