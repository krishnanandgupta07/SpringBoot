package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.entity.Customer;

public interface ICustomerMgmtService {

	public Iterable<Customer> showCustomerSorted(boolean flag, String ...properties);
	public Page<Customer> showCustomerByPageNumber(int pageNo, int pageSize,boolean flagOrder,String ...properties);
	public void showCustomerDataPageByPage(int pageSize);
}
 