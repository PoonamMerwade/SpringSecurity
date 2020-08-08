package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cts.entity.Customer;
import com.cts.entity.CustomerDetailsPrincipal;
import com.cts.repository.CustomerRepository;

@Service
public class CustomerService implements UserDetailsService{

	@Autowired
	CustomerRepository customerRepository;
	
	public void addCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}

	public void deleteCustomer(String userName) {
		customerRepository.deleteCustomer(userName);
		
	}

	public void updateCustomer(Customer customer) {
		customerRepository.save(customer);
		
	}
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Customer customer=customerRepository.findUserByUserName(username);
		if(customer==null){
			throw new UsernameNotFoundException("No user found");
		}
		return new CustomerDetailsPrincipal(customer);
	}

	public List<Customer> getAllCustomer() {
		return (List<Customer>)customerRepository.findAll();
	}

}
