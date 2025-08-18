
// 1st method run application by JAR file
// Create the JAR file for our application
./mvnw package

// JAR is created in the "target" sub-directory
// mvnw allow you to run a Maven project
//   - No need to have Maven installed or present on your path
//   - If correct version of Maven is NOT found on your computer
//	- Automatically downloads correct version and runs Maven

cd target
ls *.jar

// Running my JAR file
java -jar xxxxxxxx.jar


// 2nd method, run app using Spring Boot Maven plugin
Cd ..
./mvnw spring-boot:run