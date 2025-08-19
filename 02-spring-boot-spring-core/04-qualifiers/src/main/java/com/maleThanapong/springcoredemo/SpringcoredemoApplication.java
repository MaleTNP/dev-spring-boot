package com.maleThanapong.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
/*		^^^^^^^^^^^^^^^^^^
		 '-- this allows us to Bootstrap your Spring Boot application
		 Behind the scenes ...
		 Creates application context and registers all beans
		 Starts the embedded server Tomcat etc...
 */
	}

}
