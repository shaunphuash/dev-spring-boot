package com.shaundemo.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define a private field for the dependency
    private Coach myCoach;

    //define a constructor for the dependency injection
    @Autowired
    public DemoController(Coach theCoach) {
        //make the assignment
        myCoach = theCoach;
    }

    //Add endpoint
    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
