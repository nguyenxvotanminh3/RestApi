package com.nguyenminh.api.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nguyenminh.api.entity.Moisture;

import jakarta.persistence.EntityManager;

@Repository
public class MoistureDaoImpl implements MoistureDao {
	
		private EntityManager entityManager;
		
		@Autowired
		public MoistureDaoImpl(EntityManager theEntityManager) {
			entityManager = theEntityManager;
		}
		

	@Override

	public List<Moisture> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Moisture> theQuery = 
				currentSession.createQuery("from Moisture", Moisture.class);
		
		List<Moisture> moistures = theQuery.getResultList();
		return moistures;
	}


	@Override
	public Moisture findById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		Moisture theMoisture = currentSession.get(Moisture.class, theId);
		
		return theMoisture;
	}


	@Override
	public void save(Moisture theMoisture) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theMoisture);
	}


	@Override
	public void deleteById(int theId) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query theQuery =
					currentSession.createQuery(
								"delete from Moisture where id=: moistureId");
		theQuery.setParameter("moistureId", theId);
		theQuery.executeUpdate();
	}

}