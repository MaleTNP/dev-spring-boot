/* Step2: Create Demo REST Controller */
package com.maleThanapong.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    /* Step3: Create a constructor in your class for injections */
    // define a private field for the dependency
    private Coach myCoach;

    // define a constructor for dependency injection
    // @Autowired annotation tells Spring to inject a dependency
    // Note: If you only have one constructor then @Autowired on constructor is optional
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    /* Step4: Add @Getmapping for /dailyworkout */
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
