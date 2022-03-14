package br.com.fiap.hms.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.hms.domain.Unidade;

public class UnidadeInserirTest {

	public static void main(String[] args) {
		
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("hospitalManagerSystem").createEntityManager();
			em.getTransaction().begin();
			Unidade unid = new Unidade();
			unid.setNome("Hospital dos Anjos");
			unid.setCpnj(1212345612);
			unid.setEndereco("Rua dos Ceus");
			unid.setNumeroEndereco("42");
			em.persist(unid);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if(em != null) {
				em.close();
			}

		}

	}

}
