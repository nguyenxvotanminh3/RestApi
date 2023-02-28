package com.nguyenminh.api.dao;
import com.nguyenminh.api.entity.*;
import java.util.List;
public interface MoistureDao {
	public Moisture findById(int theId);
	public List<Moisture> findAll();
	public void save(Moisture theMoisture);
	public void deleteById(int Id);
}
