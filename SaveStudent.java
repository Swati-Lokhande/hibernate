package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev"); //Persistence-Unit name from persistence.xml
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s1=new Student();
		s1.setId(110);
		s1.setName("geeta");
		s1.setPhno(987650043L);

		Student s2=new Student();
		s2.setId(116);
		s2.setName("seeta");
		s2.setPhno(966621045L);
		
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		et.commit();
		System.out.println("Student data stored successfully !");
		
		
	}
}
