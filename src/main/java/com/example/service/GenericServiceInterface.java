package com.example.service;

import com.example.exception.ApplicationException;

public interface GenericServiceInterface<T> {
	
	public T create(T object) throws ApplicationException;
	public T update(T object) throws ApplicationException;
	public T delete(T object) throws ApplicationException;
	

}
