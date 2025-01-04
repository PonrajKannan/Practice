package com.project.Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddData {
	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
//		Student student = new Student();
//		student.setStudentId(1);
//		student.setStudentName("Praveen");
//		
//		Subject subject = new Subject();
//		subject.setSubjectId(1001);
//		subject.setSubjectName("Java");
//		
//		session.save(subject);
//		session.save(student);
//		
//		Student student1 = new Student();
//		student1.setStudentId(2);
//		student1.setStudentName("Kavya");
//		
//		Subject subject1 = new Subject();
//		subject1.setSubjectId(1002);
//		subject1.setSubjectName("MySQL");
//		
//		session.save(subject1);
//		session.save(student1);
		
		Student student1 = (Student) session.get(Student.class, 1);
		Student student2 = (Student) session.get(Student.class, 2);
		
		Subject subject1 = (Subject) session.get(Subject.class, 1001);
		Subject subject2 = (Subject) session.get(Subject.class, 1002);
		
		student1.getStudentSubject().add(subject1);
		student1.getStudentSubject().add(subject2);
		
		student2.getStudentSubject().add(subject1);
 		student2.getStudentSubject().add(subject2);
 		
 		session.save(student1);
 		session.save(student2);
 		
		tx.commit();
		sf.close();
		
		System.out.println("Success...");

	}
}
