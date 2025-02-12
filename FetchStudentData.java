package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchStudentData {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student Student=em.find(Student.class, 101);
		System.out.println(Student.getId());
		System.out.println(Student.getName());
		System.out.println(Student.getPhno());
		
		et.begin();
		em.persist(Student);
		et.commit();
	}
}
