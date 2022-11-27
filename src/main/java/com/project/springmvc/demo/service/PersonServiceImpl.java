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


	public Persons getPersonDetailById(int id) {
		return detailsRepository.getPersonDetailsById(id);
	}

	public void insertPersonDetails(Persons persons) {
		persons.setPersonId(detailsRepository.getMaxId()+1);
		detailsRepository.insertPersonDetails(persons);
	}
	
	public void updatePersonDetails(Persons person) {
		detailsRepository.updatePersonDetails(person);
	}
	
	public void deletePerson(int id) {
		detailsRepository.deletePerson(id);
	}
}
