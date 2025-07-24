package com.Spring.RestAutoCars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.RestAutoCars.entities.Cars;
import com.Spring.RestAutoCars.services.CarService;

@RestController
@RequestMapping("/auto/api")
public class ControllerClass {
	
	@Autowired
	private CarService carServices;
	
	@GetMapping("/cars")
	public List<Cars> getCars()
	{
		return carServices.getAllCars();
	}
	
	@GetMapping("/search/{company}")
	public List<Cars> getCarsByCompany(@PathVariable String company)
	{
		return carServices.searchCars(company);
	}

	@PostMapping("/add")
	public Cars addCar(@RequestBody Cars obj)
	{
		return carServices.addNewCar(obj);
	}
	
}
