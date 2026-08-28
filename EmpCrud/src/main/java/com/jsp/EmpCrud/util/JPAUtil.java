package com.jsp.EmpCrud.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private JPAUtil() {
		
	}
	
	public static EntityManager getEm() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jsp");
		EntityManager em = emf.createEntityManager();
		
		return em ;
	}
	

}
