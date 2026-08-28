package com.jsp.EmpCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jsp.EmpCrud.entity.Employee;
import com.jsp.EmpCrud.util.JPAUtil;

public class EmpDAO {
	
	static EntityManager em = JPAUtil.getEm();
	
	public static void save(Employee e) {
		
		
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
		
	}
	
	public static List<Employee> getAll() {
		
//		return em.createQuery("FROM EMPLOYEE").getResultList();
		
		Query queru = em.createQuery("FROM Employee");
		List<Employee> list = queru.getResultList();
		System.out.println(list);
		return list ;
		
	}
	
	
	public static void updateById(int id, String name) {
		Employee e1 = em.find(Employee.class, id);
		e1.setName(name);
		
		em.getTransaction().begin();
		em.merge(e1);
		em.getTransaction().commit();
		
	}
	
	
	public static void deleteById(int id) {
		Employee e2 = em.find(Employee.class, id);
		
		em.getTransaction().begin();
		em.remove(e2);
		em.getTransaction().commit();
	}
	

}
