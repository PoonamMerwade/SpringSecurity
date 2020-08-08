package com.cts.bank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(description = "This is the bank account model")
@Entity(name="account")
public class BankAccount {
	
	@Id
	@ApiModelProperty(value = "Id of the customer")
	private int bankId;
	
	@ApiModelProperty(value="Name of the Bank")
	private String bankName;
	
	@ApiModelProperty(value="Account number of the customer")
	private String accountNumber;
	
	@ApiModelProperty(value="IFSC code of the bank")
	private String IFSCCode;
	
	@ApiModelProperty(value="MICR code of the bank")
	private String MICRCode;	
}
