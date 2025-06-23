package com.Spring.orm.dao;

import java.util.List;

import com.Spring.orm.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public Student get(int studentId);
	public List<Student> getAll();
	public void delete(int studentId);
	public void update(Student student);
}
