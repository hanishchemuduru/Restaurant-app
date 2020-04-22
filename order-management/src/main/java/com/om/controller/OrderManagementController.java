package com.om.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.om.dto.DeliveryDetailDto;
import com.om.dto.MenuItemDto;
import com.om.dto.PriceDto;
import com.om.dto.DeliveryBoyDetail;
import com.om.service.interfaces.DeliveryBoy;
import com.om.service.interfaces.DeliveryDetail;
import com.om.service.interfaces.Price;


public class OrderManagementController {

	@Autowired
	Price priceService;
	
	@Autowired
	PriceDto priceForEach;
	
	@Autowired
	DeliveryDetail deliveryDetailService;
	
	@Autowired
	DeliveryDetailDto deliveryDetail;
	double TotalCost=0.0;
	
	@Autowired
	DeliveryBoy deliveryBoyService;
	
	@Autowired
	DeliveryBoyDetail boy;
	
	
	@PostMapping("/order")
	DeliveryDetailDto getDeliveryDetails(@RequestBody List<MenuItemDto> selectedMenuItem)
	{
		priceForEach=priceService.priceDetail(selectedMenuItem);
		TotalCost += priceService.allItemsCost(priceForEach);
		deliveryDetail=deliveryDetailService.getDelivery(selectedMenuItem);
		return deliveryDetail;
	}
	
	@GetMapping("/pay")
	String pay()
	{
		return "Pay the amount Rs:" +TotalCost+"by Cash";
	}
	
	@GetMapping("/deliveryBoy")
	DeliveryBoyDetail getBoy()
	{
		boy.setDeliveryBoyName(deliveryBoyService.getDeliveryBoyName()); 
		boy.setPhoneNumber(9620036);//JPQL query to get the phone number
		return boy;
	}
	
	//I have to use the UserManagement and publish it in Eureka server to do this
	@GetMapping("/user-detail")
	<User> User getUser()
	{
		return null;
	}
	
}
