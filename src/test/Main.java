package test; 

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence; 
import br.com.ifpb.modelo.Autor;


public class Main { 
	
	public static void main (String[] args){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("teste_projeto_bd2"); 
		EntityManager manager = factory.createEntityManager(); 
		
		Autor autor = new Autor();
		autor.setNome("Machado de Assis");
		
		manager.getTransaction().begin();
		manager.persist(autor);
		manager.getTransaction().commit();
	} 
}
