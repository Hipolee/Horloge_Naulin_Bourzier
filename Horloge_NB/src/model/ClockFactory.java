package model;

import java.time.format.DateTimeFormatter;

public abstract class ClockFactory {
	private DateTimeFormatter formatter;
	
	public DateTimeFormatter getFormatter() {
		return formatter;
	}

	public void setFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
	}
	
	public abstract Clock fabriqueClock();
}
