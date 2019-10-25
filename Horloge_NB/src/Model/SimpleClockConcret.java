package Model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SimpleClockConcret extends Clock {
	
	public SimpleClockConcret(DateTimeFormatter formatter) {
		String timeStamp = LocalTime.now().toString();
		temps = LocalTime.parse(timeStamp, formatter);
		refreshFrequency = 60;
	}
}
