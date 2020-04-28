package com.cg.iter.service;

import com.cg.iter.bean.Student;

public interface StudentService {

	boolean create(Student stud);

	Student getStudent(int id);

	boolean update(Student stud);

	boolean delete(Student stud);

}
