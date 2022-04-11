package com.example.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import com.example.entity.StudentEntity;

//@Repository
@RepositoryRestResource(path = "std", collectionResourceRel = "stds")
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

	@RestResource(path = "email", exported = false)
	public StudentEntity findByEmail(String email);
	
	public List<StudentEntity> findByFirstName(String firstName);
	
	public List<StudentEntity> findByFirstNameAndLastName(String firstName, String lastName);
	
	public Page<StudentEntity> findByFirstNameOrLastName(String firstName, String lastName, Pageable pageable);
}
