package lu.atozdigital.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.atozdigital.model.Article;
import lu.atozdigital.model.Order;
import lu.atozdigital.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderRessource {
	@Autowired
	private OrderService orderService;

	// get all orders
	@GetMapping
	public List<Order> getAllOrder() {
		List<Order> order = new ArrayList<Order>();
		order = orderService.findAllOrder();
		return order;
	}

	@PostMapping
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		Order neworder = orderService.addOrder(order);
		return new ResponseEntity<>(neworder, HttpStatus.CREATED);
	}

}
