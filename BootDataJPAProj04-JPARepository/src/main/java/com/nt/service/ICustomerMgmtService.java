package com.nt.service;

import java.util.List;

import com.nt.entity.Customer;

public interface ICustomerMgmtService {

	public String deleteCustomersByIdsBatch(List<Integer> ids);
	public List<Customer> showCustomersByExampleData(Customer cust,boolean flagOrder,String ...properties);
	public Customer showCustomerById(int cno);
}
 