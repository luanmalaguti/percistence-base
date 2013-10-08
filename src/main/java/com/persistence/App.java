package com.persistence;

import com.persistence.bean.Usuario;
import com.persistence.dao.UsuarioDao;


public class App
{
	
    public static void main( String[] args )
    {
    	UsuarioDao dao = new UsuarioDao(Usuario.class);
    	    	
    	Usuario u = new Usuario();
    	u.setEmail("luan@gmail.com");
    	u.setNome("Luan");
    	
    	Usuario u2 = new Usuario();
    	u2.setEmail("luan@gmail.com");
    	u2.setNome("lola sos");
    	
    	Usuario u3 = new Usuario();
    	u3.setEmail("luan@gmail.com");
    	u3.setNome("mano sos");
    	
    	dao.save(u);
    	dao.save(u2);
    	dao.save(u3);
    	
    	for(Usuario l : dao.list()){
    		System.out.println(l.getNome());
    	}
    	
    }
}
