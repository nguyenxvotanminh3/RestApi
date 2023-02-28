package com.nguyenminh.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nguyenminh.api.dao.MoistureDao;
import com.nguyenminh.api.entity.Moisture;

@Service
public class MoistureServiceImpl implements MoistureService {
	
	@Autowired
	private MoistureDao moistureDao;
	public MoistureServiceImpl (MoistureDao theMoistureDao) {
		moistureDao = theMoistureDao;
	}
	
	
	@Override
	@Transactional
	public List<Moisture> findAll() {
		return moistureDao.findAll();
	}

	@Override
	@Transactional
	public Moisture findById(int theId) {
		// TODO Auto-generated method stub
		return moistureDao.findById(theId);
	}

	@Override
	@Transactional
	public void save(Moisture theMoisture) {
		moistureDao.save(theMoisture);

	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		moistureDao.deleteById(theId);

	}

}
