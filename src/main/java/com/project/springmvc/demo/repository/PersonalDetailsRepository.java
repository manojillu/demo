package com.project.springmvc.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.project.springmvc.demo.bean.Persons;

@Mapper
public interface PersonalDetailsRepository {
	
	@Select("select * from persons")
	public List<Persons> getAllPersonDetails();
	
	@Select("select * from persons where personId= #{id}")
	public Persons getPersonDetailsById(int id);
	
	
	@Select("select max(personId) from persons")
	public int getMaxId();
	
	@Insert("insert into persons values (#{personId},#{firstName},#{lastName},#{email},#{phone})")
	public void insertPersonDetails(Persons persons);
	
	@Update("update persons set firstName=#{firstName},lastName=#{lastName},email=#{email},phone=#{phone} where personId=#{personId}")
	public void updatePersonDetails(Persons person);
	
	@Delete("delete from persons where personId=#{id}")
	public void deletePerson(int id);
	
	

}
