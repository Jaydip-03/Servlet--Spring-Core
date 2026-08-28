package com.jsp.CollegeCrud.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
	
	private JPAutil() {
		
	}
	
	public static EntityManager getEm() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jsp");
		EntityManager em = emf.createEntityManager();
		return em ;
	}

}
