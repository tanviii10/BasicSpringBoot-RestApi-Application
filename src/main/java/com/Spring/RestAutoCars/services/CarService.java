package com.Spring.RestAutoCars.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.RestAutoCars.Repositories.CarRepo;
import com.Spring.RestAutoCars.entities.Cars;

@Service
public class CarService {
	
	@Autowired
	private CarRepo carRepo;
	
	public List<Cars> getAllCars()
	{
		return carRepo.findAll();
	}
	
	public List<Cars> searchCars(String company)
	{
		return carRepo.findByCompany(company);
	}
	
	public Cars addNewCar(Cars car)
	{
		return carRepo.save(car);
	}
}
