package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.ICustomerMgmtService;

@Component
public class PaggingAndSortTestRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService custService;
	
	@Override
	public void run(String... args) throws Exception {
		//invoke the service method
/*	try {
		custService.showCustomerSorted(true, "name").forEach(System.out::println);
		System.out.println("----------------------------------------------");
		custService.showCustomerSorted(false, "cadd").forEach(System.out::println);
		System.out.println("----------------------------------------------");
		custService.showCustomerSorted(true,"name","cadd").forEach(System.out::println);
		
	}catch (Exception e) {
		e.printStackTrace();
	}*/
		
/*	try {
		Page<Customer> page=	custService.showCustomerByPageNumber(1, 4,true,"name");
		Iterable<Customer> it= page.getContent();
		System.out.println("Page No::"+(page.getNumber()+1)+"/"+page.getTotalPages()+" records are");
		it.forEach(System.out::println);
		
		System.out.println("Total number of pages::"+page.getTotalPages());
		System.out.println("Current page number ::"+page.getNumber()+1);
		System.out.println("Total number of records::"+page.getTotalElements());
		System.out.println("number of record in current page::"+page.getNumberOfElements());
		System.out.println("Is it the first page::"+page.isFirst());
		System.out.println("Is it the last page::"+page.isLast());
		
	}catch (Exception e) {
		e.printStackTrace();
	}*/
	
		try {
			custService.showCustomerDataPageByPage(3);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
