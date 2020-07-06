package com.projct.car.Admindao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projct.car.model.Admin;
import com.projct.car.model.Car;
import com.projct.car.resources.AdminRepository;
import com.projct.car.resources.CarRepository;

@Component
public class AdminDaoImpl implements AdminDao {

	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	@Override
	public boolean check(Admin admin) {
		List<Admin> list=adminRepository.findAll();
		for (Admin adm : list) {
			if((admin.getId()==adm.getId()) && (admin.getAdminName().equalsIgnoreCase(adm.getAdminName()) && (admin.getEmail().equals(adm.getEmail()) && (admin.getPassword().equals(adm.getPassword())))))
				return true;
		}
		return false;
	}

	@Override
	public String edit(Car cars) {
		List<Car> carList=carRepository.findAll();
		for (Car car : carList) {
			if(car.getId()==cars.getId()) {
				car.setName(cars.getName());
				car.setSeat(cars.getSeat());
				carRepository.save(car);
				return "EDIT SUCCESSFUL";
			}
			
		}
		return "CAR NOT FOUND";
		
	}
	
	

}
