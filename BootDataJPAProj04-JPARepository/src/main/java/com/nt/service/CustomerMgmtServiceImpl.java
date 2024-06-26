package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
//import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;

@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private ICustomerRepository custRepo;
	
	@Override
	public String deleteCustomersByIdsBatch(List<Integer> ids) {
		List<Customer> list= custRepo.findAllById(ids);
		custRepo.deleteAllByIdInBatch(ids);
		return list.size()+" no ofcustomer records are deleted in batch";
	}
	@Override
	public List<Customer> showCustomersByExampleData(Customer cust,boolean flagOrder,String ...properties) {
		Example<Customer> example= Example.of(cust);
		Sort sort=Sort.by(flagOrder?Direction.ASC:Direction.DESC,properties);
		List<Customer> list = custRepo.findAll(example,sort);
		return list;
	}
	
	@Override
	public Customer showCustomerById(int cno) {
		Customer cust = custRepo.getReferenceById(cno);
		System.out.println(cust.getClass()+"  ....."+cust.getClass().getSuperclass());
		return cust;
	}

}
