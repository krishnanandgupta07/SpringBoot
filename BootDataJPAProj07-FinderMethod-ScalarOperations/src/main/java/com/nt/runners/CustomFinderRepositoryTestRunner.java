package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;


@Component
public class CustomFinderRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private ICustomerRepository custRepo;
	
	@Override
	public void run(String... args) throws Exception {

		//List<Customer> custList= custRepo.findByNameEquals("rahul");
		//custList.forEach(System.out::println);
		
		/*				System.out.println("--------------------------------------------");
						
						custRepo.readByCaddIs("bengalure").forEach(System.out::println);
						
						System.out.println("--------------------------------------------");
						custRepo.findByNameStartingWith("r").forEach(System.out::println);
						System.out.println("--------------------------------------------");
						custRepo.findByNameEndingWith("u").forEach(System.out::println);
						System.out.println("--------------------------------------------");
						custRepo.findByNameContaining("s").forEach(System.out::println);
						System.out.println("--------------------------------------------");
						custRepo.findByNameEqualsIgnoreCase("RAHUL").forEach(System.out::println);*/
		
				custRepo.readByNameLike("%m%").forEach(System.out::println);
				System.out.println("--------------------------------------------");
				System.out.println("--------------------------------------------");
				
				custRepo.findByBillAmtBetween(4000.0, 200000.0).forEach(System.out::println);
				System.out.println("--------------------------------------------");
				System.out.println("--------------------------------------------");
				System.out.println("--------------------------------------------");
				custRepo.findByBillAmtGreaterThanEqualAndBillAmtLessThanEqual(20000.0, 25000.0).forEach(System.out::println);
		
				System.out.println("--------------------------------------------");
				System.out.println("--------------------------------------------");
				System.out.println("--------------------------------------------");

				custRepo.findByCaddInOrNameLikeIgnoreCase(List.of("Hyd","indore"), "%H%").forEach(System.out::println);
	}
}
