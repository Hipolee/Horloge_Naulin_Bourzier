package model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SimpleClockConcret extends Clock {
	
	public SimpleClockConcret(DateTimeFormatter formatter, int refreshFreq) {
		String timeStamp = LocalTime.now().format(formatter).toString();
		this.setTemps(LocalTime.parse(timeStamp));
		this.setRefreshFrequency(refreshFreq);
	}
}
