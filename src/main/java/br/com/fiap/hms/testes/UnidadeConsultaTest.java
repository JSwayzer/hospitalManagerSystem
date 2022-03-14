package br.com.fiap.hms.testes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.hms.domain.Unidade;

public class UnidadeConsultaTest {

	public static void main(String[] args) {
		
		EntityManager em = null;
		
		try {
			
			int idProcurado = 1;
			
			em = Persistence.createEntityManagerFactory("hospitalManagerSystem").createEntityManager();
			Unidade unid = em.find(Unidade.class, idProcurado);
			
			System.out.println("Unidade de atendimento encontrada: " + unid);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			if(em != null) {
				em.close();
			}

		}

	}

}
