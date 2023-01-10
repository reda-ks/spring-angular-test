package lu.atozdigital.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

	@PutMapping("/{id}")
	public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order ordre) {
		Order updatedOrder = orderService.updateOrdre(ordre, id);
		if (updatedOrder == null) {
			return new ResponseEntity<>(updatedOrder, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(updatedOrder, HttpStatus.OK);
	}

}
