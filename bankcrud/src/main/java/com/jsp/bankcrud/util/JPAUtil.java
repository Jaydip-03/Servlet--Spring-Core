package com.jsp.bankcrud.util;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private JPAUtil() {
		// TODO Auto-generated constructor stub
	}
	
	public static EntityManager em() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jsp");
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
