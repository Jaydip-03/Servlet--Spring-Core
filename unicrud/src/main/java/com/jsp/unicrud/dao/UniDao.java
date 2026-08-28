package com.jsp.unicrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jsp.unicrud.entity.University;
import com.jsp.unicrud.util.JPAUtil;

public class UniDao {
	private static EntityManager em=JPAUtil.getEm();
	
	public static void save(University u) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(u);
		et.commit();
	}
	
	public static List<University> getAll(){
		Query query = em.createQuery("FROM University");
		List <University> list = query.getResultList();
		return list;
	}
	
	public static void delete(int id) {
		EntityTransaction et = em.getTransaction();
		University uni = em.find(University.class, id);
		et.begin();
		em.remove(uni);
		et.commit();
	}

	public static void edit(int id, String name) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		University uni=em.find(University.class, id);
		uni.setName(name);
		et.commit();
		
	}
	

	public static University getUni(String name) {
		Query query = em.createQuery("FROM University WHERE name= :name");
		query.setParameter("name", name);
		return (University)query.getSingleResult();
	
	}
	
	
	
	
	
	
}
