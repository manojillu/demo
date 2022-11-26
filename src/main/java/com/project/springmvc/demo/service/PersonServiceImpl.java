package com.project.springmvc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.springmvc.demo.bean.Persons;
import com.project.springmvc.demo.repository.PersonalDetailsRepository;

@Service
public class PersonServiceImpl extends BaseServiceImpl{
	
	@Autowired
	PersonalDetailsRepository detailsRepository;

	
	public List<Persons> getDetails(){
		List<Persons> personsList=detailsRepository.getAllPersonDetails();
		return personsList;
	}

}
