package com.hibernate;
 
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		
		Query query=  em.createQuery("Select s from Student s");
		
		List<Student> students=query.getResultList();
		
		for(Student allStudents: students)
		{
			System.out.println(allStudents.getId());
			
			System.out.println(allStudents.getName());
			System.out.println(allStudents.getPhno()+"\n");
		}
		
		System.out.println("Suceessfully get all students data");
	}
}
