package entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args){
		EntityManagerFactory a = Persistence.createEntityManagerFactory("Prova");
		EntityManager em = a.createEntityManager();
		em.getTransaction().begin();
		a.close();
		
		System.out.println("Criou");
	}
	
}
