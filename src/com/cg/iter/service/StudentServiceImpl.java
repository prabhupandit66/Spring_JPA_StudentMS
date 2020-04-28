package com.cg.iter.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.iter.bean.Student;
import com.cg.iter.dao.StudentDao;

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studDao;

	public StudentServiceImpl() {
		//System.out.println("stud service constr");
	}

	@Override
	public boolean create(Student stud) {
		
		return studDao.create(stud);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studDao.getStudent(id);
	}

	@Override
	public boolean update(Student stud) {
		return studDao.update(stud);
	}

	@Override
	public boolean delete(Student stud) {
		return studDao.delete(stud);
	}
	
	

}
