package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.entity.Customer;
import com.cts.service.CustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "The customer Controller", description = "Rest controller for customer")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	
	@ApiOperation(value = "Add a customer", consumes = "A new customer is JSON", notes = "Hit this URL to insert a new customer's details")
	@RequestMapping(method=RequestMethod.POST,value="/customer/add")
	public void addSpecialist(@RequestBody Customer customer){
		customerService.addCustomer(customer);
	}

	@ApiOperation(value = "Delete customer", consumes = "An existing username", notes = "Hit this URL to delete a customer's details")
	@RequestMapping(method=RequestMethod.DELETE,value="/customer/delete/{userName}")
	void deleteCustomerByUserName(@PathVariable String userName){
		customerService.deleteCustomer(userName);
	}
	
	@ApiOperation(value = "Update a customer's details", consumes = "An existing customer in JSON", notes = "Hit this URL to update a customer's details")
	@RequestMapping(method=RequestMethod.PUT,value="/customer/update/{userName}")
	void updateCustomerByUserName(@RequestBody Customer customer){
		customerService.updateCustomer(customer);
	}

	
}
