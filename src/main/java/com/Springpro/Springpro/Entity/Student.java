package com.Springpro.Springpro.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="Student_DB")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private int id;
	
	@Column(name="ST_mark")
	private int mark;
	
	@Column(name="NAME")
	private String name;
}
