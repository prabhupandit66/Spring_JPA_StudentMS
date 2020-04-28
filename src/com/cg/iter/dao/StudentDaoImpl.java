package com.cg.iter.dao;

import javax.persistence.EntityManager;

import com.cg.iter.bean.Student;
import com.cg.iter.util.JpaUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public boolean create(Student stud) {
		try {
		EntityManager em=JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(stud);
		em.getTransaction().commit();
		
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Student getStudent(int id) {
		Student emp = null;
		try {
		EntityManager em=JpaUtil.getEntityManager();
		emp=em.find(Student.class,id);
		}catch(Exception e)
		{
			
		}
		return emp;
	}

	@Override
	public boolean update(Student stud) {
		try {
			EntityManager em=JpaUtil.getEntityManager();
			em.getTransaction().begin();
			em.merge(stud);
			em.getTransaction().commit();
			return true;
			}catch (NullPointerException e) {
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public boolean delete(Student stud) {
		try {
			EntityManager em=JpaUtil.getEntityManager();
			em.getTransaction().begin();
			em.remove(stud);
			em.getTransaction().commit();
			return true;
			}catch (NullPointerException e) {
				e.printStackTrace();
			}
			return false;
	}
	}


