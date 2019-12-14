package com.hiberspring.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for dependencies
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	} 
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 mins on batting practice.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
