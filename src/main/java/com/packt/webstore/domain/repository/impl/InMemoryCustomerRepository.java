/*package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	
	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository() {
		
		Customer a = new Customer("C1234", "Adam Kowalski", true);
		Customer b = new Customer("C1235", "Miros³aw Bu³ka", true);
		Customer c = new Customer("C1236", "Alina Maziakowa", false);
		
		listOfCustomers.add(a);
		listOfCustomers.add(b);
		listOfCustomers.add(c);
	}

	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}
	
	public Customer getCustomerById(String customerId) {
		Customer customerById = null;
		
		for(Customer customer : listOfCustomers) {
			if(customer != null && customer.getCustomerId() != null && customer.getCustomerId().equals(customerId))
			{
				break;
			}
			if(customerById == null) {
				throw  new IllegalArgumentException("Brak klienta o wskazanym id: " + customerId);
				}
		}
		return customerById;
	}
}*/
