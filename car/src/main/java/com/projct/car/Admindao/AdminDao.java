package com.projct.car.Admindao;

import com.projct.car.model.Admin;
import com.projct.car.model.Car;

public interface AdminDao {
	
	public boolean check(Admin admin);
	
	public String edit(Car car);

}
