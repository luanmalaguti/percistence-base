package com.persistence.bean;

import java.io.Serializable;
/**
 * Interface a ser implementada pelos beans
 * 
 * @author Luan Malaguti
 */
public interface Bean extends Serializable{
	
	Long getId();
	
	void setId(Long id);
}
