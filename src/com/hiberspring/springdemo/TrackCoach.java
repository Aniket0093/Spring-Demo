package com.hiberspring.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:" + fortuneService.getFortune();
	}

	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside method doMyStartupStuff"); 
	}
	
	public void doMyCleanupStuff(){
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}
}
