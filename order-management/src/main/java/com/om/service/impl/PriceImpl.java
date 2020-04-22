package com.om.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.om.dto.MenuItemDto;
import com.om.dto.PriceDto;
import com.om.service.interfaces.Price;

public class PriceImpl implements Price {
	
	@Autowired
	PriceDto priceDetail;
	

	@Override
	public PriceDto priceDetail(List<MenuItemDto> menuSelected) 
	{
		Map<String,Double> hm=new HashMap();
		
		for(MenuItemDto m:menuSelected)
		{		
		hm.put("Tax", m.getTax());
		hm.put("Price", m.getPrice());
		hm.put("ItemTotalPrice", (((m.getTax()/100)*(m.getPrice()))+(m.getPrice())));
		priceDetail.setMenuItem(m.getItemName());
		priceDetail.setPrice(hm);
		
		}
		
		return priceDetail;
	}

	public Double allItemsCost(PriceDto price)
	{
		Map<String,Double> newprice=price.getPrice();
		double TotalCost=0.00;
		double sum = 0.0f;
		for (double f : newprice.values()) {
		    sum += f;
		}
		return sum;
		
	}
	
	
	

	

}
