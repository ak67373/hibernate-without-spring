package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domain.Hobby;
import domain.User;

public class TestJpaPersistence {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = emf.createEntityManager();
		
//		User u = new User("pradeep", "a@a.c");
//		Hobby h1 = new Hobby("reading", 20);
//		Hobby h2 = new Hobby("UFO watch", 2);
//		
//		u.getHobbies().add(h1); u.getHobbies().add(h2);
//		//u,h1,h2 is in new/transient
//		
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		//u,h1,h2 is in new/transient
//		em.persist(u);
//		//u,h1,h2 is in managed/persistent
//		tx.commit();
//		em.close();
//		//u,h1,h2 is in detached
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		System.out.println("About to fetch user");
		User u = em.find(User.class, 5);
		System.out.println("Finished fetching user");
		//u is in managed
		
		
		tx.commit();
		em.close();
		// u is detached
		System.out.println("How many hobbies for this user? "+u.getHobbies().size());
	}

}
