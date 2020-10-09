package com.ensup.demoJpaOneToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domaine.Formateur;
import domaine.Formation;

public class DemoJpaOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("demoJpaOneToMany");
	EntityManager em = emf.createEntityManager();
	
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	
	Formation formation = new Formation("Hibernate");
	Formateur formateur1 = new Formateur("Sall","Cheikhna",8);
	Formateur formateur2 = new Formateur("Mbiandou","Douglas",12);
	
	formation.getFormateurs().add(formateur1);
	formation.getFormateurs().add(formateur2);

	em.persist(formateur1);
	em.persist(formateur2);
	em.persist(formation);
	
	tx.commit();
	
	em.close();
	emf.close();
}
	
}
