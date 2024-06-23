package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	public Iterable<Customer> showCustomerSorted(boolean flag, String... properties) {
		// prepare sort object
		Sort sort = Sort.by(flag?Direction.ASC:Direction.DESC,properties);
		// execute the logics
		Iterable<Customer> it= custRepo.findAll(sort);
		
		return it;
	}
	
	
@Override
public Page<Customer> showCustomerByPageNumber(int pageNo, int pageSize,boolean flagOrder,String ...properties) {
	//create  sort object
	Sort sort = Sort.by(flagOrder?Direction.ASC:Direction.DESC,properties);
	
	// create pageable object
	Pageable pageable=  PageRequest.of(pageNo-1, pageSize,sort);
	// get Page<T> object having request page record
	Page<Customer> page= custRepo.findAll(pageable);
	return page;
}

@Override
public void showCustomerDataPageByPage(int pageSize) {
	//get record count
	long count = custRepo.count();
	long pagesCount= count/pageSize;
	if(count%pageSize!=0) {
		pagesCount++;
	}
	//dispaly each page record
	for (int i=0;i<pagesCount;i++) {
		//create pageable object
		Pageable pageable= PageRequest.of(i, pageSize);
		//get and display each pages
		Page<Customer> page= custRepo.findAll(pageable);
		System.out.println("-------------------------"+(i+1)+"/"+page.getTotalPages()+" records are:: "+"--------------------------");
		page.getContent().forEach(System.out::println);
		
	}
}
}
