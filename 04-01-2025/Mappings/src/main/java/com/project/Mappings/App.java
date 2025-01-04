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
		
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Kavya");
		
		Subject subject = new Subject();
		subject.setSubjectId(1001);
		subject.setSubjectName("Java");
		
		session.save(student);
		session.save(subject);
 		
		tx.commit();
		sf.close();
		
		System.out.println("Success...");

	}
}
