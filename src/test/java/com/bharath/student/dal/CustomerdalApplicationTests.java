package com.bharath.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.student.dal.entity.Customer;
import com.bharath.student.dal.repository.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testCreateCustomer() {
		Customer customer=new Customer();
		customer.setName("Joe Doe");
		customer.setEmail("jdow@gmail.com");
		
		customerRepository.save(customer);
	}
	
	@Test
	public void testFindCustomerById() {
		Customer customer = customerRepository.findById(1L).get();
		System.out.println(customer);
	}
	
	
	@Test
	public void testUpdateCustomer() {
		Customer customer = customerRepository.findById(1L).get();
		customer.setEmail("j.doe@gmail.com");
		customerRepository.save(customer);
	}
	
	@Test
	public void testDeleteCustomer() {
		Customer customer = customerRepository.findById(1L).get();
		customerRepository.delete(customer);
	}
	
}
