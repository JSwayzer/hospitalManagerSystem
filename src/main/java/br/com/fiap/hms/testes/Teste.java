package br.com.fiap.hms.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.hms.domain.Paciente;

public class Teste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("hospitalManagerSystem");
		EntityManager em = fabrica.createEntityManager();
		
		Paciente paciente = new Paciente();
		paciente.setNome("Johnny");
		
		try {
			em.persist(paciente);
			em.getTransaction().begin();
			
			
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
				System.out.println("##################Deu Erro!!!##################");
			}
		}
		
		
		em.close();
		fabrica.close();
	}

}
