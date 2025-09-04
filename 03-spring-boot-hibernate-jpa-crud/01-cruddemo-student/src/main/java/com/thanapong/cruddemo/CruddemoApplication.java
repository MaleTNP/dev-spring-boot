package com.thanapong.cruddemo;

import com.thanapong.cruddemo.dao.StudentDAO;
import com.thanapong.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	// step1: Create Command Line App
	@Bean
	/* Command Line Runner from the Spring Boot framework,
	   this little snippet of code will be executed after spring been loaded,
	   and we can use it within this given method.
	 */
	// step3: Inject StudentDAO by revise the argument of the commandLineRunner to StudentDAO type
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		/* This is a Java Lambda expression, it's imply like a shortcut
		    notation for providing an implementation of command line
		    runner interface. Just some really nice shorthand notation
		    for creating an implementation for a command line runner
		 */
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Create new student object ...");
		Student tempStudent = new Student("Paul", "Doe", "paul@outlook.com");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());

	}

}
