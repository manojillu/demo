package com.project.springmvc.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import com.project.springmvc.demo.entity.Persons;
import com.project.springmvc.demo.model.CustomerDetails;

@Service
public class PersonServiceImpl extends BaseServiceImpl{

	
	@SuppressWarnings("unchecked")
	public List<CustomerDetails> getDetails(){
		List<CustomerDetails> detailsList=new ArrayList<>();
		Query<Persons> personsList=getSessionDetails().getNamedQuery("getAllPersons");
		buildCustomerDetail(detailsList,personsList.list());
		return detailsList;
	}

	private void buildCustomerDetail(List<CustomerDetails> detailsList, List<Persons> list) {
		for(Persons person:list) {
			CustomerDetails details=new CustomerDetails();
			details.setfName(person.getFirstName());
			details.setlName(person.getLastName());
			details.setEmail(person.getEmail());
			details.setPno(person.getPhone());
			detailsList.add(details);
		}
		
	}

}
