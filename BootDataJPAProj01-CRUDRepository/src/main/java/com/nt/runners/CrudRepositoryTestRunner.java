package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.ICustomerMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService custService;
	
	@Override
	public void run(String... args) throws Exception {
		//invoke the service method
		/*		try {
					Customer cust= new Customer();
					cust.setName("himanshu");
					cust.setBillAmt(19000.0f);
					cust.setCadd("bengalure");
					String resultMsg=custService.registerCustomer(cust);
					System.out.println(resultMsg);
				}//try
				catch (Exception e) {
					e.printStackTrace();
				}
				*/
		/*	try {
				System.out.println("count of records::"+custService.fetchCustomerCount());
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}*/
		/*	try {
			System.out.println("Record of customer of id is available  "+custService.checkCustomerAvailability(952));
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}*/
		/*	try {
				System.out.println("--------------Customer details-----------------");
				System.out.println(custService.showAllCustomerData());
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}*/
		
		/*		try {
					Iterable<Customer> it=custService.showAllCustomerData();
					it.forEach(cust->{
						System.out.println(cust);
						System.out.println("--------------------------------------");
						it.forEach(System.out::println);
						System.out.println("--------------------------------------");
						for(Customer custo:it) {
							System.out.println(custo);
						}
					});
					}catch (Exception e) {
						e.printStackTrace();
					}*/
		
		/*	try {
				custService.showCustomerById(List.of(1,2,1002,1052,1000)).forEach(System.out::println);;
			}catch (Exception e) {
				e.printStackTrace();
			}*/
		
		/*		try {
					
					Customer c1= new Customer("rani","hyd",8999.0f);
					Customer c2= new Customer("raja","chennai",9999.0f);
					Customer c3= new Customer("richa","delhi",5097.0f);
					Customer c4= new Customer("sanjana",null,7599.0f);
					Customer c5= new Customer("manish","bihar",null);
					
					List<Customer> custList = List.of(c1,c2,c3,c4,c5);
					String msg= custService.registerGroupCustomers(custList);
					System.out.println(msg);
				}catch (Exception e) {
					e.printStackTrace();
				}*/
		
		try {
			Customer customer= custService.showCustomerById(1052);
			System.out.println(customer);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}
