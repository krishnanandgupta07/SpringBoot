package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;

public class CRUDTestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorService docService;
	
	@Override
	public void run(String... args) throws Exception {
		
		

		try {
			//create Doctor class object 
			Doctor doctor = new Doctor();
			doctor.setDocName("RAM");
			doctor.setSpecialization("MD-CARDIO");
			doctor.setIncome(1000000.0);
			//invoke b method
			String result= docService.registerDoctor(doctor);
			System.out.println(result);
			
		}//try
		catch (Exception e) {
			e.printStackTrace();
		
		}
		
	}

}
