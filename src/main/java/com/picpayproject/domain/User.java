package com.picpayproject.domain;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "users")
@Table(name = "users") //Indica o nome da tabela no banco de dados
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	@Column(unique=true) // Indique que a coluna deve ter valores unicos.
	private String document;
	@Column(unique=true)
	private String email;
	private String password;
	private BigDecimal balance;
	
	@Enumerated(EnumType.STRING)
	private UserType userType;
	
	
	public User() {
		
	}


	public User(Long id, String firstName, String lastName, String document, String email, String password,
			BigDecimal balance, UserType userType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.document = document;
		this.email = email;
		this.password = password;
		this.balance = balance;
		this.userType = userType;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDocument() {
		return document;
	}


	public void setDocument(String document) {
		this.document = document;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public BigDecimal getBalance() {
		return balance;
	}


	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}


	public UserType getUserType() {
		return userType;
	}


	public void setUserType(UserType userType) {
		this.userType = userType;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
}
