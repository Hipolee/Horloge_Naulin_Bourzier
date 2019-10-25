package Model;

import java.time.format.DateTimeFormatter;

public class SimpleClockFactory extends ClockFactory {
	
	SimpleClockFactory(){
		
	}
	
	@Override
	public Clock fabriqueClock() {
		formatter = DateTimeFormatter.ofPattern("HH:mm");
		Clock temp = new SimpleClockConcret(formatter);
		return temp;
	}

}
