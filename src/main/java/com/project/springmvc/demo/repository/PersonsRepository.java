package com.project.springmvc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springmvc.demo.entity.Persons;

public interface PersonsRepository extends JpaRepository<Persons, Integer>{

}
