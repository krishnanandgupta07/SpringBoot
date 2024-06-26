package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Customer;
import com.nt.service.ICustomerMgmtService;

@Component
public class JpaRepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private ICustomerMgmtService custService;
	
	@Override
	public void run(String... args) throws Exception {
		/*	try {
			String msg=custService.deleteCustomersByIdsBatch(List.of(2952,2953,2954,2955));
			System.out.println(msg);
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}*/
		
/*		try {
			Customer cust= new Customer();
			cust.setName("rahul");cust.setCadd("Hyd");
			List<Customer> list = custService.showCustomersByExampleData(cust, true, "billAmt");
			list.forEach(System.out::println);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}*/
		try {
			Customer cust= custService.showCustomerById(1);
			System.out.println(cust.getClass()+ "......"+cust.getClass().getSuperclass()+"  .....From Runner Test");
			System.out.println(cust.getBillAmt());
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
