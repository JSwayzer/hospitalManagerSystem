package br.com.fiap.hms.testes;

import javax.persistence.Persistence;

public class ConexaoBanco {

	public static void main(String[] args) {
		/*
		 * Com o método comentado abaixo se cria primeiro a fábrica e, logo após, o Gerenciador de Entidades
		 * 
		 * EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("hospitalManagerSystem");
		 * EntityManager em = fabrica.createEntityManager();
		 * 
		 */
		
		/*
		 * Com o método abaixo se cria a fábrica e o gerenciador de entidades na mesma linha 
		 */
		Persistence.createEntityManagerFactory("hospitalManagerSystem").createEntityManager();
	}

}
