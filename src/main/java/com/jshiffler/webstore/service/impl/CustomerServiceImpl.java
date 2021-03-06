package com.jshiffler.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jshiffler.webstore.domain.Customer;
import com.jshiffler.webstore.repository.CustomerRepository;
import com.jshiffler.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService, CustomerRepository {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}

}
