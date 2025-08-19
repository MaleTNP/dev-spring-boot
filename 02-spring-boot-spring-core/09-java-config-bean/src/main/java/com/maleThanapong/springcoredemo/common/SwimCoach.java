package com.maleThanapong.springcoredemo.common;

/* We not using @Component on purpose
   We can't find the SwimCoach because it is not annotated with @Component
   We will use an alternate solution
   For the real world project example, whole idea of making use of the Bean annotation is
   to take an existing third-party class and then wrap it and expose it as a bean that we
   can use in our Spring applications
   step1: Create @Configuration class by Create new package: com.male... .config
 */
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
