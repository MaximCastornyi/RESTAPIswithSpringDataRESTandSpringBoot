package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> { //long- Long id;

}
