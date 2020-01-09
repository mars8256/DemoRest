package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.PersonaDAOImpl;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private PersonaDAOImpl dao;
	
	@Override
	public void crear() {
		dao.crear();
		
	}

}
