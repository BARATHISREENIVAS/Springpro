package com.Springpro.Springpro.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping("/getStudent")
	public List<Student> getDetails(){
		return studentService.getAllDetails();
	}
	@GetMapping("/getStudentById/{id}")
	public Student getDetailsById(@PathVariable int id) {
		return studentService.getStudentDetailsById(id);
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudentDetails(@RequestBody Student student) {
		return studentService.updateDetails(student);
	}
	

	@DeleteMapping("/deleteStudent/{id}")
	public String deleteFunction(@PathVariable int id) {
		return studentService.deleteDetails(id);
	}
}
