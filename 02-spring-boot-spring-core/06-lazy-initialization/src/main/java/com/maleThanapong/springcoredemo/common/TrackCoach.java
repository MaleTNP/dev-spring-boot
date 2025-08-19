package com.maleThanapong.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// Mark TrackCoach as @Lazy, Since we area NOT injecting TrackCoach, it is not initialized
/* Note: Lazy Initialization - (need to) set up global configuration
   We can set up on the application.properties
*/
@Lazy
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
