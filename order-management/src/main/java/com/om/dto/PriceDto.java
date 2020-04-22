package com.om.dto;

import java.util.Map;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class PriceDto {
	
	String menuItem ;
	Map<String,Double> price;
	Double Tax;
	
	

	public String getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	public Map<String, Double> getPrice() {
		return price;
	}

	public void setPrice(Map<String, Double> price) {
		this.price = price;
	}

	public Double getTax() {
		return Tax;
	}

	public void setTax(Double tax) {
		Tax = tax;
	}

	
	public PriceDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PriceDto(String menuItem, Map<String, Double> price, Double tax) {
		super();
		this.menuItem = menuItem;
		this.price = price;
		Tax = tax;
	}

	
	
}
