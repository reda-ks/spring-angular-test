package lu.atozdigital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lu.atozdigital.model.Order;
import lu.atozdigital.repo.OrderRepo;

@Service
public class OrderService {
	@Autowired
	private OrderRepo orderrepo;

	public List<Order> findAllOrder() {
		return orderrepo.findAll();
	}

	public Order addOrder(Order ordre) {
		return orderrepo.save(ordre);
	}

}
