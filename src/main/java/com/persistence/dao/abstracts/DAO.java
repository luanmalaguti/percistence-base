package com.persistence.dao.abstracts;

import java.util.List;

/**
 * Create your custom DAO interfaces extending this one.
 * 
 * @author Luan Malaguti
 * 
 * @param <T> Bean
 */
public interface DAO<T> {
	void save(T t);
	
	void delete(T t);
	
	void update(T t);

	List<T> list();
}
