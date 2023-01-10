package lu.atozdigital.service;

import java.util.List;
import java.util.Optional;

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

	public Order updateOrdre(Order ordre, Long id) {
		Optional<Order> ord = orderrepo.findById(id);
		ord.get().setReference(ordre.getReference());
		return orderrepo.save(ord.get());
	}

}
