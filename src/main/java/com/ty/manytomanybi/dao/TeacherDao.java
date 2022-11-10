package com.ty.manytomanybi.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomanybi.dto.Student;
import com.ty.manytomanybi.dto.Teacher;

public class TeacherDao {
	public static void main(String[] args) {
		
	
	Teacher t1=new Teacher();
	t1.setStaffId(01);
	t1.setName("sagar");
	t1.setDesignation("hod");
	t1.setTeachingSub("java");

	Teacher t2=new Teacher();
	t2.setStaffId(02);
	t2.setName("nala");
	t2.setDesignation("classteacher");
	t2.setTeachingSub("adv java");

	Teacher t3=new Teacher();
	t2.setStaffId(03);
	t2.setName("simba");
	t2.setDesignation("dean");
	t2.setTeachingSub("html");
	
	Student s1=new Student();
	s1.setId(10);
	s1.setName("ramu");
	s1.setPhno(1234);
	
	Student s2=new Student();
	s2.setId(20);
	s2.setName("raju");
	s2.setPhno(5236);
	
	Student s3=new Student();
	s3.setId(30);
	s3.setName("sanjay");
	s3.setPhno(6569);
	

	List<Teacher> lt1=new ArrayList<Teacher>();
	lt1.add(t1);
	lt1.add(t3);
	s1.setTeachers(lt1);
	
	List<Teacher> lt2=new ArrayList<Teacher>();
	lt2.add(t2);
	lt2.add(t3);
	s2.setTeachers(lt2);
	
	List<Teacher> lt3=new ArrayList<Teacher>();
	lt3.add(t1);
	lt3.add(t2);
	s3.setTeachers(lt3);
	
	List<Student> ls1=new ArrayList<Student>();
	ls1.add(s1);
	ls1.add(s3);
	t1.setStudents(ls1);
	
	List<Student> ls2=new ArrayList<Student>();
	ls2.add(s2);
	ls2.add(s3);
	t2.setStudents(ls2);
	
	List<Student> ls3=new ArrayList<Student>();
	ls3.add(s1);
	ls3.add(s2);
	t3.setStudents(ls3);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sagar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(s1);
	entityManager.persist(s2);
	entityManager.persist(s3);
	entityManager.persist(t1);
	entityManager.persist(t2);
	entityManager.persist(t3);
	
	entityTransaction.commit();
	}}

	
