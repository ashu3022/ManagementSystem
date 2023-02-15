package com.studentMangementSystem.ManagementSystem;

import com.studentMangementSystem.ManagementSystem.entity.Student;
import com.studentMangementSystem.ManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student=new Student("Anuj","Mehta","annu@gamil.com");
		studentRepository.save(student);
		Student student1=new Student("Kamal","Hasan","lamaml@gmail.comm");
		studentRepository.save(student1);
	}
}
