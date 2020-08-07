package com.cts.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "This is the customer model")
@Entity(name="customer")
public class Customer {
	
	@Id
	@ApiModelProperty(value = "Id of the customer")
	private int customerId;
	
	@ApiModelProperty(value = "first name of the customer")
	private String firstName;
	
	@ApiModelProperty(value = "last name of the customer")
	private String lastName;
	
	@ApiModelProperty(value = "PAN of the customer")
	private String userName;
	
	@ApiModelProperty(value = "password of the customer")
	private String password;
	
	@ApiModelProperty(value = "Email Id of the customer")
	private String emailId;
	
	@ApiModelProperty(value = "DOB of the customer")
	private Date DOB;
	
	@ApiModelProperty(value = "Phone of the customer")
	private String phoneNumber;

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String userName, String password, String emailId,
			Date dOB,String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		DOB = dOB;
		this.phoneNumber=phoneNumber;
	}
}
