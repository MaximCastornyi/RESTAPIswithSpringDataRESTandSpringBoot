package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.SubjectsLearning;

@Repository
public interface SubjectsLearningRepository extends JpaRepository<SubjectsLearning, Long> {

}
