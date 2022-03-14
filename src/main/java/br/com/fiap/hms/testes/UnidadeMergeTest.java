package br.com.fiap.hms.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.hms.domain.Unidade;

public class UnidadeMergeTest {
	public static void main(String[] args) {

		EntityManager em = null;
		
		try {
			
			em = Persistence.createEntityManagerFactory("hospitalManagerSystem").createEntityManager();
			Unidade unid = new Unidade();
			
			unid.setCodigo(1);
			unid.setNome("Hospital e Pronto Socorro do Ceu");
			unid.setCpnj(1212345612);
			unid.setEndereco("Rua dos Ceus");
			unid.setNumeroEndereco("42");
			em.merge(unid);
			em.getTransaction().begin();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
}
