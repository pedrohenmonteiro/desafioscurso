package com.mont.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mont.order.entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;
    
    public double total(Order order) {
        return order.getBasic() + order.getBasic() * order.getDiscount() + shippingService.shipment(order);
    }
}
