package com.om.service.interfaces;

import com.om.dto.DeliveryDetailDto;
import com.om.dto.MenuItemDto;
import java.util.List;

public interface DeliveryDetail {
	
	DeliveryDetailDto getDelivery(List<MenuItemDto> selectedMenuItem);

}
