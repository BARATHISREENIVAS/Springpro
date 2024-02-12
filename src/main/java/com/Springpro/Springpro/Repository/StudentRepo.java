package com.Springpro.Springpro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springpro.Springpro.Entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
