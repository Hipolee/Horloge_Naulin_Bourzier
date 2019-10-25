package Model;

import java.time.format.DateTimeFormatter;

public class EnglishClockFactory extends ClockFactory {
	
	EnglishClockFactory(){
		
	}
	
	@Override
	public Clock fabriqueClock() {
		formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		Clock temp = new EnglishClockConcret(formatter);
		return temp;
	}

}
