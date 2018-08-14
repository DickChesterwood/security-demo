package com.virtualpairprogrammers.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtualpairprogrammers.domain.Customer;
import com.virtualpairprogrammers.services.calls.CallHandlingService;
import com.virtualpairprogrammers.services.customers.CustomerManagementService;
import com.virtualpairprogrammers.services.diary.DiaryManagementService;

public class SimpleClientTest {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("application.xml");

		try
		{
			CustomerManagementService customerService = container.getBean(CustomerManagementService.class);

			List<Customer> all = customerService.getAllCustomers();
			for (Customer next: all)
			{
				System.out.println(next);
			}
			
		}
		finally
		{
			container.close();
		}
	}

}
