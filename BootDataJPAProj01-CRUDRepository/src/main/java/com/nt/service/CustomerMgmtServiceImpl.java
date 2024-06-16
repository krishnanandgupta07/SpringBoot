package com.nt.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;

@Service
public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	@Autowired
	private ICustomerRepository custRepo;
	@Override
	public String registerCustomer(Customer cust) {
	//	System.out.println("proxy class name::"+custRepo.getClass()+"......"+Arrays.toString(custRepo.getClass().getInterfaces()));
		//save the object
		Customer cust1=custRepo.save(cust);
		
		return "Customer is saved (Record inserted) with the id value:"+cust1.getCno();
	}

	
	@Override
	public long fetchCustomerCount() {
		
		return custRepo.count();
	}
	
	@Override
	public boolean checkCustomerAvailability(int cid) {
		// TODO Auto-generated method stub
		return custRepo.existsById(cid);
	}
	
	@Override
	public Iterable<Customer> showAllCustomerData() {
		
		return custRepo.findAll();
	}
	
	@Override
	public Iterable<Customer> showCustomerById(Iterable<Integer> ids) {
		
		return custRepo.findAllById(ids);
	}
	
	@Override
	public String registerGroupCustomers(List<Customer> custList) {
		Iterable<Customer> savedCustList=custRepo.saveAll(custList);
		return custList.size()+" no. of record inserted";
	}
	
	/*	@Override
		public Customer showCustomerById(Integer id) {
			Customer customer= custRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Customer Id"));
			return customer;
		}*/
	
	@Override
	public Customer showCustomerById(Integer id) {
		Optional<Customer> opt= custRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else
			throw new IllegalArgumentException("Invalid id");
	}
}
