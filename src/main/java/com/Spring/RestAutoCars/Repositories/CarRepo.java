package com.Spring.RestAutoCars.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.RestAutoCars.entities.Cars;

@Repository
public interface CarRepo extends JpaRepository<Cars, String>{
	
	List<Cars> findByCompany(String company);

}
