package com.projct.car.resources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projct.car.model.Admin;
import com.projct.car.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
