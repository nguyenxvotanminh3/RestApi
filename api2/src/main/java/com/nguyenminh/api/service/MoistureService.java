package com.nguyenminh.api.service;

import java.util.List;

import com.nguyenminh.api.entity.Moisture;

public interface MoistureService {
	
	public List<Moisture> findAll();
	
	public Moisture findById(int theId);
	
	public void save(Moisture theMoisture);
	
	public void deleteById(int theId);
}
