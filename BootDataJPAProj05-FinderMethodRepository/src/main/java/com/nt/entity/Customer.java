package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="CUSTOMER")
@Data
public class Customer {

	@Id
  //gives id values 1,2,52,102,152
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CID")
	private Integer cno;
	@Column(name = "CNAME",length=20)
	private String name;
	@Column(name = "CADD",length=20)
	private String cadd;
	@Column(name = "BILLAMT")
	private Float billAmt;
	
	
	
	public Customer() {
		System.out.println("Customer:: 0-param constructor-->"+this.getClass());
	}
	
	
	
}
