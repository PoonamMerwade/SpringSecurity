package com.cts.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bank.entity.BankAccount;
import com.cts.bank.service.BankService;

@RestController
public class BankController {
	
	@Autowired
	BankService bankService;
	
	@PostMapping("/account/add")
	public void addAccount(BankAccount account){
		bankService.addAccount(account);
	}
	
	@PutMapping("/account/update")
	public void updateAccount(BankAccount account){
		bankService.updateAccount(account);
	}
}
