package com.jsp.bankcrud.dao;

import java.util.List; 

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.jsp.bankcrud.entity.Bank;
import com.jsp.bankcrud.util.JPAUtil;

public class BankDao {
	
	public static EntityManager em = JPAUtil.em();
	
	public static void register(Bank b) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(b);
		et.commit();
	}
	
	public static List<Bank> getAll(){
		Query q = em.createQuery("FROM Bank");
		List<Bank> list = q.getResultList();
		return list;
	}
	
	public static void deleteById(int id) {
		EntityTransaction et = em.getTransaction();
		Bank find = em.find(Bank.class, id);
		et.begin();
		em.remove(find);
		et.commit();
	}
	public static void updateById(int id , String location) {
		EntityTransaction et = em.getTransaction();
		Bank find = em.find(Bank.class, id);
		et.begin();
		find.setLocation(location);
		et.commit();
	}
	
	
	
	
	public static Bank getByName(String name) {
		Query query = em.createQuery("FROM Bank WHERE name=:name");
		query.setParameter("name", name);
		Object singleResult = query.getSingleResult();
		return (Bank)singleResult;
	}
	
	
}
