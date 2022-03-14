package br.com.fiap.hms.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.hms.domain.Unidade;

public class UnidadeAlterarTest {

	public static void main(String[] args) {
		
		EntityManager em = null;

		try { 
			
			int idProcurado = 1;
			
			em = Persistence.createEntityManagerFactory("hospitalManagerSystem").createEntityManager();
			Unidade unid = em.find(Unidade.class, idProcurado);
			
			
			em.getTransaction().begin();
			unid.setNome("Hospital do Ceu - Alterado");
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			if (em != null && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		
	}

}
