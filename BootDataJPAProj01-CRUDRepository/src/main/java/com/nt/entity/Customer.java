package com.nt.entity;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="CUSTOMER")
@Data
//@NoArgsConstructor
@RequiredArgsConstructor
public class Customer {

	@Id
  //gives id values 1,2,52,102,152
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "CID")
	private Integer cno;
	
	@NonNull
	@Column(name = "CNAME",length=20)
	private String name;
	@NonNull
	@Column(name = "CADD",length=20)
	private String cadd;
	@NonNull
	@Column(name = "BILLAMT")
	private Float billAmt;
	
	
//	public Customer(String name, String cadd, Float billAmt) {
//		super();
//		this.name = name;
//		this.cadd = cadd;
//		this.billAmt = billAmt;
//	}
	
	
	
}
