package com.mc.ovfc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mc.ovfc.model.CustomerDetails;
import com.mc.ovfc.repository.CustomerRepo;
import com.mc.ovfc.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public List<CustomerDetails> getcustomers() {
		return customerRepo.findAll();
	}

	@Override
	public Optional<CustomerDetails> getCustomerById(Long customerId) {
		return customerRepo.findById(customerId);
	}

	@Override
	public CustomerDetails updateCustomer(CustomerDetails customer) {
		return customerRepo.save(customer);
	}

	@Override
	public CustomerDetails insertCustomer(CustomerDetails customer) {
		return customerRepo.save(customer);
	}

	@Override
	public void deleteCustomer(Long customerId) {
		customerRepo.deleteById(customerId);
	}

}
