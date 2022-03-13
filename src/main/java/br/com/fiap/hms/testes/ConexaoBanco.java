package br.com.fiap.hms.testes;

import javax.persistence.Persistence;

public class ConexaoBanco {

	public static void main(String[] args) {
		//EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("hospitalManagerSystem");
		//EntityManager em = fabrica.createEntityManager();
		Persistence.createEntityManagerFactory("hospitalManagerSystem").createEntityManager();
	}

}
