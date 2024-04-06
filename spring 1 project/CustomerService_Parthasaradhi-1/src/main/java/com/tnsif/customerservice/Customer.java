package com.tnsif.customerservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer 
{
	//to give annotation
	@Id
	@Column(name="Cid")
	private int cid;
	@Column(name="Cname")
	private String cname;
	@Column(name="Caddress")
	private String address;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String address) {
		super();
		this.cid = id;
		this.cname = name;
		this.address = address;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}

	
	
}
