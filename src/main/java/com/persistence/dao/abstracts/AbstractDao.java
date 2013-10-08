package com.persistence.dao.abstracts;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.persistence.bean.Bean;
import com.persistence.dao.em.PersistenceUtil;

/**
 *  Create your specific DAO extending this class
 * 
 * @author Luan Malaguti
 */
public class AbstractDao<T extends Bean> implements DAO<T> {
	
	private final EntityManager em;
	private final Class<T> clazz;
	
	public AbstractDao(Class<T> clazz) {
		this.em = PersistenceUtil.getInstance();
		this.clazz = clazz;
	}

	@Override
	public void save(T t) {
		em.getTransaction().begin();
		
		if(t.getId() == null)
			em.persist(t);
		else
			em.merge(t);
		
		em.getTransaction().commit();
	}
	
	@Override
	public void update(T t) {
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
	}

	@Override
	public void delete(T t) {
		em.getTransaction().begin();
		em.remove(t);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<T> list() {
		System.out.println("select e from " + clazz.getSimpleName() + " e");
		TypedQuery<T> q = em.createQuery("select e from " + clazz.getSimpleName() + " e", clazz);
		return q.getResultList();
	}
}
