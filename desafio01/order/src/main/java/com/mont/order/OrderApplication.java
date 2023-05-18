package com.mont.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mont.order.entities.Order;
import com.mont.order.service.OrderService;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner{

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1000, 150.0, 20.0);
		System.out.println("Pedido cógido " + order.getCode() + "\n Valor total: R$" + String.format("%.2f", orderService.total(order)));
	}

}
