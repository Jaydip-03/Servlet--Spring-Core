package com.jsp.CollegeCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.jsp.CollegeCrud.entity.College;
import com.jsp.CollegeCrud.util.JPAutil;

public class CollegeDAO {
	
	static EntityManager em = JPAutil.getEm();
	
	public static void save(College c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
	}
	
	
	public static List<College> getAll() {
		return em.createQuery("From College").getResultList();
	}
	
	public static void updateCollege(int id, String name) {
		 College clg = em.find(College.class, id);
		 clg.setName(name);
		 em.getTransaction().begin();
		 em.merge(clg);
		 em.getTransaction().commit();
	}
	
	
	public static void deleteCollege(int id) {
		College clg1 = em.find(College.class, id);
		em.getTransaction().begin();
		em.remove(clg1);
		em.getTransaction().commit();
	}

}
