package com.nguyenminh.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nguyenminh.api.entity.Moisture;
import com.nguyenminh.api.service.MoistureService;

@RestController
@RequestMapping("/api")
public class Controller {

private MoistureService moistureService;
	@Autowired
	public Controller (MoistureService theMoistureService) {
		moistureService = theMoistureService;
	}
	
	@GetMapping("/detail")
	public List<Moisture> findAll(){
		return moistureService.findAll();
	} 
	
	// get/ moistureID
	
	@GetMapping("detail/{moistureId}")
	public Moisture getMoisture(@PathVariable int moistureId) {
		Moisture theMoisture = moistureService.findById(moistureId);
		if(theMoisture == null) {
			throw new RuntimeException("Moisture id did not found");
			

	}
		return theMoisture;
}
	// add new moisture 
	@PostMapping("/updatedetail")
	public Moisture addMoisture(@RequestBody Moisture theMoisture) {
		// set id to 0 
		
		// force to save new item
		
		theMoisture.setId(0);
		moistureService.save(theMoisture);
		return theMoisture;
	}
	
	//update moisture
	@PutMapping("/updatedetail")
	public Moisture updateMoisture(@RequestBody Moisture theMoisture) {
		moistureService.save(theMoisture);
		return theMoisture;
	}
	
	// delete moisture
	@DeleteMapping("/updatedetail/{moistureId}")
	public String deleteMoisture(@PathVariable int moistureId) {
		Moisture tempMoisture = moistureService.findById(moistureId);
		// throw exception
		if (tempMoisture == null) {
			throw new RuntimeException("no moisture");
			
		}
		moistureService.deleteById(moistureId);
		return "delete moisture id - " + moistureId;
	}
}