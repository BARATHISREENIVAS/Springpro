package com.Springpro.Springpro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	public Student postDetails(@RequestBody Student student) {
		return studentService.saveDetails(student);
		
	}
}
