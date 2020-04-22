package com.om.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.om.dto.MenuItemDto;
import com.om.dto.DeliveryDetailDto;
import com.om.service.interfaces.DeliveryDetail;

public class DeliveryDetailImpl implements  DeliveryDetail{

	@Autowired
	DeliveryDetailDto dd;
	
	
	/*
	 * @Override public DeliveryDetail getDelivery(List<MenuItemDto>
	 * selectedMenuItem) {
	 * 
	 * for(MenuItemDto m:selectedMenuItem) {
	 * 
	 * }
	 * 
	 * return dd; }
	 */


	@Override
	public DeliveryDetailDto getDelivery(List<MenuItemDto> selectedMenuItem) 
	{
		// TODO Auto-generated method stub
		 Calendar now = Calendar.getInstance();
		 now.add(Calendar.HOUR, 1);
		 dd.setDeliveryTime(now);
		 dd.setRestaurantLocation("JPQL query");
		 dd.setRestaurantName(selectedMenuItem.get(0).getRestaurantName());
		 dd.setRestaurantPhoneNumber(1800902824);//JPQL Query
		 return dd;
	}

	
}
