package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.entity.StudentEntity;

@Configuration
public class ValidatorImpl implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {
		StudentEntity student = (StudentEntity) target;
		if(student.getFirstName() == null || student.getFirstName().isEmpty()) {
			errors.rejectValue("firstName", "", "First name is required");
		}
	}

}
