package com.om.service.interfaces;

import java.util.List;

import com.om.dto.MenuItemDto;
import com.om.dto.PriceDto;

public interface Price {
	
	public PriceDto priceDetail(List<MenuItemDto> menuSelected);
	public Double allItemsCost(PriceDto price);
}
