package com.hibernate.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonAdharCardDriver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		
//		Person person=em.find(Person.class, 101);
//		AdharCard card= em.find(AdharCard.class,123456789);
//		
		
		Person person=new Person();
		person.setAge(24);
		person.setId(103);
		person.setName("mitata");
		
		AdharCard card= new AdharCard();
		card.setName("mitata");
		card.setAddress("solapur");
		card.setAdharNo(987661779);
		
		
//		Giving the adharcard object to person
		
		person.setAdharCard(card);
		et.begin();
//		em.remove(person);
//		em.remove(card);
		em.persist(card);
		em.persist(person);
		
		et.commit();
//		System.out.println("deleted");
		
		System.out.println("saved");
	}
}
