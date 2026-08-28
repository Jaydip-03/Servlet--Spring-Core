package com.jsp.LaptopCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jsp.EmpCrud.entity.Employee;
import com.jsp.LaptopCrud.entity.Laptop;
import com.jsp.LaptopCrud.util.JPAutil;
import com.jsp.bankcrud.entity.Bank;

public class LaptopDAO {
	static EntityManager em = JPAutil.getEm();
	
	public static void save(Laptop e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
		
	}
	
	
	public static List<Laptop> getAll() {
		return em.createQuery("FROM Laptop").getResultList();
	}
	
	
	public static void updateLap(int id , String name) {
		Laptop l1 = em.find(Laptop.class, id);
		l1.setName(name);
		
		em.getTransaction().begin();
		em.merge(l1);
		em.getTransaction().commit();
		
	}
	
	
	public static void deleteById (int  id) {
      Laptop l3 = em.find(Laptop.class, id);
		
		em.getTransaction().begin();
		em.remove(l3);
		em.getTransaction().commit();
		
		
	}
	
	
	public static Laptop getByName(String name) {
		Query query = em.createQuery("FROM Laptop WHERE name=:name");
		query.setParameter("name", name);
		Object singleResult = query.getSingleResult();
		return (Laptop)singleResult;
	}

}
