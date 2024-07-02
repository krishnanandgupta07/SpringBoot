package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Customer;
import com.nt.view.ResultView;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>{

	public List<ResultView> findByBillAmtBetween(double start,double end);
	
}
