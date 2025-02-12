package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
	    EntityTransaction et= em.getTransaction();
	    
	   Student student= em.find(Student.class, 110);
	   
	   if(student!=null)
	   {
		   student.setName("aarti");
		   
	   }
	   
	   et.begin();
	   em.persist(student);
	   et.commit();
	   
	   System.out.println("updated");
	   
	}
}
