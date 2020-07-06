package com.projct.car.resources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projct.car.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
