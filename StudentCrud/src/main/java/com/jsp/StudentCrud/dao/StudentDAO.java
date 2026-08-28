package com.jsp.StudentCrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jsp.StudentCrud.entity.Student;
import com.jsp.StudentCrud.util.JPAUtil;

public class StudentDAO {
	static EntityManager em = JPAUtil.getEm();
	
	
	// insert
	public static void save(Student s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
	}
	
	public static List<Student> getAll() {
		Query query =  em.createQuery("From Student");
		
		List<Student> list = query.getResultList();
		System.out.println(list);
		return list ;
	}
	
	public static void updateById(int id, String name) {
		
		Student s4 = em.find(Student.class, id);
		s4.setName(name);
		em.getTransaction().begin();
		em.merge(s4);
		em.getTransaction().commit();
		
	}

}
