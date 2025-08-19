package com.maleThanapong.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* This enables auto configuration, component scanning, and
additional configuration with Spring Boot.
Behind the scenes, @SpringBootApplication compose of the following
@EnableConfiguration : Enables Spring Boot's auto-configuration support
@ComponentScan: Enables component scanning of current package,
				Also recursively scans sub-packages
@Configuration: Able to register extra beans with @Bean or import
				other configuration classes
 */
/*
@SpringBootApplication(
		scanBasePackages = {"com.maleThanapong.springcoredemo",
							"com.maleThanapong.util"})
 */
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
