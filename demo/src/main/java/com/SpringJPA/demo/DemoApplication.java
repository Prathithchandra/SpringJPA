package com.SpringJPA.demo;

import com.SpringJPA.demo.model.Student;
import com.SpringJPA.demo.repo.studentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Student s1 = context.getBean(Student.class);
		s1.setRollNo(101);
		s1.setName("Prathith");
		s1.setMarks(100);
		Student s2 = context.getBean(Student.class);
		s2.setRollNo(102);
		s2.setName("Samartha");
		s2.setMarks(99);
		Student s3 = context.getBean(Student.class);
		s3.setRollNo(103);
		s3.setName("Shrisha");
		s3.setMarks(100);
		studentRepo repo = context.getBean(studentRepo.class);
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);

	}

}
