package com.shaundemo.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice free kicks for 20 minutes";
    }
}
