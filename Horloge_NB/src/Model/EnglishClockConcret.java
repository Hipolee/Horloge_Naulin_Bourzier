package Model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EnglishClockConcret extends Clock {
	
	public EnglishClockConcret(DateTimeFormatter formatter) {
		String timeStamp = LocalTime.now().toString();
		temps = LocalTime.parse(timeStamp, formatter);
		refreshFrequency = 1;
	}
}
