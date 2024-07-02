package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

	 public List<Customer> findByNameEquals(String name);
	 public List<Customer> readByCaddIs(String cadd);
	 public List<Customer> readByCadd(String cadd);
	 
	 
	 public List<Customer> findByNameStartingWith(String initialChars);
	 public List<Customer> findByNameEndingWith(String endChars);
	 public List<Customer> findByNameContaining(String chars);
	 public List<Customer> findByNameEqualsIgnoreCase(String cname);
	 
	 public List<Customer> readByNameLike(String chars);
	 public List<Customer> findByBillAmtBetween(double start, double end);
	 
	 //------------------Having Multiple conditions-----------------------------
	 
	 public List<Customer> findByBillAmtGreaterThanEqualAndBillAmtLessThanEqual(double min,double max);
	 public List<Customer> findByCaddInOrNameLikeIgnoreCase(List<String> addresses,String namePattern);
	 
}
