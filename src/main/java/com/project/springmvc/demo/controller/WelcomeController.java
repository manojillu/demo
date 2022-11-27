package com.project.springmvc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.springmvc.demo.bean.Persons;
import com.project.springmvc.demo.service.PersonServiceImpl;

@RestController
public class WelcomeController {
	
	@Autowired
	private PersonServiceImpl personServiceImpl;

	
	@GetMapping(value="/",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Persons>> getWelcomeDetails() {
		List<Persons> detailsList=personServiceImpl.getDetails();
		return new ResponseEntity<>(detailsList,HttpStatus.OK);
	} 

	@GetMapping(value="/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Persons> getWelcomeDetailsById(@PathVariable int id) {
		Persons persons=personServiceImpl.getPersonDetailById(id);
		return new ResponseEntity<>(persons,HttpStatus.OK);
	} 
	
	@PostMapping(value = "/savePerson",consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void insertPersonDetails(@RequestBody Persons persons) {
		personServiceImpl.insertPersonDetails(persons);
	}
	
	@PutMapping(value = "/updatePerson",consumes = {MediaType.APPLICATION_JSON_VALUE})
	public void updatePersonDetails(@RequestBody Persons persons) {
		personServiceImpl.updatePersonDetails(persons);
	}
	
	@DeleteMapping(value = "/deletePerson/{id}")
	public void deletePerson(@PathVariable int id) {
		personServiceImpl.deletePerson(id);
	}
}
