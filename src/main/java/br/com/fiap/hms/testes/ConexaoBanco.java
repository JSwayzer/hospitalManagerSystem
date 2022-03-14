package br.com.fiap.hms.testes;

import javax.persistence.Persistence;

public class ConexaoBanco {

	public static void main(String[] args) {
		/*
		 * Com o m�todo comentado abaixo se cria primeiro a f�brica e, logo ap�s, o Gerenciador de Entidades
		 * 
		 * EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("hospitalManagerSystem");
		 * EntityManager em = fabrica.createEntityManager();
		 * 
		 */
		
		/*
		 * Com o m�todo abaixo se cria a f�brica e o gerenciador de entidades na mesma linha 
		 */
		Persistence.createEntityManagerFactory("hospitalManagerSystem").createEntityManager();
	}

}
