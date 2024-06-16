package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;

public interface ICustomerMgmtService {

	public String registerCustomer(Customer cust);
	public long fetchCustomerCount();
	public boolean checkCustomerAvailability(int cid);
	public Iterable<Customer> showAllCustomerData();
	public Iterable<Customer> showCustomerById(Iterable<Integer> ids);
	public String registerGroupCustomers(List<Customer> custList);
	public Customer showCustomerById(Integer id);
}
 