package br.com.fiap.hms.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.hms.domain.Paciente;

public class TesteBusca {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("hospitalManagerSystem");
		EntityManager em = fabrica.createEntityManager();
		
		Paciente paciente = em.find(Paciente.class, 1);
		
		System.out.println(paciente.getCodigo() +" "+ paciente.getNome());
		
		em.close();
		fabrica.close();
	}

}
