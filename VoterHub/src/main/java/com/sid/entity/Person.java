package com.sid.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int adhar;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "v_id", unique = true, nullable = true, referencedColumnName = "voter_id")
	private VotingCard voter_id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "house_id", unique = true, nullable = true, referencedColumnName = "houseNo")
	private Address address;

	public Person() {
		super();
	}

	public Person(int adhar, String name) {
		super();
		this.adhar = adhar;
		this.name = name;
	}

	public Person(int adhar, String name, VotingCard voter_id, Address address) {
		super();
		this.adhar = adhar;
		this.name = name;
		this.voter_id = voter_id;
		this.address = address;
	}

	public int getAdhar() {
		return adhar;
	}

	public void setAdhar(int adhar) {
		this.adhar = adhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public VotingCard getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(VotingCard voter_id) {
		this.voter_id = voter_id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

//	@Id
//	private int adhar;
//	private String name;
//
//	@OneToOne(cascade = CascadeType.PERSIST, orphanRemoval = true)
//	@JoinColumn(name = "v_id", referencedColumnName = "voter_id")
//	private VotingCard voter_id;
//
//	@ManyToOne(cascade = CascadeType.PERSIST)
//	@JoinColumn(name = "house_id", referencedColumnName = "houseNo")
//	private Address address;
//
//	public Person() {
//		super();
//	}
//
//	public Person(int adhar, String name) {
//		super();
//		this.adhar = adhar;
//		this.name = name;
//	}
//
//	public Person(int adhar, String name, VotingCard voter_id, Address address) {
//		super();
//		this.adhar = adhar;
//		this.name = name;
//		this.voter_id = voter_id;
//		this.address = address;
//	}
//
//	public int getAdhar() {
//		return adhar;
//	}
//
//	public void setAdhar(int adhar) {
//		this.adhar = adhar;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public VotingCard getVoter_id() {
//		return voter_id;
//	}
//
//	public void setVoter_id(VotingCard voter_id) {
//		this.voter_id = voter_id;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", address=" + address + "]";
	// }

}
