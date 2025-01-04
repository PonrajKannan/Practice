package com.project.Mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration con = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
//		Student student = new Student();
//		student.setStudentId(2);
//		student.setStudentName("Praveen");
//		
//		Subject subject = new Subject();
//		subject.setSubjectId(1001);
//		subject.setSubjectName("Java");
//		
//		student.getStudentSubject().add(subject);
//		subject.setStudent(student);
		
		// Test
		
		Student student = (Student) session.get(Student.class, 2);
		
		Subject subject = new Subject();
		subject.setSubjectId(1002);
		subject.setSubjectName("MySQL");
		
		student.getStudentSubject().add(subject);
		subject.setStudent(student);
		
		session.save(subject);
		session.save(student);
 		
		tx.commit();
		sf.close();
		
		System.out.println("Success...");

	}
}
