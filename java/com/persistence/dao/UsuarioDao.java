package com.persistence.dao;

import com.persistence.bean.Usuario;
import com.persistence.dao.abstracts.AbstractDao;

/**
 * DAO especifico de Usuario
 * 
 * @author Luan Malaguti
 */
public class UsuarioDao extends AbstractDao<Usuario> {

	public UsuarioDao(Class<Usuario> clazz) {
		super(clazz);
	}
}
