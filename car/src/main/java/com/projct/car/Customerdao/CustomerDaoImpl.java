package com.projct.car.Customerdao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projct.car.model.Car;
import com.projct.car.model.Customer;
import com.projct.car.resources.CarRepository;
import com.projct.car.resources.CustomerRepository;

@Component
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CarRepository carRepository;

	@Override
	public boolean signup(Customer customer) {
		List<Customer> list = customerRepository.findAll();
		for (Customer cust : list) {
			if ((customer.getEmail().equals(cust.getEmail()))) { 
				System.out.println(customer);
				return false;
			}
			

		}
		System.out.println(customer);
		customerRepository.save(customer);
		return true;
	}
    

}
