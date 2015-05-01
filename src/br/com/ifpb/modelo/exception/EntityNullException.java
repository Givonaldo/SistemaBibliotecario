package br.com.ifpb.modelo.exception;

public class EntityNullException extends Exception {
	
	public EntityNullException(){
		super("Entidade Nula: Erro ao acessar a entidade");
	}
	
}
