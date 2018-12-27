package com.onlinebooking.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="subscriber")
public class Subscriber {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int subscriberId;
	
	@NotNull(message="block is required")
	@Column(name="first_name")
	private String firstName;
	
	@NotNull(message="block is required")
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="telephone")
	private int telephone;
	
	@NotNull(message="block is required")
	@Column(name="Email")
	private String email;
	
	@OneToMany(mappedBy="subscriber")
	private List<Flight> flights;
	public Subscriber() {
		
	}

	public Subscriber(String firstName, String lastName, int telephone, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.email = email;
	}

	public int getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
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

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
