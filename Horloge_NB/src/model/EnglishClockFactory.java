package model;

import java.time.format.DateTimeFormatter;

public class EnglishClockFactory extends ClockFactory {
	
	public EnglishClockFactory(){
		
	}
	
	@Override
	public Clock fabriqueClock() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		Clock temp = new EnglishClockConcret(formatter);
		return temp;
	}

}
