package br.com.ifpb.dao;

import br.com.ifpb.modelo.exception.EntityNullException;


public interface Dao<T> {
	
	public void add(T obj) throws Exception;
	
	public T read(long codigo) throws Exception;
	
	public void remove(T obj) throws EntityNullException;
	
	public void upDate(T obj, long codigo) throws EntityNullException;

}
