package model;

import java.time.format.DateTimeFormatter;

public class SimpleClockFactory extends ClockFactory {
	
	public SimpleClockFactory(){
		
	}
	
	@Override
	public Clock fabriqueClock() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		Clock temp = new SimpleClockConcret(formatter,60);
		return temp;
	}

}
