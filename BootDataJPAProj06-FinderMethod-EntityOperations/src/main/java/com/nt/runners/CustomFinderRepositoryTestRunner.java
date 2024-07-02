package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;
import com.nt.view.ResultView;


@Component
public class CustomFinderRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private ICustomerRepository custRepo;
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Repository object proxy class name::"+custRepo.getClass().getName());
		List<ResultView> list= custRepo.findByBillAmtBetween(15000.0, 25000.0);
		list.forEach(view->{
			System.out.println(view.getClass());
			System.out.println(view.getCno()+"   :  "+view.getName());
		});
	 
	
	}
}
