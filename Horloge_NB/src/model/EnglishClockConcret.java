package model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EnglishClockConcret extends Clock {
	
	public EnglishClockConcret(DateTimeFormatter formatter) {
		String timeStamp = LocalTime.now().format(formatter).toString();
		this.setTemps(LocalTime.parse(timeStamp));
		this.setRefreshFrequency(1);
	}
}
