package com.picpayproject.domain.transaction;

import java.math.BigDecimal;

import com.picpayproject.domain.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "transactions")
@Table(name = "transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private BigDecimal amount;
	
	@ManyToOne
	private User sender;
	
	@ManyToOne
	private User receiver;
	
	
}
