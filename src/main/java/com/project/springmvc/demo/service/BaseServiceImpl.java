package com.project.springmvc.demo.service;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl implements IBaseService{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Session getSessionDetails() {
		return entityManager.unwrap(Session.class);
	}

}
